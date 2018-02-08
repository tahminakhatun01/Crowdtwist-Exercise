package com.crowd.ui.test;


	import org.junit.After;
	import org.junit.Test;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

import com.crowd.ui.test.BaseTest;
import com.crowdtwist.SignupProcess.Landingpage;
import com.crowdtwist.SignupProcess.Registrationpage;
import com.crowdtwist.paymentprocess.AddressPTC;
import com.crowdtwist.paymentprocess.AddtoCart;
import com.crowdtwist.paymentprocess.BacktoOrder;
import com.crowdtwist.paymentprocess.CasualDresses;
import com.crowdtwist.paymentprocess.DressPage;
import com.crowdtwist.paymentprocess.HomePage;
import com.crowdtwist.paymentprocess.OrderConfirm;
import com.crowdtwist.paymentprocess.PaybyBankWire;
import com.crowdtwist.paymentprocess.PaymentPTC;
import com.crowdtwist.paymentprocess.ProcesstoCheckout;
import com.crowdtwist.paymentprocess.ShippingPTC;
import com.crowdtwist.paymentprocess.SummaryPTC;

	

	public class SmokeTest extends BaseTest {
		
		HomePage homePage;
		DressPage dresspage;
		CasualDresses casualdresses;
		AddtoCart addtocart;
		ProcesstoCheckout processtocheckout;
		SummaryPTC summaryPTC;
		AddressPTC addressPTC;
		ShippingPTC shippingPTC;
		PaymentPTC paymentPTC;
		PaybyBankWire paybybankwire;
		OrderConfirm orderconfirm;
		BacktoOrder backtoorder;
		Landingpage lendingpage;
		Registrationpage providedata;
		
		@Test
		public void testPaymentProcess() {
		homePage=new HomePage(driver);
		dresspage=homePage.click();
		
		
		casualdresses =dresspage.click();
		addtocart=casualdresses.click();
		processtocheckout=addtocart.click();
		summaryPTC=processtocheckout.click();
		addressPTC=summaryPTC.click();
		shippingPTC=addressPTC.click();
		paymentPTC=shippingPTC.click();
		paybybankwire=paymentPTC.click();
		orderconfirm=paybybankwire.click();
	    backtoorder=orderconfirm.click();
		}
		
		@Test
		public void TestSignup()
		{
			lendingpage=new Landingpage(driver);
			providedata=lendingpage.clickButton();
			
		}


}
