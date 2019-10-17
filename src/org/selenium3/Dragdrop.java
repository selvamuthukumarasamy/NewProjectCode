package org.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selva\\Muthu\\SeleniumThirddayTask\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement s=d.findElement(By.id("credit2"));
		WebElement de=d.findElement(By.id("bank"));
		Actions acc=new Actions(d);
		acc.dragAndDrop(s,de).perform();
		
		WebElement s1=d.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		WebElement d1=d.findElement(By.id("amt7"));
		acc.dragAndDrop(s1,d1).perform();
		
		WebElement s2=d.findElement(By.id("credit1"));
		WebElement d2=d.findElement(By.id("loan"));
		acc.dragAndDrop(s2,d2).perform();
		
		WebElement s3=d.findElement(By.xpath("(//li[@id='fourth'])[1]"));
		WebElement d3=d.findElement(By.id("amt8"));
		acc.dragAndDrop(s3,d3).perform();	
	}
}
