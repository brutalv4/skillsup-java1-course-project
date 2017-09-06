package ua.skillsup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.skillsup.service.InterestService;
import ua.skillsup.service.MainService;
import ua.skillsup.service.PersonService;
import ua.skillsup.service.PostService;

@Service
public class MainServiceImpl extends GenericService implements MainService {

    private final PersonService personService;
    private final PostService postService;
    private final InterestService interestService;

    @Autowired
    public MainServiceImpl(PersonService personService, PostService postService, InterestService interestService) {
        this.personService = personService;
        this.postService = postService;
        this.interestService = interestService;
    }
}
