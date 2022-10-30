/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Author;
import entity.Book;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class BookManager {
    private final Scanner scanner;
    private String imput;
    private int n, m;
    
    public BookManager() {
        scanner = new Scanner(System.in);
    }
    
    public Book[] addBook(Book[] books) {
        System.out.println("\nadd book");
        Book book = new Book();
        System.out.print("title: ");
        imput = scanner.nextLine();
        book.setTitle(imput);
        do {
            System.out.print("author [name/-]: ");
            imput = scanner.nextLine();
            if (!imput.equals("-")) {
                book.addAuthor(createAuthor(imput));
            }
        } while (!imput.equals("-"));
        System.out.println(book.toString() + "\n");
        books = Arrays.copyOf(books, books.length+1);
        books[books.length-1] = book;
        return books;
    }
    
    public Book[] editBook(Book[] books) {
        System.out.println("\nedit book");
         System.out.print("book #: ");
         imput = scanner.nextLine();
         n = Integer.parseInt(imput)-1;
         Book oldBook = books[n];
         Book chBook = new Book();
         System.out.print("title [name(" + oldBook.getTitle() + ")]: ");
         imput = scanner.nextLine();
         if (!imput.equals("")) {
             chBook.setTitle(imput);
         } else {
             chBook.setTitle(oldBook.getTitle());
         }
         m = 0;
         do {
             System.out.print("author [name");
             if (m < oldBook.getAuthors().length) {
                  System.out.print("(" + oldBook.getAuthors()[m].getName() + ")");
             }
             System.out.print(" / -]: ");
             imput = scanner.nextLine();
             if (!imput.equals("-")) {
                 if (imput.equals("") && (m < oldBook.getAuthors().length)) {
                     chBook.addAuthor(createAuthor(oldBook.getAuthors()[m].getName()));
                 } else {
                     chBook.addAuthor(createAuthor(imput));
                 }
             }
             ++m;
         } while (!imput.equals("-"));
         System.out.println(chBook.toString() + "\n");
         books[n] = chBook;        
        return books;
    }
    
    public Book[] removeBook(Book[] books) {
        System.out.println("\nremove book");
        System.out.print("book #: ");
        imput = scanner.nextLine();
        n = Integer.parseInt(imput)-1;
        Book[] newBooks = Arrays.copyOf(books, books.length-1);
        int j = 0;
        for (int i=0; i<books.length; i++) {
            if (n != i) {
                newBooks[j] = books[i];
                ++j;
            }
        }
        System.out.println("");
        return newBooks;
    }
    private Author createAuthor(String name) {
        Author author = new Author(name);
        return author;
    }
    
}
