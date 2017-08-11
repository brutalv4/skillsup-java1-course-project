package ua.skillsup.domain;

public abstract class HasId implements Dto {

    private long id;

    public long gitId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
