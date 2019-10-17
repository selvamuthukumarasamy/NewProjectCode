package org.selenium3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotTask1 {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selva\\Muthu\\SeleniumThirddayTask\\Driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.facebook.com/");
	WebElement txtuser=d.findElement(By.id("email"));
	txtuser.sendKeys("selvamuthu");
	String a = txtuser.getAttribute("value");
	Actions ac=new Actions(d);
	Robot r =new Robot();
	
	ac.contextClick(txtuser).perform();
	for(int i =0;i<6;i++)
	{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	for (int j=0;j<5;j++)
	{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	System.out.println(a);
	WebElement txtpass=d.findElement(By.id("pass"));
	ac.contextClick(txtpass).perform();
	for(int i =1;i<=2;i++)
	{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	String s1=txtpass.getAttribute("value");

	System.out.println(s1);

}
}
