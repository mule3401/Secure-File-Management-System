package com.vault;

import javax.crypto.SecretKey;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========== SECURE FILE VAULT ==========");
        System.out.println("1. Encrypt a file");
        System.out.println("2. Decrypt a file");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        try {
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            SecretKey key = PasswordUtils.getKeyFromPassword(password);

            System.out.print("Enter input file path: ");
            String inputFile = scanner.nextLine();

            System.out.print("Enter output file path: ");
            String outputFile = scanner.nextLine();

            if (choice == 1) {
                FileEncryptor.encryptFile(inputFile, outputFile, key);
            } else if (choice == 2) {
                FileDecryptor.decryptFile(inputFile, outputFile, key);
            } else {
                System.out.println("Invalid option!");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
