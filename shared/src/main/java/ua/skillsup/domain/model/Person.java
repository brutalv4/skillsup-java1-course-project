package ua.skillsup.domain.model;

import java.util.Date;

public class Person extends GenericDTO {

    private String firstName;
    private String lastName;
    private Date birthday;
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

    public Date getBirthday() {
        return birthday;
    }

    public Person setBirthday(Date birthday) {
        this.birthday = birthday;
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
