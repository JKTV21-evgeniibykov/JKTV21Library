import entity.Book;
import entity.History;
import entity.Reader;
import java.util.ArrayList;
import java.util.Scanner;
import managers.BaseManager;
import managers.AuthorManager;
import managers.BookManager;
import managers.HistoryManager;
import managers.ReaderManager;

public class App {
    private Scanner scanner;
    BaseManager baseManager = new BaseManager();
    AuthorManager authorManager;
//    BookManager bookManager;
//    ReaderManager readerManager;
//    HistoryManager historyManager;
    private String imput;
    private int n, m;

    public App() {
        scanner = new Scanner(System.in);
        authorManager = new AuthorManager();
//        bookManager = new BookManager();
//        readerManager = new ReaderManager();
//        historyManager = new HistoryManager();
    }

    public void run() {
        boolean repeat = true;
        do {
            System.out.println("1.library | 2.books | 3.authors | 4.readers | 5.history | 0.exit");
            System.out.print("> ");
            imput = scanner.nextLine();
            switch (imput) {
                case "0": // exit
                    repeat = false;
                    System.out.println("\nexit\n");
                    break;
                case "1": // library
                    this.printLib();
                    break;
                case "2": // books

                    break;
                case "3": // authors
                    authorManager.manage();
                    break;
                case "4": // readers

                    break;
                case "7": // history

                    break;
                default:
            }
        } while (repeat);
    }
    
    private void printLib() {
        System.out.println("\nprint lib");
//        System.out.println("books:");
//        n = 1;
//        for (int i=0; i<books.length; i++) {
//            System.out.println(n + ". " + books[i].toString());
//            ++n;
//        }
//        System.out.println("readers:");
//        n = 1;
//        for (int i=0; i<readers.length; i++) {
//            System.out.println(n + ". " + readers[i].toString());
//            ++n;
//        }
//        System.out.println("taked books:");
//        n = 1;
//        for (int i=0; i<readers.length; i++) {
//            if (history.length != 0) {
//                if (history[i].getReturnDate() == null) {
//                    System.out.println((i+1) + ". " + history[i].toString());
//                    ++n;
//                }
//            }
//        }
//        if (n == 1) {
//            System.out.println("no");
//        }
        System.out.println("");
    }

}
