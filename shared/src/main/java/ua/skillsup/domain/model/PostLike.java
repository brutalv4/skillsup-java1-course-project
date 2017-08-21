package ua.skillsup.domain.model;

public class PostLike {

    private Post post;
    private Person person;

    public PostLike(Post post, Person person) {
        this.post = post;
        this.person = person;
    }

    public PostLike() {
    }

    public Post getPost() {
        return post;
    }

    public PostLike setPost(Post post) {
        this.post = post;
        return this;
    }

    public Person getPerson() {
        return person;
    }

    public PostLike setPerson(Person person) {
        this.person = person;
        return this;
    }
}
