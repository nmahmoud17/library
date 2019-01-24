package com.company;

public class Book {

    private String title;
    private String author;
    private int numberOfPages;
    private int publicationYear;

    public void setTitle(String titleName) {
        title = titleName;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String authorName) {
        author = authorName;
    }

    public String getAuthor() {
        return author;
    }

    public void setNumberOfPages(int pagesTotal) {
        numberOfPages = pagesTotal;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setPublicationYear(int yearOfPublication) {
        publicationYear = yearOfPublication;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // constructor

    public Book(String title, String author, int numberOfPages, int publicationYear) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages ;
        this.publicationYear = publicationYear;
    }

    public void printDetails() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(numberOfPages);
        System.out.println(publicationYear);

    }



}
