package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CliEngine {
    private final String appName;
    private final ConsoleInput input;
    private final List<AbstractPage> pages;
    private boolean running;

    public CliEngine(String appName, ConsoleInput input, List<AbstractPage> pages) {
        this.appName = Objects.requireNonNull(appName, "Nama aplikasi tidak boleh null");
        this.input = Objects.requireNonNull(input, "ConsoleInput tidak boleh null");
        Objects.requireNonNull(pages, "Daftar halaman tidak boleh null");
        this.pages = Collections.unmodifiableList(new ArrayList<>(pages));
        this.running = false;
    }

    public void start() {
        this.running = true;
        while (running) {
            displayMainMenu();
            processSelection();
        }
    }

    private void displayMainMenu() {
        System.out.println("\n======================================================================");
        System.out.println("  " + appName.toUpperCase());
        System.out.println("======================================================================");
        for (int i = 0; i < pages.size(); i++) {
            System.out.printf("  %d. %s%n", (i + 1), pages.get(i).getTitle());
        }
        System.out.println("  0. Keluar");
        System.out.println("----------------------------------------------------------------------");
    }

    private void processSelection() {
        int choice = input.readIntInRange("Pilih menu utama [0-" + pages.size() + "]: ", 0, pages.size());
        if (choice == 0) {
            running = false;
            System.out.println("Aplikasi ditutup. Terima kasih telah menggunakan " + appName + ".");
            return;
        }
        AbstractPage selectedPage = pages.get(choice - 1);
        selectedPage.render();
        selectedPage.execute();
    }
}