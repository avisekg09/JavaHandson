package com.seleniumPractice;

import org.openqa.selenium.*;

import com.sun.tools.javac.launcher.Main;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Write a script for the following:
 Open the browser
 Delete all cookies
 Set size of the window
 Set position of the window
 Maximize the window

 */
public class OpenBrowser {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Browser");
		String broswerName =  "Chrome";//= sc.next();
		OpenBrowser ob = new OpenBrowser();
		ob.Driver(broswerName).get("https://www.google.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");
		Thread.sleep(2000);
		
//		org.openqa.selenium.Dimension d = new Dimension(500,400);
//		driver.manage().window().setSize(d);
//		Point p = new Point(50,500);
//		driver.manage().window().setPosition(p);
//		driver.navigate().refresh();
		
	}
	public WebDriver Driver(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			return driver;
		}else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.chromedriver().setup();
			WebDriverManager.edgedriver().setup();
		}else {
			System.out.println("Invalid Input");
		}
		return driver;
	}
}
