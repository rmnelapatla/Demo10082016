package com.test.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
	
	public static WebDriver wb;
	
	public static void main(String ara[]) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Gitdemofinal\\workspace\\GoogleTest\\chromedriver.exe");
		wb = new ChromeDriver();
		wb.get("https://google.com");
		Thread.sleep(5000);
		wb.close();
		wb.quit();
		
		
		
		
	}

}
