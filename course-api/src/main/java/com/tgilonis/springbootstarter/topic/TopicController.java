package com.tgilonis.springbootstarter.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//A Spring controller typically maps a URI and an HTTP Method to a Functionality (a Java method)

@RestController //whatever we return from this class gets converted to JSON automatically as the response
public class TopicController
{

    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {
        return Arrays.asList(
                new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java", "Core Java", "Core Java Description"),
                new Topic("javascript", "JavaScript", "JavaScript Description")
        );
    }
}
