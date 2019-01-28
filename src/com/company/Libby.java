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

    public void deleteABook(String input) {
        for (int i = 0; i < allBooks.length; i++) {
            if (input.equalsIgnoreCase(allBooks[i].getTitle())) {
                allBooks[i] = null;
                break;
            }
        }
    }

    public void updateABook() {

    }

    }

