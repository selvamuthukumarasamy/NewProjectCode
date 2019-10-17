
package org.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopCuleMouse {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selva\\Muthu\\SeleniumThirddayTask\\Driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.shopclues.com/wholesale.html");
	
	Actions ac=new Actions(d);
	WebElement btn=d.findElement(By.xpath("//a[text()='Mobiles & Electronics']"));
	ac.moveToElement(btn).perform();
Thread.sleep(5000);
	WebElement btn1=d.findElement(By.xpath("//a[text()='Rs.5001 - Rs.10000']"));
	ac.moveToElement(btn1).perform();
	btn1.click();
	
	
	d.close();
}
}
