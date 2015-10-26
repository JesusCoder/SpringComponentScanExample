package com.sun.steve.componentScanExample;

import lombok.Getter;
import lombok.ToString;

import org.springframework.stereotype.Service;

@Service
@ToString
public class Career {
	@Getter 
	private String jobType;
	
	@Getter 
	private int jobLevel;
}
