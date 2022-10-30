/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author pupil
 */
public class History implements Serializable {
    
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

    public void setBook(Book book) {
        this.book = book;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public void setTakeDate(Date takeDate) {
        this.takeDate = takeDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public Reader getReader() {
        return reader;
    }

    public Date getTakeDate() {
        return takeDate;
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
