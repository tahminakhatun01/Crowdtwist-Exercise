package com.crowdtwist.paymentprocess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPTC 
{
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/form/div/p[2]/div/span/input")WebElement TermofCondition;
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button")WebElement PaymentPTC;
	WebDriver driver;
	
	public ShippingPTC(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);		
		
	}
	
	public PaymentPTC click()
	{
		TermofCondition.click();
		PaymentPTC.click();
		
		return new PaymentPTC(driver);
	}
	
	

}
