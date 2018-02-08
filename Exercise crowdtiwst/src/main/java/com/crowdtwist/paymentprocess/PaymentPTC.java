package com.crowdtwist.paymentprocess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPTC 
{
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a")WebElement PaybyBankWire;
	WebDriver driver;
	
	public PaymentPTC(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public PaybyBankWire click()
	
	{
		PaybyBankWire.click();
		return new PaybyBankWire(driver);
	}

}
