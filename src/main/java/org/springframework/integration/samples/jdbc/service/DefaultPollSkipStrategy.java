package org.springframework.integration.samples.jdbc.service;

import org.springframework.integration.scheduling.PollSkipStrategy;

public class DefaultPollSkipStrategy implements PollSkipStrategy {

	private static boolean skip = false;
	
	@Override
	public boolean skipPoll() {
		// TODO Auto-generated method stub
		return skip;
	}

}
