package com.seleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkFinder {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> links = driver.findElements(By.xpath("//a[@href]"));
		URL url;
		int resCode;
		int count = 0;
		int workingLinks = 0;
		for(WebElement link : links) {
			url = new URL(link.getAttribute("href"));
			try {
			HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
			resCode = connection.getResponseCode();
			if(resCode == 200) {
				workingLinks++;
			}
			}catch (Exception e) {
				System.out.println(e);
				count++;
			}
			
//			System.out.println(link.getAttribute("href"));
		}
		System.out.println("No of broken Links - "+count+ " and working links - "+workingLinks);
	}

}
