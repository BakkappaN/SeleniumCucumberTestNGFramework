package com.testautomation.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Demo1 
{
  @Test
  public void Test1() 
  {
	  //Execute selenium script on chrome browser
	  /*WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();*/
	  
	  //Execute selenium script on IE browser
	 /* WebDriverManager.iedriver().setup();
	  WebDriver driver=new InternetExplorerDriver();*/
	  
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.youtube.com/results?search_query=selenium+by+bakkappa+n");	  
	  driver.quit();
	  
  }
}
