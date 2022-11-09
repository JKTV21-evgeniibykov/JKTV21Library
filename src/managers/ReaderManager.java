package managers;

import entity.Reader;
import java.util.Arrays;
import java.util.Scanner;

public class ReaderManager {
    private final Scanner scanner;
    private String imput;

    public ReaderManager() {
        scanner = new Scanner(System.in);
    }
    
    public Reader[] addReader(Reader[] readers) {
        System.out.println("\nadd reader");
        Reader reader = new Reader();
        System.out.print("name: ");
        imput = scanner.nextLine();
        reader.setName(imput);
        System.out.print("phone: ");
        imput = scanner.nextLine();
        reader.setPhone(imput);
        System.out.println(reader.toString() + "\n");
        readers = Arrays.copyOf(readers, readers.length+1);
        readers[readers.length-1] = reader;
        return readers;
    }
}
