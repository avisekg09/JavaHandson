package com.javaHandson;

public interface PracticeInterfaceTopics {
	
	/*
	 * what is interface - Interface is the class that contains method signature without body
	 *						Class will define and implement the methods of interface. Implements keyword is used to implement interface
	 *						We cannot create the object of the interface rather we can create the object of the class that is implementing the interface
	 *						One class can implement multiple interface 
	 *						If we define a variable in interface then the Public will be the bydefault access modifier
	 *
	 *WebDridver is an interface WebDriver driver = new ChromeDriver(); 
	 *we can you like ChromeDriver driver = new ChromeDriver(); it will not throw any error
	 *but you can only use methods defined in the chromedriver class
	 */

	public void run();
	public void walk();
}
