package org.stepdefintion;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.stepdefintion.LoginStepDefinition;
import org.utilities.BaseClass;
import org.utilities.PojoClass;



public class LoginStepDefinition extends BaseClass {

	@Given("launch the chrome and load the url and maximize")
	public void launchTheChromeAndLoadTheUrlAndMaximize() {
		tolaunchChrome();
		toGetUrl("https://ohbabystyle.com/");
		toGetCurrentUrl();
		toWinMax();
		toPrintTitle();

	}

	@When("TC_OBS_ONE User should Launch https:\\/\\/ohbabystyle.com\\/ URL")
	public void tc_obs_oneUserShouldLaunchHttpsOhbabystyleComURL() {
	    
	}

	@Then("TC_OBS_ONE validate the Credential of WebElement in Webpage")
	public void tc_obs_oneValidateTheCredentialOfWebElementInWebpage() {
	    
	}

	@When("TC_OBS_TWO User should able to view NEW ARRIVALS in Home page")
	public void tc_obs_twoUserShouldAbleToViewNEWARRIVALSInHomePage() {
//		PojoClass p = new PojoClass();
//		String newArrival = toGetText(p.getTC2());
//		Assert.assertTrue("Verify the NEW ARRIVALS in Home Page Present or Not ", newArrival.contains("NEW ARRIVAL"));
//		
	//	WebElement Verify = driver.findElement(By.xpath("(//a[text()='New Arrivals'])[2]"));
	//	String Print = Verify.getText();
	//	System.out.println(Print);
	
	}

	@Then("TC_OBS_TWO validate the Credential of WebElement in Webpage")
	public void tc_obs_twoValidateTheCredentialOfWebElementInWebpage() {
	    
	}

	@When("TC_OBS_Three User should able to view NEW ARRIVALS Link is available in Home page")
	public void tc_obs_threeUserShouldAbleToViewNEWARRIVALSLinkIsAvailableInHomePage() {
		WebElement link = driver.findElement(By.xpath("(//a[text()='New Arrivals'])[2]"));
		link.click();

		
	}

	@Then("TC_OBS_Three validate the Credential of WebElement in Webpage")
	public void tc_obs_threeValidateTheCredentialOfWebElementInWebpage() {
	    
	}

	@When("TC_OBS_Four User should able to view the Oh baby! Logo available in Home page")
	public void tc_obs_fourUserShouldAbleToViewTheOhBabyLogoAvailableInHomePage() {
		WebElement Verify = driver.findElement(By.xpath("(//a[@title='oh baby!'])[1]"));
		String Print = Verify.getText();
		System.out.println(Print);
		    
	}

	@Then("TC_OBS_Four validate the Credential of WebElement in Webpage")
	public void tc_obs_fourValidateTheCredentialOfWebElementInWebpage() {
	    
	}

	@When("TC_OBS_FIVE User should able to view Search button is available in Home page")
	public void tc_obs_fiveUserShouldAbleToViewSearchButtonIsAvailableInHomePage() {
		WebElement Verify = driver.findElement(By.xpath("//span[@class='icon-search']"));
		String Print = Verify.getText();
		System.out.println(Print);
	
	}

	@Then("TC_OBS_FIVE validate the Credential of WebElement in Webpage")
	public void tc_obs_fiveValidateTheCredentialOfWebElementInWebpage() {
	   
	}
	
	@When("TC_OBS_SIX User should able to view DropDown BABY in Home page")
	public void tc_obs_sixUserShouldAbleToViewDropDownBABYInHomePage() {
		WebElement Verify = driver.findElement(By.xpath("(//li[@class='sub-menu'])[1]"));
		String Print = Verify.getText();
		System.out.println(Print);
	
	}

	@Then("TC_OBS_SIX validate the Credential of WebElement in Webpage")
	public void tc_obs_sixValidateTheCredentialOfWebElementInWebpage() {
	    
	}

	@When("TC_OBS_SEVEN User should able to view the DropDown GIRLS is available in Home Page")
	public void tc_obs_sevenUserShouldAbleToViewTheDropDownGIRLSIsAvailableInHomePage() {
		WebElement Verify = driver.findElement(By.xpath("(//li[@class='sub-menu'])[2]"));
		String Print = Verify.getText();
		System.out.println(Print);
	
	}

	@Then("TC_OBS_SEVEN validate the Credential of WebElement in Webpage")
	public void tc_obs_sevenValidateTheCredentialOfWebElementInWebpage() {
	    
	}

