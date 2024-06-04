package project_StepDefination;

import java.io.IOException;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages_Methods.Books_Methods;

public class LogonValidationsSteps {
	
	Books_Methods method=new Books_Methods();
	
	@Given("User opens the browser")
	public void user_opens_the_browser() throws IOException {
	 method.openBrowser();   
	}

	@Given("Users enters the url {string}")
	public void users_enters_the_url(String string) {
	  method.enterUrl(); 
	}

	@When("Users enters username {string }")
	public void users_enters_username(String uname) {
	   method.navigateBookStoreApp();
	   method.LoginOption();
	   method.EnterUsername(uname);
	}

	@When("Users enters the password {string}")
	public void users_enters_the_password(String upass) {
	    method.Enterpassword(upass);
	}

	@When("Users clicks on Sign In button")
	public void users_clicks_on_sign_in_button() {
	  method.ClickOnSignInBtn();  
	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
	    method.validateLogin();
	}

	@Then("browser should get closed")
	public void browser_should_get_closed() {
	    method.closeBrowser();
	}



	
	



}
