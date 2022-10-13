package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.runner.Adactin_Base;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features", 
				glue = "com.stepdefinition",
				monochrome = true,
				dryRun = false,
				publish = true,
				plugin = {"pretty",
						  "html:Report/Repo.html"}
				)

public class Adactin_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up()
	{
		driver = Adactin_Base.browser_Launch("chrome");
	}
		
	@AfterClass
	public static void tear_Down() 
	{
		driver.close();
	}

}
