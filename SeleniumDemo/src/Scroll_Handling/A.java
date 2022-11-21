package Scroll_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	
	public static void main(String[]args)
	throws Throwable{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	//click on cancel button
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//scroll principle
		Thread.sleep(2000);
		
	JavascriptExecutor	jse= (JavascriptExecutor )driver;
	
	jse.executeScript("window.scrollBy(0,2000);");
	
	//scroll down
	Thread.sleep(3000);
	
	jse.executeScript("window.scrollBy(0,-1000);");
	//scroll up
	
		
	}

}
