package org.selenium3;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebdesignMouse {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Selva\\Muthu\\SeleniumThirddayTask\\Driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://greenstech.in/selenium-course-content.html");
    driver.manage().window().maximize();
    
    Actions ac=new Actions(driver);
    WebElement btn=driver.findElement(By.xpath("//a[text()='COURSES']"));
	ac.moveToElement(btn).perform();
	
	
    WebElement btnln=driver.findElement(By.xpath("//span[text()='Web Designing Training']"));
	ac.moveToElement(btnln).perform();
	
	WebElement btnsn=driver.findElement(By.xpath("//span[text()='JavaScript Training']"));
	ac.moveToElement(btnsn).perform();	
	driver.close();
}    
}

