
import entity.Book;
import entity.History;
import entity.Reader;
import java.util.Scanner;
import managers.BookManager;
import managers.DataManager;
import managers.HistoryManager;
import managers.ReaderManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pupil
 */
public class App {
    private Scanner scanner;
    private Book[] books;
    private Reader[] readers;
    private History[] history;
    BookManager bookManager;
    ReaderManager readerManager;
    HistoryManager historyManager;
    DataManager dataManager = new DataManager();
    private String booksFileName = "files/MyBooks";
    private String readersFileName = "files/MyReaders";
    private String historyFileName = "files/MyHistory";
    private String imput;
    private int n, m;

    public App() {
        scanner = new Scanner(System.in);
        bookManager = new BookManager();
        readerManager = new ReaderManager();
        historyManager = new HistoryManager();
        books = (Book[]) dataManager.loadObjects(booksFileName);
        readers = (Reader[]) dataManager.loadObjects(readersFileName);
        history = (History[]) dataManager.loadObjects(historyFileName);
//        books = new Book[0];
//        readers = new Reader[0];
//        history = new History[0];
//        this.testAddBook();
//        this.testAddReader();
    }

    public void run() {
        boolean repeat = true;
        do {
            System.out.println("1.print lib | 2.add book | 3.remove book | 4.edit book | 5.add reader | 6.take book | 7.return book | 0.exit");
            System.out.print("> ");
            imput = scanner.nextLine();
            switch (imput) {
                case "0": // exit
                    repeat = false;
                    System.out.println("\nexit\n");
                    break;
                case "1": // print lib
                    this.printLib();
                    break;
                case "2": // add book
                    books = bookManager.addBook(books);
                    dataManager.saveObjects((Book[]) books, booksFileName);
                    break;
                case "3": // delete book
                    books = bookManager.removeBook(books);
                    dataManager.saveObjects((Book[]) books, booksFileName);
                    break;
                case "4": // edit book
                    books = bookManager.editBook(books);
                    dataManager.saveObjects((Book[]) books, booksFileName);
                    break;
                case "5": // add reader
                    readers = readerManager.addReader(readers);
                    dataManager.saveObjects((Reader[]) readers, readersFileName);
                    break;
                case "6": // take book
                    history = historyManager.takeBook(history, books, readers);
                    dataManager.saveObjects((History[]) history, historyFileName);
                    break;
                case "7": // return book
                    history = historyManager.returnBook(history);
                    dataManager.saveObjects((History[]) history, historyFileName);
                    break;
                default:
            }
        } while (repeat);
    }
    
    private void printLib() {
        System.out.println("\nprint lib");
        System.out.println("books:");
        n = 1;
        for (int i=0; i<books.length; i++) {
            System.out.println(n + ". " + books[i].toString());
            ++n;
        }
        System.out.println("readers:");
        n = 1;
        for (int i=0; i<readers.length; i++) {
            System.out.println(n + ". " + readers[i].toString());
            ++n;
        }
        System.out.println("taked books:");
        n = 1;
        for (int i=0; i<readers.length; i++) {
            if (history.length != 0) {
                if (history[i].getReturnDate() == null) {
                    System.out.println((i+1) + ". " + history[i].toString());
                    ++n;
                }
            }
        }
        if (n == 1) {
            System.out.println("no");
        }
        System.out.println("");
    }

//    private void testAddBook() {
//        Author[] authors = { new Author("Nadezhda") };
//        Book book = new Book("Book No.1", authors);
//        this.books = Arrays.copyOf(books, books.length+1);
//        this.books[this.books.length-1] = book;
//    }
//    
//    private void testAddReader() {
//        Reader reader = new Reader("Jon Bull", "+372 5808-4444");
//        this.readers = Arrays.copyOf(readers, readers.length+1);
//        this.readers[this.readers.length-1] = reader;
//    }

}
