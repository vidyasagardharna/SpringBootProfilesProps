package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my")
public class EnvironmentRunner implements CommandLineRunner{
	
	private String message;
	
	private String code;
	
	private String mode;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public EnvironmentRunner() {
		super();
	}

	@Override
	public String toString() {
		return "EnvironmentRunner [message=" + message + ", code=" + code + ", mode=" + mode + "]";
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}
	
	

}
