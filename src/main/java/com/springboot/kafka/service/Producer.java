package com.springboot.kafka.service;

import java.io.BufferedReader;
import java.io.FileReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer 
{
	private  final Logger logger=LoggerFactory.getLogger(Producer.class);
	private final String TOPIC="kroger";
	@Autowired
	private  KafkaTemplate<String,String> kafkaTemplate;
	
	
	
	public String sendMessage(String message)
	{
		logger.info("Sending message from Producer---->"+message);
		
		// kafkaTemplate.send(TOPIC,message);
		try
		{
		BufferedReader br=new BufferedReader(new FileReader("C:\\Python27\\NEWS.txt"));
		String line;
		while((line=br.readLine())!=null)
		{
			 
			  kafkaTemplate.send(TOPIC,line);
			line=br.readLine();
				}
		br.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			
		}
	 return "Published the message successfully";
	}

}
