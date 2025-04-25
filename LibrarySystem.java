import java.util.*;

abstract class LibraryItem {
    protected String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return title;
    }
}

class Book extends LibraryItem {
    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String getDescription() {
        return "Book Title: " + title + ", Author: " + author;
    }
}

class DVD extends LibraryItem {
    private String certificate;
    private String leadActor;

    public DVD(String title, String certificate, String leadActor) {
        super(title);
        this.certificate = certificate;
        this.leadActor = leadActor;
    }

    public String getCertificate() {
        return certificate;
    }

    public String getLeadActor() {
        return leadActor;
    }

    @Override
    public String getDescription() {
        return "DVD Title: " + title + ", Certificate: " + certificate + ", Lead Actor: " + leadActor;
    }
}

class CD extends LibraryItem {
    private String artist;

    public CD(String title, String artist) {
        super(title);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String getDescription() {
        return "CD Title: " + title + ", Artist: " + artist;
    }
}

public class LibrarySystem {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nSelect Role:");
            System.out.println("1. Librarian");
            System.out.println("2. Cataloguer");
            System.out.println("3. Patron");
            System.out.println("4. Administrator");
            System.out.println("5. Exit");

            int roleChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (roleChoice) {
                case 1 -> librarianActions();
                case 2 -> cataloguerActions();
                case 3 -> patronActions();
                case 4 -> administratorActions();
                case 5 -> exit = true;
                default -> System.out.println("Invalid choice. Try again.");
            }
        }

        System.out.println("Exiting Library Information System.");
    }

    static void librarianActions() {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- Librarian Actions ---");
            System.out.println("1. Loan book to patron");
            System.out.println("2. Renew book");
            System.out.println("3. Process book return");
            System.out.println("4. Handle lost book");
            System.out.println("5. Manage patron information");
            System.out.println("6. Go back");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> System.out.println("Book loaned to patron.");
                case 2 -> System.out.println("Book renewed successfully.");
                case 3 -> System.out.println("Book returned and processed.");
                case 4 -> System.out.println("Book marked as lost.");
                case 5 -> System.out.println("Managing patron information.");
                case 6 -> back = true;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    static void cataloguerActions() {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- Cataloguer Actions ---");
            System.out.println("1. Process new book");
            System.out.println("2. Go back");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> System.out.println("New book processed into the catalogue.");
                case 2 -> back = true;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    static void patronActions() {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- Patron Actions ---");
            System.out.println("1. Search for a book in the online catalogue");
            System.out.println("2. Go back");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter search string (title, name, or subject): ");
                    String search = scanner.nextLine();
                    System.out.println("Searching for: " + search + " ... (mock result)");
                }
                case 2 -> back = true;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    static void administratorActions() {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- Administrator Actions ---");
            System.out.println("1. Send overdue book notices");
            System.out.println("2. Go back");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter minimum number of overdue days: ");
                    int days = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Notices sent for books overdue by more than " + days + " days.");
                }
                case 2 -> back = true;
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
