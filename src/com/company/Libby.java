package com.company;

import java.util.Arrays;

import static java.util.Arrays.*;

public class Libby {
//    Create a new class named Library and give it (1) property:
//    an array of Book objects. Library should have a numberOfBooksInLibrary()
//    method which displays how many Books the user has in their Library.

    public Book[] allBooks = new Book[10];

    public int numberOfBooks() {
        int counter = 0;
        for (int i = 0; i < allBooks.length; i++) {
            if (allBooks[i] != null)
                counter++;
        }

        return counter;

    }
    public boolean isFull() {
        return numberOfBooks() == allBooks.length;
    }

    public boolean hasRoom() {
        return !isFull();
    }

    public void addNewBook (Book book) {
        for (int i = 0; i < allBooks.length; i++) {
            if (allBooks[i] == null) {
                allBooks[i] = book;
                break;
            }
        }
    }


    public void searchForABookTitle(String bookTitleInput) {
        for (int i = 0; i < allBooks.length; i++) {
            if (allBooks[i] !=null && bookTitleInput.equalsIgnoreCase(allBooks[i].getTitle())) {
                System.out.println("We found your book: " + bookTitleInput);
                System.out.println("\n");
            } else {
                break;
            }

        }
    }

    //deletes first of instance book title if there is a break statement, otherwise deletes all books with that title
    public void deleteABook(String input) {
        for (int i = 0; i < allBooks.length; i++) {
            if (allBooks[i] != null && input.equalsIgnoreCase(allBooks[i].getTitle())) {
                allBooks[i] = null;
            }
        }

    }

    public void printBooksInArray() {
        for (Book book: allBooks){
            if (book != null) {
                book.printDetails();
            } else {
                System.out.println("Empty");
            }
        }

    }
    public void printBooksByIndexNumber() {
        for (int i=0; i<allBooks.length; i++){
            if (allBooks[i] != null) {
                System.out.println(i);
                allBooks[i].printDetails();
            } else {
                System.out.println("Empty!");
            }
        }
    }

    }

