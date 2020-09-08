package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("MTH101","math","intro to math"),
			new Topic("Phy101", "Physics","intro to physics")
		));
	
	public List<Topic> getalltopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		// TODO Auto-generated method stub
		for(int i=0; i<topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				//return;
			}
		}
	}

	public void removeTopic(Topic topic, String id) {
		// TODO Auto-generated method stub
		topics.removeIf(t->t.getId().equals(id));
	}
}
