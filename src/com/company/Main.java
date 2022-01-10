package com.company;

import java.io.File;
import java.io.IOException;

import static com.company.methods.utility.getInput;
import static com.company.methods.loginHandling.welcome;
import static com.company.methods.books.readingBooks.*;
import static com.company.methods.books.writingBooks.searchDecision;

//good code
public class Main {

    private static File bookList = new File("bookList.txt");

    public static void createFile() {
        try {
            if (bookList.createNewFile()) {
                System.out.println("File created: " + bookList.getName());
            } else {
                System.out.println("booklist exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        createFile(); //creates file or check that the booklist file exists
        welcome(); //has login logic
        mainMenu();//does the main libaray system
    }

    public static void mainMenu() {
        try {
            while (true) {
                String option = getInput("Menu List: " +
                        "\nAdd Book[a] " +
                        "\nSearch[s] " +
                        "\nPrint Library List[p]" +
                        "\n(Choose one):"); //add list of menus as program expands
                switch (option) {
                    case "s":
                        searchDecision();
                        break;
                    case "p":
                        printBookList();
                        break;
                    case "a":
                        addBook();
                        break;
                }
            }
        } catch (
                Exception e) {
            System.out.println("There was an error" + e);
        }

    }

}
