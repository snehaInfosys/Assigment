package List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    Thread.sleep(4000);
	    
	    //now we have to click(inspect )create new account button
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		//store listbox in reference variable
		Thread.sleep(4000);
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Thread.sleep(4000);

        //create object of select class
        Select s= new Select(month);
        Thread.sleep(4000);

       //now select class method 1 select by visible text
        s.selectByVisibleText("May");

       //store listbox in ref var for day
        Thread.sleep(4000);
        WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
        Thread.sleep(4000);

      //create obj of select class
        Select s1=new Select(date);
        s1.selectByValue("15");
       Thread.sleep(4000);

        //store listbox for year
         WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
         Thread.sleep(4000);
         
         Select s2= new Select(year);
         s2.selectByIndex(28);
         


	
	
	
	
	
	
	
	
	
	
	
	
	}
	


}
