package ua.skillsup.domain.model;

import ua.skillsup.domain.HasId;

public class Place extends HasId {

    private String title;
    private String description;
    private long latitude;
    private long longitude;

    public String getTitle() {
        return title;
    }

    public Place setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Place setDescription(String description) {
        this.description = description;
        return this;
    }

    public long getLatitude() {
        return latitude;
    }

    public Place setLatitude(long latitude) {
        this.latitude = latitude;
        return this;
    }

    public long getLongitude() {
        return longitude;
    }

    public Place setLongitude(long longitude) {
        this.longitude = longitude;
        return this;
    }

    public Place(String title) {
        this.title = title;
    }

    public Place() {
    }
}
