package com.osa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
/**
 * This openBrowser method will take the browser name as string parameter, 
 * Enter either chrome or firefox
 * @param browser
 * @return
 */
public static WebDriver openBrowser(String browser) { 
	WebDriver dr=null;
	if(System.getProperty("os.name").toLowerCase().contains("windows")) {
		if(browser.toLowerCase().equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\13472\\Desktop\\BDD_Final\\chromedriver.exe");
		    dr=new ChromeDriver();
		}else if(browser.toLowerCase().equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\drivers\\win\\geckodriver.exe");
			dr=new FirefoxDriver();
		}
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //webDirver wait
	}else {
		System.out.println("===========The test is running on "+System.getProperty("os.name")+"==========");
		if(browser.toLowerCase().equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/mac/chromedriver");
		    dr=new ChromeDriver();
		}else if(browser.toLowerCase().equals("firefox")) {
			System.setProperty("", "");
			dr=new FirefoxDriver();
		}
	}
	return dr;
  }
}