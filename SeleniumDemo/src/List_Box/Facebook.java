package List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
    Thread.sleep(4000);
    
    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
    Thread.sleep(4000);
    
    //store listbox in refernce varaible
 
    
    

}
}