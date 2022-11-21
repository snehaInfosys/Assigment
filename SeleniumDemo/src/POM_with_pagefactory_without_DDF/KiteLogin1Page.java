package POM_with_pagefactory_without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page {

	//step1 Declaration
	
@FindBy(xpath="//input[@id='userid']")private WebElement UN;

@FindBy(xpath="//input[@id='password']")private WebElement PWD;

@FindBy(xpath="//button[@type=\"submit\"]")private WebElement LOGINBTN;

   //step2 Initialization

public KiteLogin1Page(WebDriver driver) {
PageFactory.initElements(driver,this);
}

  //Utilization
public void enterUN() {
	UN.sendKeys("DPG458");
}
public void enterPWD() {
	PWD.sendKeys("Amol@1234");
}
public void clickLoginBTN() {
	LOGINBTN.click();
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

