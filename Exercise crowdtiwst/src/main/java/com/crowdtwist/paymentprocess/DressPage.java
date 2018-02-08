package com.crowdtwist.paymentprocess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressPage 
{
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div[2]/div[2]/ul/li[1]/div[1]/a/img")WebElement CasualDresses;
	
	WebDriver driver;
	public DressPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public CasualDresses click()
	{
		CasualDresses.click();
		
		return new CasualDresses(driver);
	}
}
