package org.filtering;



import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample book titles
        List<String> bookTitles = Arrays.asList(
                "The Great Gatsby", "To Kill a Mockingbird", "1984", "Brave New World", "Animal Farm",
                "Pride and Prejudice", "The Catcher in the Rye", "Lord of the Flies", "The Hobbit", "Fahrenheit 451"
        );

        // Create a stream from the book titles
        bookTitles.stream()
                .limit(5)  // Limit to at most 5 book titles
                .map(Book::new)  // Convert titles to Book objects
                .forEach(System.out::println);
    }
}
