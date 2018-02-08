package com.crowdtwist.paymentprocess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPTC 
{
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/form/p/button")WebElement ShippingPTC;
	WebDriver driver;
	
	public AddressPTC(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public ShippingPTC click()
	{
		ShippingPTC.click();
		return new ShippingPTC(driver);
	}

}
