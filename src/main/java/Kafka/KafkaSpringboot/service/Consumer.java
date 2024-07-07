package Kafka.KafkaSpringboot.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	@KafkaListener(topics = "Testing_Topic", groupId = "testingtopic-group")
	public void listenToTopic(String receivemsg) {
		System.out.println("111111111111111 :"+receivemsg);		
	}

}
