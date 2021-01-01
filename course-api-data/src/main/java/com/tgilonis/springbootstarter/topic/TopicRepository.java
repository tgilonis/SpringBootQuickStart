package com.tgilonis.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

//type string comes from the key of topic being string id
public interface TopicRepository extends CrudRepository<Topic, String>
{
    //boilerplate methods that we can automate by extending CrudRepository:

    //getAllTopics()
    //getTopic(String id)
    //updateTopic(Topic t)
    //deleteTopic(String id)



}
