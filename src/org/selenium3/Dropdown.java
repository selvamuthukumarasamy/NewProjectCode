package org.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selva\\Muthu\\SeleniumThirddayTask\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.greenstechnologys.com/");
	WebElement link=driver.findElement(By.xpath("//a[text()='CONTACT US']"));
	link.click();
	WebElement txtname=driver.findElement(By.xpath("(//input[@name='name'])[1]"));
	txtname.sendKeys("string");
	WebElement txtemail =driver.findElement(By.xpath("(//input[@name='email'])[1]"));
	txtemail.sendKeys("abc@gmail.com");
	WebElement txtphone =driver.findElement(By.xpath("(//input[@name='phone'])[1]"));
	txtphone.sendKeys("7624377843");
	WebElement ddcourse =driver.findElement(By.xpath("(//select[@name='courses'])[1]"));
	Select sl=new Select(ddcourse);
	sl.selectByValue("Selenium");
	Thread.sleep(5000);
	WebElement ddbranch =driver.findElement(By.xpath("(//select[@name='branch'])[1]"));
	Select se=new Select(ddbranch);
	se.selectByValue("OMR");
	WebElement ddtime =driver.findElement(By.xpath("(//select[@name='time'])[1]"));
	Select sel=new Select(ddtime);
	sel.selectByValue("In 2 Weeks");
	WebElement txtarea =driver.findElement(By.xpath("(//textarea[@name='comments'])[1]"));
	txtarea.sendKeys("I need to train in Selenium Automation");
	
	}
	

}
