package ua.skillsup.domain.model;

import ua.skillsup.domain.HasId;

import java.util.Date;

public class Person extends HasId {

    private String firstName;
    private String lastName;
    private Date birthDate;
    private String nickname;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Person setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public Person setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
}
