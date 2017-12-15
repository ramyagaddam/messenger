package org.springframework.integration.samples.jdbc.service;

import org.springframework.messaging.Message;

public class Enricher1 {
	
	public void print(Message m) {
		System.out.println("Reached here:" + m.getPayload().toString());
	}

}
