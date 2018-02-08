package com.crowdtwist.paymentprocess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProcesstoCheckout 
{
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span")WebElement SummaryPTC;
	WebDriver driver;
	
	public ProcesstoCheckout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public SummaryPTC click()
	{
		SummaryPTC.click();
		return new SummaryPTC(driver);
	}
}
