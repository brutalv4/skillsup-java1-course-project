package ua.skillsup.domain.model;

import ua.skillsup.domain.HasId;

public abstract class GenericDTO implements HasId {

    private long id;

    @Override
    public long gitId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }
}
