/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class HistoryManager {
    private final Scanner scanner;
    private String imput;

    public HistoryManager() {
        scanner = new Scanner(System.in);
    }
    
    public History[] takeBook(History[] history, Book[] books, Reader[] readers) {
        System.out.println("\ntake book");
        History h = new History();
        System.out.print("book #: ");
        imput = scanner.nextLine();
        h.setBook(books[Integer.parseInt(imput)-1]);
        System.out.print("reader #: ");
        imput = scanner.nextLine();
        h.setReader(readers[Integer.parseInt(imput)-1]);
        h.setTakeDate(new GregorianCalendar().getTime());
        System.out.println(h.toString() + "\n");
        history = Arrays.copyOf(history, history.length+1);
        history[history.length-1] = h;
        return history;
    }
    
    public History[] returnBook(History[] history) {
        System.out.println("\nreturn book");
        System.out.print("history #: ");
        imput = scanner.nextLine();
        history[Integer.parseInt(imput)-1].setReturnDate(new GregorianCalendar().getTime());
        System.out.println(history[Integer.parseInt(imput)-1].toString() + "\n");
        return history;
    }
    
}