	@When("TC_OBS_EIGHT User should able to view DropDown BOYS is available in Home Page")
	public void tc_obs_eightUserShouldAbleToViewDropDownBOYSIsAvailableInHomePage() {
		WebElement Verify = driver.findElement(By.xpath("(//li[@class='sub-menu'])[3]"));
		String Print = Verify.getText();
		System.out.println(Print);
	    
	}

	@Then("TC_OBS_EIGHT validate the Credential of WebElement in Webpage")
	public void tc_obs_eightValidateTheCredentialOfWebElementInWebpage() {
	    
	}

	@When("TC_OBS_NINE User should able to view the Privacy Policy , Return Policy , FAQs , Terms and Conditions , Shipping Info , Reviews is available in Home Page")
	public void tc_obs_nineUserShouldAbleToViewThePrivacyPolicyReturnPolicyFAQsTermsAndConditionsShippingInfoReviewsIsAvailableInHomePage() {
		WebElement Verify1 = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		String Print = Verify1.getText();
		System.out.println(Print);
		WebElement Verify2 = driver.findElement(By.xpath("//a[text()='Return Policy']"));
		String Print1 = Verify2.getText();
		System.out.println(Print1);
		WebElement Verify3 = driver.findElement(By.xpath("//a[text()='FAQs']"));
		String Print2 = Verify3.getText();
		System.out.println(Print2);
		WebElement Verify4 = driver.findElement(By.xpath("//a[text()='Terms and Conditions']"));
		String Print3 = Verify4.getText();
		System.out.println(Print3);
		WebElement Verify5 = driver.findElement(By.xpath("//a[text()='Shipping Info']"));
		String Print4 = Verify5.getText();
		System.out.println(Print4);
		WebElement Verify6 = driver.findElement(By.xpath("//a[text()='Reviews']"));
		String Print5 = Verify6.getText();
		System.out.println(Print5);
	    
	}

	@Then("TC_OBS_NINE validate the Credential of WebElement in Webpage")
	public void tc_obs_nineValidateTheCredentialOfWebElementInWebpage() {
	    
	}

	@When("TC_OBS_TEN User should able to view the link of Privacy Policy , Return Policy , FAQs , Terms and Conditions , Shipping Info , Reviews is working")
	public void tc_obs_tenUserShouldAbleToViewTheLinkOfPrivacyPolicyReturnPolicyFAQsTermsAndConditionsShippingInfoReviewsIsWorking() {
		WebElement Verify1 = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		Verify1.click();
		WebElement Verify2 = driver.findElement(By.xpath("//a[text()='Return Policy']"));
		Verify2.click();
		WebElement Verify3 = driver.findElement(By.xpath("//a[text()='FAQs']"));
		Verify3.click();
		WebElement Verify4 = driver.findElement(By.xpath("//a[text()='Terms and Conditions']"));
		Verify4.click();
		WebElement Verify5 = driver.findElement(By.xpath("//a[text()='Shipping Info']"));
		Verify5.click();
		WebElement Verify6 = driver.findElement(By.xpath("//a[text()='Reviews']"));
		Verify6.click();
	
	}

	@Then("TC_OBS_TEN validate the Credential of WebElement in Webpage")
	public void tc_obs_tenValidateTheCredentialOfWebElementInWebpage() {
	   
	}

	@When("TC_OBSELEVEN User should able to view DropDown GIFTS is available in Home Page")
	public void tc_obselevenUserShouldAbleToViewDropDownGIFTSIsAvailableInHomePage() {
		WebElement Verify = driver.findElement(By.xpath("(//li[@class='sub-menu'])[4]"));
		String Print = Verify.getText();
		System.out.println(Print);
	
	}

	@Then("TC_OBSELEVEN validate the Credential of WebElement in Webpage")
	public void tc_obselevenValidateTheCredentialOfWebElementInWebpage() {
	}

	@When("TC_OBSTWELVE User should able to view DropDown NURSERY is available in Home Page")
	public void tc_obstwelveUserShouldAbleToViewDropDownNURSERYIsAvailableInHomePage() {
		WebElement Verify = driver.findElement(By.xpath("(//li[@class='sub-menu'])[5]"));
		String Print = Verify.getText();
		System.out.println(Print);
	
	}

