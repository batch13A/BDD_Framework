package com.osa.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.osa.base.Browser1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Farzana {
	WebDriver dr;
	@Given("^I am on osa1 forum page$")
	public void i_am_on_osa1_forum_page(){
		dr=Browser1.openBrowser("chrome");
		dr.get("https://www.osaconsultingtech.com");
		dr.findElement(By.xpath("//a[text()='Forum']")).click();
	}
	@And("^I enter valid1 username \"([^\"]*)\"$")
	public void i_enter_valid1_usernamee(String username){
		dr.findElement(By.id("username")).sendKeys(username);
	}
	@And("^I enter valid1 password \"([^\"]*)\"$")
	public void i_enter_valid1_password(String password){
		dr.findElement(By.name("password")).sendKeys(password);
	}
	@When("^I click on login1 button$")
	public void i_click_on_login1_button(){
		dr.findElement(By.xpath("//button[@id='login_button']")).click();
	}
	@Then("^I verify1 that I am able to loggin$")
	public void i_verify1_that_I_am_able_to_loggin(){
		String expTitle="Student Page";
		String actualTitle=dr.getTitle();
		if(expTitle.contains(actualTitle)) {
			System.out.println("The test is passed");
		}else {
			System.out.println("The test is failed!!!!!!!!!!!!!");
			System.out.println("Expected Result: "+expTitle);
			System.out.println("Actual Result: "+actualTitle);
		}
	}
	@And("^I close the browser1$")
	public void i_close_the_browser1(){
		dr.close();
	}
}
