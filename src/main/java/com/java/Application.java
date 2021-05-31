package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
private Map<String,Object> cahe = new HashMap<String,Object>();
private static final String RESt_URL="https://www.equifax.com/grtScores";
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
	int a=10; 
}

      public void loadDataToCache(){
logic //
}     
}
