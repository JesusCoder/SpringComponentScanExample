package com.sun.steve.componentScanExample;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@ToString
public class Wife {
	
	@Setter @Getter
	private String name;
	
	@Setter @Getter
	private String faith;

}
