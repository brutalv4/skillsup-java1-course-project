package ua.skillsup.domain.model;

import ua.skillsup.domain.Dto;

import java.util.Date;

public class Friendship implements Dto {

    private Person ownerPerson;
    private Person friendPerson;
    private Date from;

    {
        from = new Date();
    }

    public Friendship(Person owner, Person friend) {
        this.ownerPerson = owner;
        this.friendPerson = friend;
    }

    public Person getOwnerPerson() {
        return ownerPerson;
    }

    public Person getFriendPerson() {
        return friendPerson;
    }
}
