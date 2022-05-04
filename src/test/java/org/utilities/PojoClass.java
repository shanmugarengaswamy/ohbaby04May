package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefintion.LoginStepDefinition;

public class PojoClass extends BaseClass {
	
	public void PojoClass() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(xpath="//img[@alt='Close']")
	private WebElement CommonPopupClosing;
	
	@CacheLookup
	@FindBy(id="customer_email")
	private WebElement TC1;
	
	@CacheLookup
	@FindBy(xpath="(//a[text()='New Arrivals'])[2]")
	private WebElement TC2;
	
	@CacheLookup
	@FindBy(xpath="(//a[text()='New Arrivals'])[2]")
	private WebElement TC3;
	@CacheLookup
	@FindBy(xpath="(//a[@title='oh baby!'])[1]")
	private WebElement TC4;
	@CacheLookup
	@FindBy(xpath="//span[@class='icon-search']")
	private WebElement TC5;
	@CacheLookup
	@FindBy(xpath="(//li[@class='sub-menu'])[1]")
	private WebElement TC6;
	@CacheLookup
	@FindBy(xpath="(//li[@class='sub-menu'])[2]")
	private WebElement TC7;
	@CacheLookup
	@FindBy(xpath="(//li[@class='sub-menu'])[3]")
	private WebElement TC8;
	@CacheLookup
	@FindBy(id="customer_password")
	private WebElement TC9;
	@CacheLookup
	@FindBy(id="customer_password")
	private WebElement TC10;
	@CacheLookup
	@FindBy(id="customer_password")
	private WebElement TC11;
	@CacheLookup
	@FindBy(id="customer_password")
	private WebElement TC12;
	@CacheLookup
	@FindBy(id="customer_password")
	private WebElement TC13;
	@CacheLookup
	@FindBy(id="customer_password")
	private WebElement TC14;
	@CacheLookup
	@FindBy(id="customer_password")
	private WebElement TC15;
	@CacheLookup
	@FindBy(id="customer_password")
	private WebElement TC16;
	@CacheLookup
	@FindBy(id="customer_password")
	private WebElement TC17;
	@CacheLookup
	@FindBy(id="customer_password")
	private WebElement TC18;
	@CacheLookup
	@FindBy(id="customer_password")
	private WebElement TC19;
	@CacheLookup
	@FindBy(id="customer_password")
	private WebElement TC20;
	@CacheLookup
	@FindBy(id="customer_password")
	private WebElement TC21;
	@CacheLookup
	@FindBy(id="customer_password")
	private WebElement TC22;
	@CacheLookup
	@FindBy(id="customer_password")
	private WebElement TC23;
	@CacheLookup
	@FindBy(id="customer_password")
	private WebElement TC24;
	@CacheLookup
	@FindBy(id="customer_password")
	private WebElement TC25;
	public WebElement getCommonPopupClosing() {
		return CommonPopupClosing;
	}
	public WebElement getTC1() {
		return TC1;
	}
	public WebElement getTC2() {
		return TC2;
	}
	public WebElement getTC3() {
		return TC3;
	}
	public WebElement getTC4() {
		return TC4;
	}
	public WebElement getTC5() {
		return TC5;
	}
	public WebElement getTC6() {
		return TC6;
	}
	public WebElement getTC7() {
		return TC7;
	}
	public WebElement getTC8() {
		return TC8;
	}
	public WebElement getTC9() {
		return TC9;
	}
	public WebElement getTC10() {
		return TC10;
	}
	public WebElement getTC11() {
		return TC11;
	}
	public WebElement getTC12() {
		return TC12;
	}
	public WebElement getTC13() {
		return TC13;
	}
	public WebElement getTC14() {
		return TC14;
	}
	public WebElement getTC15() {
		return TC15;
	}
	public WebElement getTC16() {
		return TC16;
	}
	public WebElement getTC17() {
		return TC17;
	}
	public WebElement getTC18() {
		return TC18;
	}
	public WebElement getTC19() {
		return TC19;
	}
	public WebElement getTC20() {
		return TC20;
	}
	public WebElement getTC21() {
		return TC21;
	}
	public WebElement getTC22() {
		return TC22;
	}
	public WebElement getTC23() {
		return TC23;
	}
	public WebElement getTC24() {
		return TC24;
	}
	public WebElement getTC25() {
		return TC25;
	}
}
