package com.company;

import java.util.Scanner;

public class BookDemo {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        //creating object for Libby

        Libby myLibby = new Libby();
        boolean running = true;
        int answer = 0;
        int index = 0;
        int userInput = 0;

        do {
            System.out.println("What would you like to do?");
            System.out.println("1. Check the number of books in your library");
            System.out.println("2. Add a Book");
            System.out.println("3. Search a Book");
            System.out.println("4. Exit!");

            userInput = myScanner.nextInt();
            myScanner.nextLine();

            switch (userInput) {

                case 1:
                    System.out.println("The number of books in your bookshelf is " + myLibby.numberOfBooks());
                    System.out.println("\n");
                    System.out.println("------------------------------");
                    System.out.println("\n");
                    break;

                case 2:
                    if (myLibby.hasRoom()) {
                        Book myBook = new Book(getStringAnswerFromUser("What is the title of your book? "),
                                getStringAnswerFromUser("Who is the author of your book? "),
                                getIntAnswerFromUser("How many pages is your book? "),
                                getIntAnswerFromUser("What is the publication year? "));

                        myBook.printDetails();
                        myLibby.addNewBook(myBook);
                    } else {
                        System.out.println("The library is full, try later");
                    }

                    break;

                case 3:
                    System.out.println("What is the title of the book you are searching for?");
                    String bookToSearchFor = myScanner.nextLine();
                    myLibby.searchForABookTitle(bookToSearchFor);
                    break;

                case 4:
                    System.out.println("Thanks for coming to the library!");
                    running = false;
                    break;

            }

        } while (running);


    }

    //creating a method to pass through the parameters of the constructor
    public static String getStringAnswerFromUser(String question) {
        System.out.println(question);
        return myScanner.nextLine();
    }

    public static int getIntAnswerFromUser(String question) {
        int input;
        System.out.println(question);
        input = myScanner.nextInt();
        myScanner.nextLine();
        return input;


    }
}
