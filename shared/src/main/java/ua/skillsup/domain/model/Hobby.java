package ua.skillsup.domain.model;

import ua.skillsup.domain.HasId;

public class Hobby extends HasId {

    private String title;
    private String description;

    public Hobby(String title) {
        this.title = title;
    }

    public Hobby() {
    }

    public String getTitle() {
        return title;
    }

    public Hobby setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Hobby setDescription(String description) {
        this.description = description;
        return this;
    }
}
