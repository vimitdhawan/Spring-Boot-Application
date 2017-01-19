package io.newgen.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{topicId}/courses")
	public List<Course> getAllCourses(@PathVariable String topicId){
		return courseService.getAllCourses(topicId);
	}
	
	@RequestMapping("/topics/{topicId}/course/{id}")
	public Course getCourse(@PathVariable String topicId, @PathVariable String id){
		return courseService.getCourse(topicId, id);
		
	}
	
	@RequestMapping(method = RequestMethod.POST,  value="/topics/{topicId}/course")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId){
		courseService.addCourse(course, topicId);
		
	}
	
	/*@RequestMapping(method = RequestMethod.PUT,  value="/topic/{topicId}/course")
	public void updateTopic(@RequestBody Course course, @PathVariable String topicId){
		courseService.updateCourse(course, topicId);
	}
	*/
	
	
/*	@RequestMapping(method = RequestMethod.DELETE,  value="/course")
	public void deleteTopic(@RequestBody Course course){
		courseService.deleteCourse(course);
	}*/

}
