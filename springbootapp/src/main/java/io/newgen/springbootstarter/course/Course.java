package io.newgen.springbootstarter.course;


import io.newgen.springbootstarter.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


// this is course class
@Entity
public class Course {
	@Id
	private String id;
	private String name;
	private String description;
	
	@ManyToOne
	private Topic topic;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}

}
