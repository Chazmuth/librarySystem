package com.company.objects;

public class Book {
    private String title;
    private String ISBN;
    private String author;
    private String genre;
    private String isIn;

    public Book(String title, String ISBN, String author, String genre, String isIn) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.genre = genre;
        this.isIn = isIn;
    }

    @Override
    public String toString(){
        return title + "&" + ISBN + "&"
         + author + "&" + genre + "&" + isIn;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getisIn() {
        return isIn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setisIn(String isIn) {
        this.isIn = isIn;
    }
}
