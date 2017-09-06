package ua.skillsup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.skillsup.dao.PostDao;
import ua.skillsup.domain.model.Person;
import ua.skillsup.domain.model.Post;
import ua.skillsup.domain.model.PostLike;
import ua.skillsup.service.PostService;

import java.util.List;

@Service
public class PostServiceImpl extends GenericService implements PostService {
    private final PostDao dao;

    @Autowired
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
