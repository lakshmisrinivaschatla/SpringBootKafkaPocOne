package com.springboot.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.kafka.service.Producer;

@RestController
@RequestMapping("/kafka")
public class KafkaController 
{
	@Autowired
	private Producer producer;
	@GetMapping("/publish/{message}")
	public String publishMessageToKafkaTopic(@PathVariable("message") String message)
	{
		return producer.sendMessage(message);
	  
	}

}
