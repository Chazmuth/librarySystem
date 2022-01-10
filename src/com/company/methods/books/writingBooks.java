package com.company.methods.books;

import com.company.objects.Book;
import java.io.FileWriter;
import java.io.IOException;
import static com.company.methods.utility.getInput;
import static com.company.Main.bookList;

public class writingBooks {
    public static void addBook() {
        String title = getInput("Title:");
        String ISBN = getInput("ISBN:");
        String author = getInput("Author:");
        String genre = getInput("Genre:");
        Book newBook = new Book(title, ISBN, author, genre, "Y");
        writeBookToLibrary(newBook);
    }

    public static void writeBookToLibrary(Book newBook) {
        try {
            FileWriter writer = new FileWriter(bookList.getName(), true);
            String bookData = "\n" + newBook.toString();
            writer.write(bookData);
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
