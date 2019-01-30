package com.company;

import java.util.Scanner;

public class BookDemo {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        //creating object for Libby
        Libby myLibby = new Libby();

        boolean running = true;
        int userInput = 0;


        do {
            System.out.println("What would you like to do?");
            System.out.println("1. Check the number of books in your library");
            System.out.println("2. Add a Book");
            System.out.println("3. Search a Book");
            System.out.println("4. Delete a Book");
            System.out.println("5. Update a Book");
            System.out.println("6. Exit!");

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
                        Book myBook = new Book(getStringAnswerFromUser("What is the title of your book? "),
                                getStringAnswerFromUser("Who is the author of your book? "),
                                getIntAnswerFromUser("How many pages is your book? "),
                                getIntAnswerFromUser("What is the publication year? "));

                        myBook.printDetails();
                        myLibby.addNewBook(myBook);

                    break;

                case 3:
                    System.out.println("What is the title of the book you are searching for?");
                    String bookToSearchFor = myScanner.nextLine();
                    myLibby.searchForABookTitle(bookToSearchFor);
                    break;
//
//                case 4:
//                    System.out.println("What would you like to delete?");
//                    String userBookDeleteSelection = myScanner.nextLine();
//                    System.out.println(userBookDeleteSelection);
//                    myLibby.deleteABook(userBookDeleteSelection);
//
//                    break;
//
//                case 5:
//                    System.out.println("Choose the number of the Book you'd like to update: ");
//                    myLibby.printBooksByIndexNumber();
//
//
//                    int inputBookIndex = myScanner.nextInt();
//                    myScanner.nextLine();
//
//                    System.out.println("Enter the number for the section you'd like to edit" + "\n");
//                    System.out.println("1. Title");
//                    System.out.println("2. Author");
//                    System.out.println("3. Number of Pages");
//                    System.out.println("4. Author" + "\n");
//
//
//                    int subMenuInput = myScanner.nextInt();
//                    myScanner.nextLine();
//                    switch (subMenuInput) {
//
//                        case 1: //bookTitle
//
//                            System.out.println("Enter the NEW edited Book Title: ");
//                            String newEditedTitle = myScanner.nextLine();
//
//                            myLibby.updateBookTitle(inputBookIndex, newEditedTitle);
//
//                            break;
//
//
//                        case 2: //Author
//                            System.out.println("Enter the NEW Author's name: ");
//                            String newAuthorName = myScanner.nextLine();
//
//                            myLibby.updateBookAuthor(inputBookIndex, newAuthorName);
//
//                            break;
//
//                        case 3: //Number of Pages
//                            System.out.println("Enter the NEW Number of Pages of this book: ");
//                            int newNumberOfPages = myScanner.nextInt();
//                            myLibby.updateNumberOfPages(inputBookIndex, newNumberOfPages);
//                            break;
//
//
//                        case 4: //Year of Publication
//                            System.out.println("Enter the NEW Publication Year: ");
//                            int newPubYr = myScanner.nextInt();
//                            myLibby.updatePublicationYear(inputBookIndex, newPubYr);
//
//                            break;
//
//                        default:
//                            System.out.println("Try again");
//
//                    }
//
//                    break;
//
//                case 6:
//                    System.out.println("Thanks for coming to the library!");
//                    running = false;
//                    break;

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
