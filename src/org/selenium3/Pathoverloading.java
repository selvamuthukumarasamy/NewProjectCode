package org.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.Scanner;
public class Pathoverloading {

	private void testCase(String s1,String s2 ) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selva\\Muthu\\SeleniumThirddayTask\\Driver\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://www.facebook.com/");
	WebElement txtuser = d.findElement(By.xpath(("//input[@class=\"inputtext login_form_input_box\"][1]")));
	txtuser.sendKeys(s1);
	WebElement txtpass = d.findElement(By.xpath(("(//input[@class=\"inputtext login_form_input_box\"])[2]")));
	txtpass.sendKeys(s2);
	WebElement btnLogin= d.findElement(By.xpath(("//input[@id=\"u_0_b\"]")));
	btnLogin.click();
	d.quit();
	}
	public static void main(String[] args) {
		Pathoverloading p=new Pathoverloading();
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter User Name");
		//String a=sc.next();
		//System.out.println("Enter Password");
		//String b=sc.next();
		
		p.testCase("raj.csk24@gmail.com","9789400659");
		p.testCase("raj.csk24","9789400659");
		p.testCase("raj.csk24@gmail.com","400659");
		p.testCase("raj.@gmail.com","9789");
		
		
		
	}
}
