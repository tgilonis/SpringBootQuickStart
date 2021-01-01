package com.tgilonis.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    //default request is a get request, in the addTopic() method we can see how to specify the type of request
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

    @RequestMapping(method = RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody Topic topic)
    //RequestBody annotation used to grab the body from the post url and convert it into a topic
    {
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/topics/{id}")
    public void updateTopic(@RequestBody Topic topic,
                            @PathVariable String id)
    //RequestBody annotation used to grab the body from the post url and convert it into a topic
    {
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}")
    public void deleteTopic(@PathVariable String id)
    {
        topicService.deleteTopic(id);
    }
}
