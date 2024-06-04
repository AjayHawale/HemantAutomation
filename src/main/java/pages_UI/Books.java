package pages_UI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pages_Base.Base_Class;

public class Books extends Base_Class {

@FindBy(xpath="//h5[contains(text(), 'Book')]")	
public static WebElement BookStorePageLink;

@FindBy (xpath="//button[@id='login']")
public static WebElement LoginButton;

@FindBy (xpath="//input[@placeholder='UserName']")
public static WebElement UserNameField;

@FindBy (xpath="//input[@id='password']")
public static WebElement PasswordField;

@FindBy (xpath="//button[@id='login']")
public static WebElement LoginBtn;

@FindBy(xpath="//label[@id='userName-value']")
public static WebElement UserNameValue;
	
	public Books() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
