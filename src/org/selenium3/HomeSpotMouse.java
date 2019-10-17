package org.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeSpotMouse {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selva\\Muthu\\SeleniumThirddayTask\\Driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.homedepot.com/");
	
	Actions ac=new Actions(d);
	WebElement btn=d.findElement(By.xpath("//a[text()='All Departments']"));
	ac.moveToElement(btn).perform();
    Thread.sleep(5000);
	WebElement btn1=d.findElement(By.xpath("//a[text()='Heating & Cooling']"));
	ac.moveToElement(btn1).perform();
	Thread.sleep(3000);
	WebElement btnsf = d.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
	ac.moveToElement(btnsf).perform();
	WebElement btn3 = d.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
	btn3.click();
	
	d.close();
}
}
