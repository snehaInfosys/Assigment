package POM_with_pagefactory_without_DDF;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTest {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	
	//maximize
driver.manage().window().maximize();
    //implicitly wait

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
  
   //1ST pom class
KiteLogin1Page login1=new KiteLogin1Page(driver);
 login1.enterUN();
 login1.enterPWD();
 login1.clickLoginBTN();
 
 //2nd pom class
 KiteLogin2Page login2 =new KiteLogin2Page(driver);
 login2.enterPIN();
 login2.clickBtn();
 
 //3rd pom class
 KiteHomePage home=new KiteHomePage(driver);
 
 home.verifyuserID();
	
}

}
