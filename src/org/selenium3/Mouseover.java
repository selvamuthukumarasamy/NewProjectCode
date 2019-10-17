package org.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selva\\Muthu\\SeleniumThirddayTask\\Driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.gettyimages.in/");
	
	Actions ac=new Actions(d);
	WebElement btn=d.findElement(By.xpath("(//a[text()='EDITORIAL'])[2]"));
	ac.moveToElement(btn);
	btn.click();
	WebElement btn1=d.findElement(By.xpath("(//a[text()='Entertainment'])"));
	ac.moveToElement(btn1);
	btn1.click();
	
	
	d.close();
	
	
	
}
}
