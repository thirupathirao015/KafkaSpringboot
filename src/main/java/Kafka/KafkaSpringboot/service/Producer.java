package Kafka.KafkaSpringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	
	
	@Autowired
	KafkaTemplate<String, String> kafkatemplate;
	
	public void sendMsgtoTopic(String message) {
		kafkatemplate.send("Testing_Topic", message);
	}
	
	

}
