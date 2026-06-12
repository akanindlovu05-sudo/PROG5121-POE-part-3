package com.mycompany.programjava.com;

import java.util.Scanner;

public class ProgramJavaClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] messages = new String[100];
        int messageCount = 0;

        int choice;

        do {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Add Message");
            System.out.println("2. View Messages");
            System.out.println("3. Delete Message");
            System.out.println("4. Stored Messages");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {

                case 1:
                    if (messageCount < messages.length) {
                        System.out.print("Enter message: ");
                        messages[messageCount] = input.nextLine();
                        messageCount++;
                        System.out.println("Message stored.");
                    } else {
                        System.out.println("Storage full.");
                    }
                    break;

                case 2:
                    System.out.println("\n=== CURRENT MESSAGES ===");

                    if (messageCount == 0) {
                        System.out.println("No messages available.");
                    } else {
                        for (int i = 0; i < messageCount; i++) {
                            System.out.println((i + 1) + ". " + messages[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter message number to delete: ");
                    int index = input.nextInt() - 1;
                    input.nextLine();

                    if (index >= 0 && index < messageCount) {

                        for (int i = index; i < messageCount - 1; i++) {
                            messages[i] = messages[i + 1];
                        }

                        messages[messageCount - 1] = null;
                        messageCount--;

                        System.out.println("Message deleted.");
                    } else {
                        System.out.println("Invalid message number.");
                    }
                    break;

                case 4:
                    System.out.println("\n=== STORED MESSAGES ===");

                    if (messageCount == 0) {
                        System.out.println("No stored messages.");
                    } else {
                        for (int i = 0; i < messageCount; i++) {
                            System.out.println("Message " + (i + 1) + ": " + messages[i]);
                        }

                        System.out.println("Total Stored Messages: " + messageCount);
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 5);

        input.close();
    }
}