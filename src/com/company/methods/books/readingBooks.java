package com.company.methods.books;

import java.util.Scanner;
import static com.company.Main.bookList;

public class readingBooks {

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
