package core;

import contracts.Executable;
import contracts.Renderable;
import java.util.Objects;
import model.EducationLevel;

public abstract class AbstractPage implements Renderable, Executable {
    private final String title;
    private final ConsoleInput input;
    private final ScholarshipCatalog catalog;

    protected AbstractPage(String title, ConsoleInput input, ScholarshipCatalog catalog) {
        this.title = Objects.requireNonNull(title, "Judul halaman tidak boleh null");
        this.input = Objects.requireNonNull(input, "ConsoleInput tidak boleh null");
        this.catalog = Objects.requireNonNull(catalog, "ScholarshipCatalog tidak boleh null");
    }

    public String getTitle() {
        return title;
    }

    protected ConsoleInput getInput() {
        return input;
    }

    protected ScholarshipCatalog getCatalog() {
        return catalog;
    }

    protected EducationLevel promptEducationLevel() {
        System.out.println("Pilih Status Pendidikan Anda:");
        System.out.println("  1. Siswa (SMA / SMK / MA Sederajat)");
        System.out.println("  2. Mahasiswa (Perguruan Tinggi)");
        int roleChoice = input.readIntInRange("Masukkan pilihan status [1-2]: ", 1, 2);
        return (roleChoice == 1) ? EducationLevel.SISWA : EducationLevel.MAHASISWA;
    }

    protected int promptTerm(EducationLevel level) {
        System.out.printf("\nPilih %s Anda (%s):%n", level.getTermUnit(), level.getLabel());
        for (int t = level.getMinTerm(); t <= level.getMaxTerm(); t++) {
            System.out.printf("  - %s %d%n", level.getTermUnit(), t);
        }
        String prompt = String.format(
                "Masukkan %s [%d-%d]: ",
                level.getTermUnit(),
                level.getMinTerm(),
                level.getMaxTerm());
        return input.readIntInRange(prompt, level.getMinTerm(), level.getMaxTerm());
    }

    @Override
    public void render() {
        System.out.println("\n======================================================================");
        System.out.println("  " + title.toUpperCase());
        System.out.println("======================================================================");
    }

    @Override
    public abstract void execute();
}