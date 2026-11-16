package pages;

import core.AbstractPage;
import core.ConsoleInput;
import core.ScholarshipCatalog;
import java.util.List;
import model.ApplicantCard;
import model.EducationLevel;
import model.Scholarship;

public class ApplicationCardPage extends AbstractPage {
    public ApplicationCardPage(ConsoleInput input, ScholarshipCatalog catalog) {
        super("Buat Kartu Rencana Pendaftaran Beasiswa", input, catalog);
    }

    @Override
    public void execute() {
        EducationLevel level = promptEducationLevel();
        int term = promptTerm(level);

        List<Scholarship> available = getCatalog().findByCohort(level, term);
        if (available.isEmpty()) {
            System.out.println("[!] Tidak ada beasiswa tersedia untuk pilihan ini.");
            return;
        }

        Scholarship chosenScholarship = selectScholarshipFromList(level, term, available);
        ApplicantCard card = scanApplicantDetails(level, term, chosenScholarship);
        card.render();
    }

    private Scholarship selectScholarshipFromList(
            EducationLevel level,
            int term,
            List<Scholarship> available) {
        System.out.printf("\nDaftar Beasiswa %s (%s %d):%n",
                level.getLabel(),
                level.getTermUnit(),
                term);
        for (int i = 0; i < available.size(); i++) {
            System.out.printf("  %2d. %s%n", (i + 1), available.get(i).getName());
        }
        int choice = getInput().readIntInRange(
                "Pilih nomor beasiswa target [1-" + available.size() + "]: ",
                1,
                available.size());
        return available.get(choice - 1);
    }

    private ApplicantCard scanApplicantDetails(
            EducationLevel level,
            int term,
            Scholarship targetScholarship) {
        System.out.println("\n--- Lengkapi Data Calon Pendaftar ---");
        String applicantName = getInput().readNonEmptyLine("Masukkan Nama Lengkap          : ");
        String institutionName = getInput().readNonEmptyLine("Masukkan Asal Sekolah / Kampus : ");
        String preparationNote = getInput().readNonEmptyLine("Masukkan Hal yang Perlu di Siapkan : ");

        return new ApplicantCard(
                applicantName,
                institutionName,
                level,
                term,
                targetScholarship,
                preparationNote);
    }
}