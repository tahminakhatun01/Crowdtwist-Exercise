package com.crowdtwist.paymentprocess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CasualDresses 
{
	@FindBy(xpath="html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]/span")WebElement Addtocart;
	WebDriver driver;
	
	public CasualDresses(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public AddtoCart click()
	{
		Addtocart.click();
		return new AddtoCart(driver);
	}

}
