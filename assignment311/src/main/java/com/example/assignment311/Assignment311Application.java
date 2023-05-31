package com.example.assignment311;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Assignment311Application {
	@Autowired
	public Channel channel;

	@Autowired
	NotificationService notificationServie;

	@PostConstruct
    public void init() {
		Scanner scanner = new Scanner(System.in);

        // Code to be executed after the Spring container has completed configuration
		System.out.println("To?");
		String to = scanner.nextLine();

		System.out.println("Write message");
		String message = scanner.nextLine();

		notificationServie.setup(to, message);

		notificationServie.send();

		scanner.close();

    }

	public static void main(String[] args) {
		SpringApplication.run(Assignment311Application.class, args);
	
	}

	/*
		TODO:		
		- Create a @PostConstruct method to be executed after spring container has completed configuration.
		- Invite input using Scanner and System.in for value "to" and "message".
		- Set the input to setup(string, string) method in NotificationService.java.
		- Invoke send() method in Notification.java.
	*/

}
