package com.crowdtwist.SignupProcess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage 
{
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/form/div/div[2]/input")WebElement Emailaddress;
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button")WebElement CreateanAccount;
	WebDriver driver;
	public Landingpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public Registrationpage clickButton()
	{
		Emailaddress.sendKeys("testcrowdtwist1@gmail.com");
		CreateanAccount.click();
		
		System.out.println("click on create an account button");
		return new Registrationpage(driver);
	}

}
