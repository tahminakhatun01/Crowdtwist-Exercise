package com.crowdtwist.SignupProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registrationpage 
{ 
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[1]/div[2]/label/div/span/input")WebElement radiobutton;
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[2]/input")WebElement FirstName;
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[3]/input")WebElement LastName;
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[5]/input")WebElement Password;
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[7]/div/span/input")WebElement Newslettercheckbox;
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[8]/div/span/input")WebElement receiveOffers;
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[4]/input")WebElement Address;
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[6]/input")WebElement City;
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[8]/input")WebElement Zipcode;
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[13]/input")WebElement MobileNumber;
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div/div/form/div[4]/button")WebElement Register;
	
	WebDriver driver;
	
	public Registrationpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void provideData()
	{
		radiobutton.click();
		FirstName.sendKeys("test");
		LastName.sendKeys("crowdtwist");
		Password.sendKeys("Crowdtwist1");
		
		

		//Date Of Birth drop-down
		Select select1= new Select(driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[1]/div/select")));
		select1.selectByValue("1");
		Select select2= new Select(driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[2]/div/select")));
		select2.selectByVisibleText("January");
		Select select3= new Select(driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[3]/div/select")));
		select3.selectByValue("1991");
		
		Newslettercheckbox.click();
		receiveOffers.click();
		Address.sendKeys("1111 1st street");
		City.sendKeys("New York");
		
		
		
		//State drop-down section
		Select selectstate=new Select(driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[7]/div/select")));
		selectstate.selectByVisibleText("New York");
		
		Zipcode.sendKeys("11017");
		MobileNumber.sendKeys("123-123-1234");
		Register.click();
		
		driver.quit();
	}

}
