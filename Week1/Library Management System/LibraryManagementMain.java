package Ex6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book("B101", "The Catcher in the Rye", "J.D. Salinger"),
            new Book("B102", "Brave New World", "Aldous Huxley"),
            new Book("B103", "Moby Dick", "Herman Melville"),
            new Book("B104", "The Hobbit", "J.R.R. Tolkien")
        };

        LibrarySearch librarySearch = new LibrarySearch();

        // Linear Search
        Book foundBook = librarySearch.linearSearch(books, "The Hobbit");
        System.out.println("Linear Search: Found " + foundBook);

        // Sort books by title for Binary Search
        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        // Binary Search
        foundBook = librarySearch.binarySearch(books, "The Hobbit");
        System.out.println("Binary Search: Found " + foundBook);
    }
}
