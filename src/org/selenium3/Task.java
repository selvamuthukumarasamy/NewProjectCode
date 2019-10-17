package org.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selva\\Muthu\\SeleniumThirddayTask\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(300);
		WebElement linktest=driver.findElement(By.xpath("//a[text()='Login & Signup']"));
		linktest.click();
		Thread.sleep(5000);
		WebElement txtuser=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtuser.sendKeys("9578684403");
		WebElement txtpass=driver.findElement(By.xpath("//input[@type='password']"));
		txtpass.sendKeys("abcdefg");
		WebElement btnlogin=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		btnlogin.click();
		
		//driver.quit();
		
		}

}
