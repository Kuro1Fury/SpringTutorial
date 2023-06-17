package org.example.spring6.iocxml.di;

public class Book {

    private String bname;
    private String author;
    private String other;

    // Generate constructors
    public Book() {
        System.out.println("Zero constructor is called");
    }

    // Constructor with arguments
    public Book(String bname, String author) {
        System.out.println("Constructor with arguments is called.");
        this.bname = bname;
        this.author = author;
    }

    // Generate set method
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", other='" + other + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Vanilla set injection
        Book book = new Book();
        book.setBname("Java");
        book.setAuthor("Allan");

        // Vanilla constructor injection
        Book book1 = new Book("Python", "Zihe");
    }
}
