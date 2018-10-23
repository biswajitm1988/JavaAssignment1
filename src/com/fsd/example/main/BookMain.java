package com.fsd.example.main;

import com.fsd.example.helper.BookHelper;
import com.fsd.example.helper.SubjectHelper;

import java.io.IOException;
import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        int menuChoice = 0;

        try {
            do {

                System.out.println("\n***********************"
                        + "\n**********MENU*********"
                        + "\n***********************");
                System.out.println("\n1. Add a Subject"
                        + "\n2. Add a Book"
                        + "\n3. Delete a Subject"
                        + "\n4. Delete a book"
                        + "\n5. Search for a book"
                        + "\n6. Search for a subject"
                        + "\n7. Exit"
                        + "\n\nPlease enter your selection and then press enter : ");

                menuChoice = input.nextInt();

                SubjectHelper subjectHelper = new SubjectHelper();
                BookHelper bookHelper = new BookHelper();

                switch (menuChoice) {
                    case 1:
                        SubjectHelper.addSubject();
                        break;
                    case 2:
                        BookHelper.addBook();
                        break;
                    case 3:
                        subjectHelper.deleteSubject();
                        break;
                    case 4:
                        bookHelper.deleteBook();
                        break;
                    case 5:
                        bookHelper.searchByBook();
                        break;
                    case 6:
                        subjectHelper.searchBySubject();
                        break;
                    default:
                        break;
                }
            } while (menuChoice != 7);
        } catch (Exception e) {
            System.out.println("\nInvalid input " + e.getMessage());
            main(args);
        }
    }

}