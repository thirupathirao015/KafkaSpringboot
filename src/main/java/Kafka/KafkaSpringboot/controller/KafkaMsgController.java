package Kafka.KafkaSpringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Kafka.KafkaSpringboot.service.Producer;

@RestController
@RequestMapping("/rest/api")
public class KafkaMsgController {

@Autowired	
Producer producer;

@GetMapping("/producer")
public void getMsgFromClient(@RequestParam("message") String msg) {
	producer.sendMsgtoTopic(msg);
	//http://localhost:8080/rest/api/producer?message="First kafka example"
}

}
