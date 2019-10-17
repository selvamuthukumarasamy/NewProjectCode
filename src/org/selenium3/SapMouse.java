package org.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SapMouse {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selva\\Muthu\\SeleniumThirddayTask\\Driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("http://greenstech.in/selenium-course-content.html");
	
	Actions ac=new Actions(d);
	WebElement btn=d.findElement(By.xpath("//a[text()='COURSES']"));
	ac.moveToElement(btn).perform();
    Thread.sleep(5000);
	WebElement btnsf = d.findElement(By.xpath("//span[text()='SAP Training ']"));
	ac.moveToElement(btnsf).perform();
	WebElement btn3 = d.findElement(By.xpath("//span[text()='SAP MM Training']"));
	btn3.click();
	//WebElement btn2 = d.findElement(By.xpath(""));
	//String st=btn2.getText();
	//System.out.println(st);
	d.close();
}
}
