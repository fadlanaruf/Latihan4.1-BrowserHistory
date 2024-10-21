package com.github.affandes.kuliah.pm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. View history");
            System.out.println("2. Browse website");
            System.out.println("3. Back");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu (1-4): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    browser.view();
                    break;
                case "2":
                    System.out.print("Masukkan URL website: ");
                    String url = scanner.nextLine();
                    browser.browse(url);
                    break;
                case "3":
                    browser.back();
                    break;
                case "4":
                    System.out.println("Terima kasih telah menggunakan browser. Sampai jumpa!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-4.");
            }
        }
    }
}