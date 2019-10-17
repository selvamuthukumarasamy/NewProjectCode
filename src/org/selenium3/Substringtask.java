package org.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Substringtask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selva\\Muthu\\SeleniumThirddayTask\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		WebElement txt=driver.findElement(By.xpath("//div[contains(text(),'share')]"));
		String test=txt.getText();
		System.out.println(test);
		String test1=test.substring(31, 36);
		System.out.println(test1);
		WebElement txtuser=driver.findElement(By.id("email"));
		txtuser.sendKeys(test1);
		String right=txtuser.getAttribute("id");
		System.out.println(right);
		String correct=txtuser.getAttribute("value");
		System.out.println(correct);
		//driver.quit();
	
	
	
	}

}
