package com.crowdtwist.paymentprocess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart 
{
	@FindBy(xpath="html/body/div[1]/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")WebElement ProcesstoCheckout;
	WebDriver driver;
	
	public AddtoCart(WebDriver driver)
	{
		this.driver=driver;
				
		PageFactory.initElements(driver, this);
	}
	
	public ProcesstoCheckout click()
	
	{
		ProcesstoCheckout.click();
		return new ProcesstoCheckout(driver);
	}

}
