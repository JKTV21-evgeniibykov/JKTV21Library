package entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class History implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Book book;
    private Reader reader;
    private Date takeDate;
    private Date returnDate;

    public History() {
    }

    public History(Book book, Reader reader, Date takeDate, Date returnDate) {
        this.book = book;
        this.reader = reader;
        this.takeDate = takeDate;
        this.returnDate = returnDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Reader getReader() {
        return reader;
    }

    public void setTakeDate(Date takeDate) {
        this.takeDate = takeDate;
    }

    public Date getTakeDate() {
        return takeDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return "history {" + 
                "" + book + 
                ", " + reader + 
                ", takeDate=" + sdf.format(takeDate) + 
                ", returnDate=" + returnDate + 
                '}';
    }

}
