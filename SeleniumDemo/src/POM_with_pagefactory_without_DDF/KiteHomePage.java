package POM_with_pagefactory_without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
  //Declaration
	
@FindBy(xpath="//span[@class='user-id']")private WebElement userID;

   //Initialization
public KiteHomePage(WebDriver driver) {
PageFactory.initElements(driver,this);
}
  //Utilization
public void verifyuserID() {
	
	String expID="DPG458";
	String actID=userID.getText();
	if(expID.equals(actID)) {
		System.out.println("TC is pass");
	}
	else {
		System.out.println("TC is fail");
	}
}
}
