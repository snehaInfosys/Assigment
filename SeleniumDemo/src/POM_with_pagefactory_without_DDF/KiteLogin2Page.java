package POM_with_pagefactory_without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page {
	
	//Declaration
@FindBy(xpath="//input[@id='pin']")private WebElement PIN;

@FindBy(xpath="//button[@type='submit']")private WebElement cntBtn;

   //Initialization
public KiteLogin2Page (WebDriver driver) {
PageFactory.initElements(driver,this);
}

  //Utilization
public void enterPIN() {
	PIN.sendKeys("171992");
}
public void clickBtn() {
	cntBtn.click();
	
}
}
