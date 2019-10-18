package org.selenium3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selva\\Muthu\\SeleniumThirddayTask\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://www.greenstechnologys.com/");
		
		TakesScreenshot ts = (TakesScreenshot)wd;
		File source =ts.getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File dest= new File("E:\\selva\\login.png");
		FileUtils.copyFile(source,dest);
		System.out.println("ScreenShot Taken");
		
	}

}
