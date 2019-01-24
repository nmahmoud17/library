package com.company;

import java.util.Scanner;

public class BookDemo {

    public static void main(String[] args) {
        //creating object for Libby

        Libby myLibby = new Libby();
        Scanner myScanner = new Scanner(System.in);
        boolean anotherBook = true;
        int answer = 0;
        int index = 0;
        int userInput = 0;

        do {
            System.out.println("What would you like to do?");
            System.out.println("1. Check the number of books in your library");
            System.out.println("2. Add a Book");
            System.out.println("3. Exit!");

            userInput = myScanner.nextInt();

            switch (userInput) {

                case 1:
                    System.out.println("The number of books in your bookshelf is " + myLibby.numberOfBooks());
                    anotherBook = true;
                    break;

                case 2:
                    boolean addBook = true;
                    do {
                        Book myBook = new Book();

                        System.out.println("What is the title of your book? ");
                        myBook.setTitle(myScanner.next());

                        System.out.println("Who is the author of your book? ");
                        myBook.setAuthor(myScanner.next());

                        System.out.println("How many pages is your book? ");
                        myBook.setNumberOfPages(myScanner.nextInt());

                        System.out.println("What is the publication year? ");
                        myBook.setPublicationYear(myScanner.nextInt());

                        System.out.println("Would you like to add another book? 1. Yes 2. No");
                        answer = myScanner.nextInt();

                        myLibby.allBooks[index] = myBook;


                        if (answer == 1) {
                            index++;
                        } else if (answer == 2) {
                            addBook = false;

                        } else {
                            System.out.println("Try again!");
                        }
                    } while (addBook);

                    break;

                case 3:
                    System.out.println("Thanks for coming to the library!");
                    anotherBook = false;
                    break;

            }

        } while (anotherBook);

    }
}
