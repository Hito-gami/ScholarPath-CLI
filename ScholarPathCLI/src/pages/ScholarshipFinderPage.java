package pages;

import core.AbstractPage;
import core.ConsoleInput;
import core.ScholarshipCatalog;
import java.util.List;
import model.EducationLevel;
import model.Scholarship;

public class ScholarshipFinderPage extends AbstractPage {
    public ScholarshipFinderPage(ConsoleInput input, ScholarshipCatalog catalog) {
        super("Cari Info Beasiswa (Siswa / Mahasiswa)", input, catalog);
    }

    @Override
    public void execute() {
        EducationLevel level = promptEducationLevel();
        int term = promptTerm(level);

        List<Scholarship> results = getCatalog().findByCohort(level, term);
        displayScholarshipList(level, term, results);
    }

    private void displayScholarshipList(EducationLevel level, int term, List<Scholarship> results) {
        System.out.println("\n======================================================================");
        System.out.printf("  DAFTAR BEASISWA UNTUK %s - %s %d%n",
                level.getLabel().toUpperCase(),
                level.getTermUnit().toUpperCase(),
                term);
        System.out.printf("  Total Ditemukan: %d Program Beasiswa%n", results.size());
        System.out.println("======================================================================");

        if (results.isEmpty()) {
            System.out.println("[!] Belum ada data beasiswa untuk jenjang tersebut.");
            return;
        }

        for (int i = 0; i < results.size(); i++) {
            System.out.printf("%n[%d] ", (i + 1));
            results.get(i).render();
        }
    }
}