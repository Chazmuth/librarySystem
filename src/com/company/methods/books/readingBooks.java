package com.company.methods.books;

import com.company.objects.Book;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static com.company.methods.utility.getInput;

public class readingBooks {

    private static File bookList = new File("bookList.txt");

    public static void addBook() {
        String title = getInput("Title:");
        String ISBN = getInput("ISBN:");
        String author = getInput("Author:");
        String genre = getInput("Genre:");
        Book newBook = new Book(title, ISBN, author, genre);
        writeBookToLibrary(newBook);
    }

    public static void writeBookToLibrary(Book newBook) {
        try {
            FileWriter writer = new FileWriter(bookList.getName(), true);
            String bookData = "\n" + newBook.getTitle() + "&"
                    + newBook.getISBN() + "&"
                    + newBook.getAuthor() + "&"
                    + newBook.getGenre();
            writer.write(bookData);
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void printBookList() {
        try {
            Scanner reader = new Scanner(bookList);
            while (reader.hasNextLine()) {
                String[] formatArray = {"Title: ", "ISBN: ", "Author: ", "Genre: "};
                String[] bookData = reader.nextLine().split("&");
                for (int i = 0; i < bookData.length; i++) {
                    System.out.print(formatArray[i] + bookData[i] + "\n");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("There was an error " + e);
        }
    }

}
