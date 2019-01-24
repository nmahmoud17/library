package com.company;

import java.util.Scanner;

public class BookDemo {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        //creating object for Libby

        Libby myLibby = new Libby();
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
            myScanner.nextLine();

            switch (userInput) {

                case 1:
                    System.out.println("The number of books in your bookshelf is " + myLibby.numberOfBooks());
                    anotherBook = true;
                    break;

                case 2:
                    boolean addBook = true;
                    do {
                        Book myBook = new Book(getStringAnswerFromUser("What is the title of your book? "),
                                getStringAnswerFromUser("Who is the author of your book? "),
                                getIntAnswerFromUser("How many pages is your book? "),
                                getIntAnswerFromUser("What is the publication year? "));

                        myBook.printDetails();

                        answer  = getIntAnswerFromUser("Would you like to add another book? 1. Yes 2. No");
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
