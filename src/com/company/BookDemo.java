package com.company;

import java.util.Scanner;

public class BookDemo {

    public static void main(String[] args) {
        //creating object for Libby

        Libby myLibby = new Libby();

        boolean anotherBook = true;
        int answer =0;
        int index = 0;

        do {
            Scanner myScanner = new Scanner(System.in);
            Book myBook = new Book();

            System.out.println("What is the title of your book? ");
            myBook.setTitle(myScanner.next());

            System.out.println("Who is the author of your book? ");
            myBook.setAuthor(myScanner.next());

            System.out.println("How many pages is your book? ");
            myBook.setNumberOfPages(myScanner.nextInt());

            System.out.println("What is the publication year? ");
            myBook.setPublicationYear(myScanner.nextInt());

            System.out.println("Would you like to add another book? ");
            answer = myScanner.nextInt();

            myLibby.allBooks[index]= myBook;


            if (answer == 1) {
                index++;
            }
            else if (answer == 2 ) {
                anotherBook = false;

            }
            else {
                System.out.println("Try again!");
            }


        } while (anotherBook);

//        System.out.println("The number of books in your bookshelf is " + myLibby.numberOfBooks());

    }
}
