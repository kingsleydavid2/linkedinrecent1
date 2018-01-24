package com.linkedin.page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class linkedinlogin {
	
	@Test
	public void login() throws InterruptedException{
		System.setProperty("WebDriver.chrome.driver", "C://eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.linkedin.com");
		driver.findElement(By.name("session_key")).sendKeys("tstchennai16@gmail.com");
		driver.findElement(By.name("session_password")).sendKeys("thestreet");
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(3000);
		String str = driver.getTitle();
	    System.out.println(str);
		assertEquals("(99+) LinkedIn" , driver.getTitle());
		
				
		
		}

}
