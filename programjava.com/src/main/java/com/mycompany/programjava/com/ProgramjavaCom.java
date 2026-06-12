  package com.mycompany.programjavaCom.java;
          
import java.util.Scanner;
import java.time.LocalDateTime;


public class ProgramjavaCom {

    private String sender;
    private String recipient;
    private String text;
    private LocalDateTime time;
    private boolean read;

    public ProgramjavaCom(String sender, String recipient, String text) {
        this.sender = sender;
        this.recipient = recipient;
        this.text = text;
        this.time = LocalDateTime.now();
        this.read = false;
    }

    public void markAsRead() {
        read = true;
    }

    public void display() {
        System.out.println("From: " + sender);
        System.out.println("To: " + recipient);
        System.out.println("Message: " + text);
        System.out.println("Time: " + time);
        System.out.println("Read: " + read);
    }

    public static void main(String[] args) {

        ProgramjavaCom msg = new ProgramjavaCom(
                "akani",
                "tlangi",
                "Hello shimy!"
        );

        msg.display();

        msg.markAsRead();

        System.out.println("\nAfter reading:");
        msg.display();
    }
}























