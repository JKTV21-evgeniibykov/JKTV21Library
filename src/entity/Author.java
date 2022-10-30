/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author pupil
 */
public class Author implements Serializable {
    
    private String name;

    public Author() {
    }

    public Author(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "author {" + 
                "name=" + name + 
                '}';
    }
    
}
