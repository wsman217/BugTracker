package com.westonsublett.bugtracker.data;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("users")
public class Users {

    @Getter
    @Id
    private long id;
    @Getter
    private String email;
    @Getter
    private String username;
    @Getter
    private String password;

    public Users() {

    }

    public Users(int id, String email, String username, String password) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", email=" + email + ", username=" + username + ", password=" + password + "]";
    }
}
