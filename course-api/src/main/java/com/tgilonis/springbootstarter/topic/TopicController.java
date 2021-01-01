package com.tgilonis.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

//A Spring controller typically maps a URI and an HTTP Method to a Functionality (a Java method)

@RestController //whatever we return from this class gets converted to JSON automatically as the response
public class TopicController
{

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}") //{id} means that id is a variable
    public Topic getTopic(@PathVariable String id)
    //pathvariable annotation maps the id variable in the requestmapping to the paramater id
    {
        return topicService.getTopic(id);
    }
}
