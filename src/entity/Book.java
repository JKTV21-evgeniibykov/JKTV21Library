/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author pupil
 */

public class Book implements Serializable {
    
    private String title;
    private Author[] authors = new Author[0];

    public Book() {
    }
    
    public Book(String title, Author[] authors) {
        this.title = title;
        this.authors = authors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "book {" + 
                "title=" + title + 
                ", authors=" + Arrays.toString(authors) + 
                '}';
    }

    public void addAuthor(Author author) {
        Author[] newAuthors = Arrays.copyOf(authors, authors.length+1);
        newAuthors[newAuthors.length-1] = author;
        this.authors = newAuthors;
    }

}
