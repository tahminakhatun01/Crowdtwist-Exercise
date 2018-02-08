package com.crowdtwist.paymentprocess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")WebElement DressTab;
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public DressPage click()
	{
		DressTab.click();
		
		return new DressPage(driver);
	}

}
