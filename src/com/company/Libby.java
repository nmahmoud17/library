package com.company;

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

    public void searchForABook(String bookTitleInput) {
        for (int i = 0; i < allBooks.length; i++) {
            if (bookTitleInput.equals(allBooks[i].getTitle())) {
                System.out.println("We found your book: " + bookTitleInput);
            } else {
                System.out.println("We could not find your book, please try later");
            }

        }
    }

    public void deleteABook() {


    }

    public void updateABook() {

    }

    }

