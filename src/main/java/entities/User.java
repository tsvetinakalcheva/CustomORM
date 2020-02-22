package entities;

import annotations.Column;
import annotations.Entity;
import annotations.Id;

import java.util.Date;

@Entity(name = "users")
public class User {

    @Id
    @Column(name = "id")
    public int id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "age")
    private int age;

    @Column(name = "registration_date")
    private Date registrationDate;

    public User(String username, String password, int age, Date registrationDate) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.registrationDate = registrationDate;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }
}
