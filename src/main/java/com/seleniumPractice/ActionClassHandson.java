package com.seleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassHandson {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String fashionXpath  ="//img[@alt='Fashion']";
		WebElement fashionElement = driver.findElement(By.xpath(fashionXpath));
		Actions action = new Actions(driver);
		action.moveToElement(fashionElement).perform();
		List<WebElement> fashionDropDown = driver.findElements(By.xpath("(//object)[1]/a"));
		for(WebElement we : fashionDropDown) {
			System.out.println(we.getText());
			if(we.getText().equalsIgnoreCase("Bags, Suitcases & Luggage")) {
				we.click();
				break;
			}
		}
		driver.quit();
	}

}
