package org.stepdefintion;

import java.io.IOException;

import org.utilities.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.*;

public class HooksClass extends BaseClass {
	
	@Before (order = 1)
	public void BeforeScenario() {
		tolaunchChrome();
		toGetUrl("https://ohbabystyle.com/");
		toWinMax();
		
		
	}
	
	@Before (order =2)
	public void secondbefore() {
		System.out.println("Before hooks is executed");

	}
	
    @After (order = 1)
    public void AfterScenario() {
    	toClose();	
    	
    }
    
    @After (order = 2)
    
    	public void sencondafter(Scenario s) throws IOException  {
    		System.out.println("After Hooks is executed");
    		if(s.isFailed()) {
    			String name =s.getName();
    			String fileName = name.replace(" ","_");
    		    screenshot(fileName);

    	
		System.out.println("After Hooks is executed");

	}
    }}
