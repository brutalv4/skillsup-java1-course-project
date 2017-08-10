package ua.skillsup.service.impl;

import ua.skillsup.service.InterestService;
import ua.skillsup.service.MainService;
import ua.skillsup.service.PersonService;
import ua.skillsup.service.PostService;

public class MainServiceImpl extends GenericService implements MainService {

    private PersonService personService;
    private PostService postService;
    private InterestService interestService;

    public MainServiceImpl(PersonService personService, PostService postService, InterestService interestService) {
        this.personService = personService;
        this.postService = postService;
        this.interestService = interestService;
    }

    public MainServiceImpl() {
    }
}
