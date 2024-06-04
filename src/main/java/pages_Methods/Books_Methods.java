package pages_Methods;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import pages_Base.Base_Class;
import pages_UI.Books;

public class Books_Methods {

	String CheckUsername = null;

	public void openBrowser() throws IOException {
		Base_Class.setup();
	}

	public void enterUrl() {
		Base_Class.insertUrl();
	}

	public void navigateBookStoreApp() {
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("arguments[0].click();", Books.BookStorePageLink);
		Books.BookStorePageLink.click();
	}

	public void LoginOption() {
		Books.LoginButton.click();
	}

	public void EnterUsername(String username) {
		CheckUsername = username;
		Books.UserNameField.clear();
		Books.UserNameField.sendKeys(username);
	}

	public void Enterpassword(String password) {
		Books.PasswordField.clear();
		Books.PasswordField.sendKeys(password);

	}

	public void ClickOnSignInBtn() {
		Books.LoginBtn.click();
	}

	public void validateLogin() {
		String actualUsername = Books.UserNameValue.getText();
		Assert.assertEquals(actualUsername, CheckUsername);
		System.out.println("Login is Successfull");
	}

	public void closeBrowser() {
		Base_Class.teardown();
	}
}
