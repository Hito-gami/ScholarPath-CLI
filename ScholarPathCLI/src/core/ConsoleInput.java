package core;

import java.util.Scanner;

public class ConsoleInput {
    private final Scanner scanner;

    public ConsoleInput() {
        this.scanner = new Scanner(System.in);
    }

    public String readNonEmptyLine(String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = scanner.nextLine().trim();
            if (!value.isEmpty()) {
                return value;
            }
            System.out.println("[!] Input tidak boleh kosong. Silakan isi kembali.");
        }
    }

    public int readIntInRange(String prompt, int min, int max) {
        while (true) {
            String raw = readNonEmptyLine(prompt);
            try {
                int parsed = Integer.parseInt(raw);
                if (parsed >= min && parsed <= max) {
                    return parsed;
                }
                System.out.printf("[!] Pilihan tidak valid. Masukkan angka %d sampai %d.%n", min, max);
            } catch (NumberFormatException e) {
                System.out.println("[!] Input harus berupa angka bulat.");
            }
        }
    }

    public void close() {
        scanner.close();
    }
}