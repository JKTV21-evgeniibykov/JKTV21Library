package entity;

import java.io.Serializable;

public class Reader implements Serializable {
    
    private String name;
    private String phone;

    public Reader() {
    }

    public Reader(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "reader{" + 
                "name=" + name + 
                ", phone=" + phone + 
                '}';
    }
    
}
