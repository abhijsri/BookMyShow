package com.moveinsynch.bms.BookMyShow.models;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Admin extends Person {
    private String adminKey;

    public Admin() {
        super();
    }

    public Admin(int id, String firstName, String lastName, String username,
                 String password, String email, Date dob, String phone, String adminKey) {
        super(id, firstName, lastName, username, password, email, dob, phone);
        this.adminKey= adminKey;
    }

    public String getAdminKey() {
        return adminKey;
    }

    public void setAdminKey(String adminKey) {
        this.adminKey = adminKey;
    }
}
