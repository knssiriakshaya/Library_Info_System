# Library Information System (Java Console Application)

This is a simple console-based Library Information System written in Java. It simulates different user roles within a library and allows interaction with various library items like books, CDs, and DVDs.

## Features

- Role-based menu system
- Object-oriented design using inheritance and polymorphism
- Abstract base class `LibraryItem` with subclasses `Book`, `CD`, and `DVD`
- Basic console interaction for different roles: Librarian, Cataloguer, Patron, Administrator

## Code Structure

### LibraryItem (Abstract Class)

Defines a common structure for all library items with a title and a description method. This class is extended by specific item types.

### Subclasses

- `Book`: Includes title and author
- `DVD`: Includes title, certificate, and lead actor
- `CD`: Includes title and artist

Each subclass overrides `getDescription()` to return item-specific information.

### LibrarySystem (Main Class)

This is the main class containing:

- The main menu interface
- Input handling using `Scanner`
- Role-specific action methods:
  - `librarianActions()`
  - `cataloguerActions()`
  - `patronActions()`
  - `administratorActions()`

## Role Descriptions

### Librarian

- Loan book to patron
- Renew book
- Process book return
- Handle lost book
- Manage patron information

### Cataloguer

- Process new book into the catalog

### Patron

- Search for books in the online catalogue (mock search)

### Administrator

- Send overdue book notices based on input days

## How to Run

Make sure Java is installed. Then compile and run the program using:

```bash
javac LibrarySystem.java
java LibrarySystem
