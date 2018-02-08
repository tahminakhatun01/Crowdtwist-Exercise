package com.crowdtwist.paymentprocess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirm 
{
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/p/a")WebElement BacktoOrder;
	WebDriver driver;
	
	public OrderConfirm(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public BacktoOrder click()
	{
		BacktoOrder.click();
		return new BacktoOrder(driver);
	}

}
