package org.selenium3;

//import java.awt.AWTException;
//import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class RobotTask2 {
public static void main(String[] args) throws Throwable  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Selva\\Muthu\\SeleniumThirddayTask\\Driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.google.co.in/webhp ");
	WebElement ap=d.findElement(By.xpath("//a[@title='Google apps']"));
	//Actions ac=new Actions(d);
	//Robot r=new Robot();
	ap.click();
	d.switchTo().frame("I0_1570877400201");
	//WebElement gmail=d.findElement(By.tagName("iframe"));
	WebElement gm=d.findElement(By.xpath("//span[@pid='23']"));
	gm.click();
	d.close();
}
}