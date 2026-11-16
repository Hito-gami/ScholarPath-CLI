import core.AbstractPage;
import core.CliEngine;
import core.ConsoleInput;
import core.ScholarshipCatalog;
import java.util.Arrays;
import java.util.List;
import pages.ApplicationCardPage;
import pages.ScholarshipFinderPage;

public class Main {
    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        try {
            ScholarshipCatalog catalog = new ScholarshipCatalog();
            List<AbstractPage> pages = Arrays.asList(
                    new ScholarshipFinderPage(input, catalog),
                    new ApplicationCardPage(input, catalog));

            CliEngine engine = new CliEngine("ScholarPath - Sistem Informasi & Pencari Beasiswa", input, pages);
            engine.start();
        } finally {
            input.close();
        }
    }
}