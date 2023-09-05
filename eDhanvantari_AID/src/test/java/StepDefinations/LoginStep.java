package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
//Here we need to initiat chrome browser
	@Given("User is on login page")
	public void login_page()
	{
		System.out.println("In d login page");
	}
	
	@When("user enters username and password")
	public void Unm_Pwd()
	{
		System.out.println("user enter Username and Password");
	}
	
	@And("clicks on login button")
	public void btn_click()
	{
		System.out.println("user click on login button");
	}
	
	@Then("user is navigate to home page")
	public void home_page()
	{
		System.out.println("User is on home page");
	}
}
