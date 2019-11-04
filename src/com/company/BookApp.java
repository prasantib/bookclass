package com.company;

public class BookApp {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("Dr. Seus");
        book.setBookTitle("Are You My Mother?");
        book.setDescription("Children's book");
        book.setInStock(true);
        book.setPrice(10.0);
        book.displayText();
    }
}