	@Then("TC_OBSTWELVE validate the Credential of WebElement in Webpage")
	public void tc_obstwelveValidateTheCredentialOfWebElementInWebpage() {
	
	}

	@When("TC_OBSTHIRTEEN User should able to view DropDown SALE is available in Home Page")
	public void tc_obsthirteenUserShouldAbleToViewDropDownSALEIsAvailableInHomePage() {
		WebElement Verify = driver.findElement(By.xpath("(//li[@class='sub-menu'])[6]"));
		String Print = Verify.getText();
		System.out.println(Print);
	
	}

	@Then("TC_OBSTHIRTEEN validate the Credential of WebElement in Webpage")
	public void tc_obsthirteenValidateTheCredentialOfWebElementInWebpage() {
	}

	@When("TC_OBSFOURTEEN User should able to view DropDown BRANDS is available in Home Page")
	public void tc_obsfourteenUserShouldAbleToViewDropDownBRANDSIsAvailableInHomePage() {
		WebElement Verify = driver.findElement(By.xpath("(//a[text()='Brands'])[2]"));
		String Print = Verify.getText();
		System.out.println(Print);
	
	}

	@Then("TC_OBSFOURTEEN validate the Credential of WebElement in Webpage")
	public void tc_obsfourteenValidateTheCredentialOfWebElementInWebpage() {
	
	}

	@When("TC_OBSFIFTEEN User should able to view the Search button is Working in Home Page")
	public void tc_obsfifteenUserShouldAbleToViewTheSearchButtonIsWorkingInHomePage() {
		WebElement send1 = driver.findElement(By.xpath("//span[@class='icon-search']"));
		send1.click();
	
	}

	@Then("TC_OBSFIFTEEN validate the Credential of WebElement in Webpage")
	public void tc_obsfifteenValidateTheCredentialOfWebElementInWebpage() {
	}

	@When("TC_OBSSIXTEEN User should able to view the Search Box Accept alphabet Input Hats is Working in Search box")
	public void tc_obssixteenUserShouldAbleToViewTheSearchBoxAcceptAlphabetInputHatsIsWorkingInSearchBox() {
		WebElement send2 = driver.findElement(By.xpath("//span[@class='icon-search']"));
		send2.click();
		WebElement send10 = driver.findElement(By.id("boost-pfs-search-box-12"));
		send10.sendKeys("Hats");
		WebElement send11 = driver.findElement(By.xpath("//button[@class='boost-pfs-search-btn']"));
		send11.click();
	    
	    
	}

	@Then("TC_OBSSIXTEEN validate the Credential of WebElement in Webpage")
	public void tc_obssixteenValidateTheCredentialOfWebElementInWebpage() {
	    
	    
	}

	@When("TC_OBSSEVENTEEN User should able to view the Search Box Accept Numeric input is Working in Search box")
	public void tc_obsseventeenUserShouldAbleToViewTheSearchBoxAcceptNumericInputIsWorkingInSearchBox() {
		WebElement send2 = driver.findElement(By.xpath("//span[@class='icon-search']"));
		send2.click();
		WebElement send10 = driver.findElement(By.id("boost-pfs-search-box-12"));
		send10.sendKeys("12345");
		WebElement send11 = driver.findElement(By.xpath("//button[@class='boost-pfs-search-btn']"));
		send11.click();
	
	    
	}

	@Then("TC_OBSSEVENTEEN validate the Credential of WebElement in Webpage")
	public void tc_obsseventeenValidateTheCredentialOfWebElementInWebpage() {
	    
	    
	}

	@When("TC_OBSEIGHTEEN User should able to able to click ADD TO CART button")
	public void tc_obseighteenUserShouldAbleToAbleToClickADDTOCARTButton() {
		WebElement send4 = driver.findElement(By.xpath("(//a[text()='New Arrivals'])[2]"));
		send4.click();
		WebElement send88 = driver.findElement(By.xpath("(//span[@class='title'])[1]"));
		send88.click();
		WebElement send89 = driver.findElement(By.xpath("(//button[@class='action_button add_to_cart'])[1]"));
		send89.click();
	    
	    
	}

	@Then("TC_OBSEIGHTEEN validate the Credential of WebElement in Webpage")
	public void tc_obseighteenValidateTheCredentialOfWebElementInWebpage() {
	    
	    
	}

