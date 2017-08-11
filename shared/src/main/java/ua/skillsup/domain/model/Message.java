package ua.skillsup.domain.model;

import java.time.LocalDate;

public class Message extends GenericDTO {

    private String content;
    private LocalDate timeSent;
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

    public LocalDate getTimeSent() {
        return timeSent;
    }

    public Message setTimeSent(LocalDate timeSent) {
        this.timeSent = timeSent;
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
