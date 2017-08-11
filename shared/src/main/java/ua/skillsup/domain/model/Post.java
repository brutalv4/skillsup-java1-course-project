package ua.skillsup.domain.model;

import ua.skillsup.domain.HasId;

import java.util.Date;

public class Post extends HasId {

    private String title;
    private String content;
    private Date datePlaced;
    private Person personPlaced;

    public Post() {
    }

    public String getTitle() {
        return title;
    }

    public Post setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Post setContent(String content) {
        this.content = content;
        return this;
    }

    public Date getDatePlaced() {
        return datePlaced;
    }

    public Post setDatePlaced(Date datePlaced) {
        this.datePlaced = datePlaced;
        return this;
    }

    public Person getPersonPlaced() {
        return personPlaced;
    }

    public Post setPersonPlaced(Person personPlaced) {
        this.personPlaced = personPlaced;
        return this;
    }
}
