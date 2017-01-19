package io.newgen.springbootstarter.course;

import io.newgen.springbootstarter.topic.Topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId){
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String topicId, String id){
		return (Course) courseRepository.findByTopicId(topicId).stream().filter(c -> c.getId().equals(id));
	}

	public void addCourse(Course course, String topicId) {
		Topic topic = new Topic();
		topic.setId(topicId);
		course.setTopic(topic);
		courseRepository.save(course);
	}

	/*public void updateCourse(Course course, String topicId) {
		course.setTopicId(topicId);
		courseRepository.save(course);
	}*/
	
	/*public void deleteCourse(Course course) {
		courseRepository.delete(course);
	}*/
}