	@When("TC_OBSNINETEEN User should able to view Label Product Name is available in CART page")
	public void tc_obsnineteenUserShouldAbleToViewLabelProductNameIsAvailableInCARTPage() {
		WebElement Verify = driver.findElement(By.xpath("//a[contains(text(),'Jellycat Bashful Giraffe Plush Stuffed ')]"));
		String Print = Verify.getText();
		System.out.println(Print);
	
	    
	}

	@Then("TC_OBSNINETEEN validate the Credential of WebElement in Webpage")
	public void tc_obsnineteenValidateTheCredentialOfWebElementInWebpage() {
	    
	    
	}

	@When("TC_OBSTWENTY User should able to view the Quantity is available in CART page")
	public void tc_obstwentyUserShouldAbleToViewTheQuantityIsAvailableInCARTPage() {
		WebElement Verify = driver.findElement(By.xpath("//label[contains(text(),'Quantity:')]"));
		String Print = Verify.getText();
		System.out.println(Print);
	    
	    
	}

	@Then("TC_OBSTWENTY validate the Credential of WebElement in Webpage")
	public void tc_obstwentyValidateTheCredentialOfWebElementInWebpage() {
	    
	    
	}
	@When("TC_OBSTWENTYONE User should able to view the Product Size is available in CART page")
	public void tc_obstwentyoneUserShouldAbleToViewTheProductSizeIsAvailableInCARTPage() {
		WebElement Verify = driver.findElement(By.xpath("//a[contains(text(),'Jellycat Bashful Giraffe Plush Stuffed ')]"));
		String Print = Verify.getText();
		System.out.println(Print);
	    
	}

	@Then("TC_OBSTWENTYONE validate the Credential of WebElement in Webpage")
	public void tc_obstwentyoneValidateTheCredentialOfWebElementInWebpage() {
	    
	}

	@When("TC_OBSTWENTYTWO User should able to view the Product Price is available in CART page")
	public void tc_obstwentytwoUserShouldAbleToViewTheProductPriceIsAvailableInCARTPage() {
		WebElement Verify = driver.findElement(By.xpath("//span[contains(text(),'$15.00 USD')]"));
		String Print = Verify.getText();
		System.out.println(Print);
	
	}

	@Then("TC_OBSTWENTYTWO validate the Credential of WebElement in Webpage")
	public void tc_obstwentytwoValidateTheCredentialOfWebElementInWebpage() {
	    
	}

	@When("TC_OBSTWENTYTHREE User should able to view button CheckOut is available in CART page")
	public void tc_obstwentythreeUserShouldAbleToViewButtonCheckOutIsAvailableInCARTPage() {
		WebElement Verify = driver.findElement(By.id("checkout"));
		String Print = Verify.getText();
		System.out.println(Print);
	    
	}

	@Then("TC_OBSTWENTYTHREE validate the Credential of WebElement in Webpage")
	public void tc_obstwentythreeValidateTheCredentialOfWebElementInWebpage() {
	    
	}

	@When("TC_OBSTWENTYFOUR User should able to view the button CheckOut is Working in CART page")
	public void tc_obstwentyfourUserShouldAbleToViewTheButtonCheckOutIsWorkingInCARTPage() {
		WebElement send4 = driver.findElement(By.xpath("(//a[text()='New Arrivals'])[2]"));
		send4.click();
		WebElement send88 = driver.findElement(By.xpath("(//span[@class='title'])[1]"));
		send88.click();
		WebElement send89 = driver.findElement(By.xpath("(//button[@class='action_button add_to_cart'])[1]"));
		send89.click();
		WebElement send91 = driver.findElement(By.xpath("//input[@class='action_button right']"));
		send91.click();
	    
	}

	@Then("TC_OBSTWENTYFOUR validate the Credential of WebElement in Webpage")
	public void tc_obstwentyfourValidateTheCredentialOfWebElementInWebpage() {
	    
	}

	@When("TC_OBSTWENTYFIVE User should able to view Payment Page Label Express checkout is available in Payment page")
	public void tc_obstwentyfiveUserShouldAbleToViewPaymentPageLabelExpressCheckoutIsAvailableInPaymentPage() {
		WebElement Verify = driver.findElement(By.xpath("//h2[contains(text(),'Express checkout')]"));
		String Print = Verify.getText();
		System.out.println(Print);    
	}

	@Then("TC_OBSTWENTYFIVE validate the Credential of WebElement in Webpage")
	public void tc_obstwentyfiveValidateTheCredentialOfWebElementInWebpage() {
	    
	    
	}

}