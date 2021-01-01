package com.tgilonis.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String>
{
    //given this particular method name (findByProperty) format, Spring Data JPA implements the method for us
    public List<Course> findByName(String name);

    //here we specify findByPropertyProperty i.e. the property of the property
    //topic is a property of course, and id is a property of topic
    public List<Course> findByTopicId(String id);

}
