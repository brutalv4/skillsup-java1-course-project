package ua.skillsup.domain.model;

import ua.skillsup.domain.HasId;

import java.util.Date;

public class Message extends HasId {

    private String content;
    private Date dateSent;
    private Person fromPerson;
    private Person toPerson;

    public Message() {
    }

    public Message(Person fromPerson, Person toPerson) {
        this.fromPerson = fromPerson;
        this.toPerson = toPerson;
    }

    public String getContent() {
        return content;
    }

    public Message setContent(String content) {
        this.content = content;
        return this;
    }

    public Date getDateSent() {
        return dateSent;
    }

    public Message setDateSent(Date dateSent) {
        this.dateSent = dateSent;
        return this;
    }

    public Person getFromPerson() {
        return fromPerson;
    }

    public Message setFromPerson(Person fromPerson) {
        this.fromPerson = fromPerson;
        return this;
    }

    public Person getToPerson() {
        return toPerson;
    }

    public Message setToPerson(Person toPerson) {
        this.toPerson = toPerson;
        return this;
    }


}
