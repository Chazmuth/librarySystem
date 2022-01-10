package com.company.methods.books;

import static com.company.methods.utility.getInput;

public class searchingBooks {
    public static void searchDecision() {
        String searchBy = getInput("What would you like to search by?"
                + "\nTitle[t], ISBN[i], Author[a], Genre[g]");
        if (searchBy.equalsIgnoreCase("t")) {//searchBy number is the index number of the array of a book
            search(0);
        }
        if (searchBy.equalsIgnoreCase("t")) {
            search(1);
        }
        if (searchBy.equalsIgnoreCase("t")) {
            search(2);
        }
        if (searchBy.equalsIgnoreCase("t")) {
            search(3);
        }
    }

    public static void search(int searchBy) {/*
        String searchTerm = getInput("Enter Search Term:");
        ArrayList<String[]> searchResults = new ArrayList<>();
        try {
            Scanner reader = new Scanner(bookList);
            while(reader.hasNextLine()){
                String[] bookData = reader.nextLine().split("&");
                if(bookData[searchBy].equals(searchTerm)){
                    searchResults.add(bookData);
                }
            }
            System.out.println(searchResults);
        }catch (Exception e) {
            System.out.println("There was an error " + e);
        }
    }*/
    }
}
