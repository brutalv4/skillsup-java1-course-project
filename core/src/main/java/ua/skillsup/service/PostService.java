package ua.skillsup.service;

import ua.skillsup.domain.model.Person;
import ua.skillsup.domain.model.Post;
import ua.skillsup.domain.model.PostLike;

import java.util.List;

public interface PostService extends Service {
    List<Post> getLatestPostsForUser(Person person, int count);
    List<PostLike> getAllLikesForPost(Post post);
}
