package com.company;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.*;

public class Libby {
//    Create a new class named Library and give it (1) property:
//    an array of Book objects. Library should have a numberOfBooksInLibrary()
//    method which displays how many Books the user has in their Library.

    public ArrayList <Book> allBooks = new ArrayList();

    public int numberOfBooks() {
        int numberOfBooks = allBooks.size();
        return numberOfBooks;
    }



    public void addNewBook(Book book) {
        allBooks.add(book);

    }


    public void searchForABookTitle(String bookDetail) {
        int allBooksLength = allBooks.size();
        for (int i =0; i < allBooksLength; i++) {
            if (allBooks.get(i) !=null && allBooks.contains(bookDetail)) {
                System.out.println("We found your book!");
        } else {
                System.out.println("Looks like we don't have that book, consider adding it" + "\n");
            }

        }


    }
//
//    //deletes first of instance book title if there is a break statement, otherwise deletes all books with that title
//    public void deleteABook(String input) {
//        for (int i = 0; i < allBooks.length; i++) {
//            if (allBooks[i] != null && input.equalsIgnoreCase(allBooks[i].getTitle())) {
//                allBooks[i] = null;
//            }
//        }
//
//    }
//
//    public void printBooksInArray() {
//        for (Book book : allBooks) {
//            if (book != null) {
//                book.printDetails();
//            } else {
//                System.out.println("Empty");
//            }
//        }
//
//    }
//
//    public void printBooksByIndexNumber() {
//        for (int i = 0; i < allBooks.length; i++) {
//            if (allBooks[i] != null) {
//                System.out.println(i);
//                allBooks[i].printDetails();
//            } else {
//                System.out.println("Empty!");
//            }
//        }
//    }
//
//    public void updateBookTitle (int userIndexInput, String newTitle) {
//
//
//        allBooks[userIndexInput].setTitle(newTitle);
//        allBooks[userIndexInput].printDetails();
//
//    }
//
//    public void updateBookAuthor (int userIndexInput, String newAuthor) {
//        allBooks [userIndexInput].setAuthor(newAuthor);
//        allBooks [userIndexInput].printDetails();
//    }
//
//    public void updateNumberOfPages(int userIndexInput, int newNumberOfPages){
//        allBooks [userIndexInput].setNumberOfPages(newNumberOfPages);
//        allBooks [userIndexInput].printDetails();
//
//    }
//
//    public void updatePublicationYear (int userIndexInput, int newPubYr) {
//        allBooks [userIndexInput].setPublicationYear(newPubYr);
//        allBooks [userIndexInput].printDetails();
//
//    }

}

