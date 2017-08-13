package ua.skillsup.service.impl;

import ua.skillsup.dao.PostDao;
import ua.skillsup.domain.model.Person;
import ua.skillsup.domain.model.Post;
import ua.skillsup.domain.model.PostLike;
import ua.skillsup.service.PostService;

import java.util.List;

public class PostServiceImpl extends GenericService implements PostService {
    private final PostDao dao;

    public PostServiceImpl(PostDao dao) {
        this.dao = dao;
    }

    private void init() {

    }

    @Override
    public List<Post> getLatestPostsForUser(Person person, int count) {
        return null;
    }

    @Override
    public List<PostLike> getAllLikesForPost(Post post) {
        return null;
    }
}
