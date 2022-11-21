package popus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.guru99.com/test/delete_customer.php");
	
	//enter customer id
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
	
	//click on submit button
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	//switch to popup
	driver.switchTo().alert();
	
	//click on ok button
	//driver.switchTo().alert().accept();
	
	//click on cancel button
	//driver.switchTo().alert().dismiss();
	
	//get text on alert popup
	String sneha = driver.switchTo().alert().getText();
	System.out.println(sneha);
	   
	
}
}

	
	



