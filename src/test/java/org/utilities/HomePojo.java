package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePojo extends BaseClass{
	public HomePojo() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getNewArrival() {
		return NewArrival;
	}

	public WebElement getOhBabyLogo() {
		return OhBabyLogo;
	}

	public WebElement getSeachBox() {
		return SeachBox;
	}

	@CacheLookup
	@FindBy(xpath="(//a[text()='New Arrivals'])[2]")
	private WebElement NewArrival;
	
	@FindBy(xpath="//img[@class='secondary_logo']")
	private WebElement OhBabyLogo;
	
	@CacheLookup
	@FindBy(xpath="//span[@class='icon-search']")
	private WebElement SeachBox;

}
