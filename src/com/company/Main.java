package com.company;

        import java.util.ArrayList;
        import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<Book> books = new ArrayList<Book>();
        Scanner scan = new Scanner(System.in);

        String Quit ="y";


        while (Quit.equalsIgnoreCase("y"))
        {

            System.out.println("Do you want to enter book: ");
            Quit = scan.nextLine();

            if (Quit.equalsIgnoreCase("y"))
            {
                Book book = new Book();
                System.out.print("Enter a Book author: ");
                book.author = scan.nextLine();

                System.out.print("Enter a Book title: ");
                book.title = "Title of Book 1: ";
                book.title = scan.nextLine();

                System.out.print("Descriptions of Book 1: ");
                book.Descriptions = "Descriptions of Book 1";
                book.Descriptions = scan.nextLine();
                books.add(book);

            }
        }

                System.out.println("All the books:");
                for (Book book : books)
                {
                    System.out.print(book.author);
                    System.out.println();

                    System.out.print(book.title);
                    System.out.println();

                    System.out.print(book.Descriptions);
                    System.out.println();
                }
            }

        }



