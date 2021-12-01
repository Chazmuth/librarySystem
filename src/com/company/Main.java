package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//good code
public class Main {

    private static File bookList = new File("bookList.txt");

    public static String getInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.next();
    }

    public static void createFile(){
        try{
            if(bookList.createNewFile()){
                System.out.println("File created: " + bookList.getName());
            }else{
                System.out.println("booklist exists");
            }
        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        createFile();
        mainMenu();
    }

    public static void mainMenu(){
        try{
            while(true){
                String option = getInput("Menu List: Add Book, Search (Choose one):"); //add list of menus as program expands
                if(!option.equals("Add Book") || !option.equals("Search"))
                switch (option){
                    case "Add Book":
                        addBook();
                    case "Search":
                        search();
                }
            }
        }catch(Exception e){
            System.out.println("There was an error" + e);
        }
    }

    public static void addBook(){
        String title = getInput("Title:");
        String ISBN = getInput("ISBN:");
        String author = getInput("Author:");
        String genre = getInput("Genre:");
        Book newBook = new Book(title, ISBN, author, genre);
        writeBookToLibrary(newBook);
    }

    public static void search(){
        //search code
    }

    public static void writeBookToLibrary(Book newBook){
        try{
            FileWriter writer = new FileWriter(bookList.getName(), true);
            String[] bookData
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
