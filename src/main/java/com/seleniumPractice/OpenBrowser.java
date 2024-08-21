package com.seleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.launcher.Main;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;


public class OpenBrowser {

	public WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Browser");
		String broswerName  = sc.next();
		OpenBrowser ob = new OpenBrowser();
		ob.launchBrowser(broswerName);
		
		
		
	}
	public WebDriver launchBrowser(String browserName) {
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
