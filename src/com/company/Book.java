package com.company;
//creating public class named Book with variable names//
public class Book {
    private String bookTitle;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    //default constructor//
    public Book(){}

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    //overloaded constructor//
    public Book(String bookTitle, String author, String description, double price, boolean isInStock){
        this.bookTitle = bookTitle;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }
    //print statement in a method//
    public void displayText(){
        System.out.println("The author is  " + author + ", " + "the title is " + bookTitle + " " + "and the description is " + description + ".");
    }
}
