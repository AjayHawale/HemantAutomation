package pages_Base;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages_Utilities.All_constants;
import project_Driver.SelectDrivers;


public class Base_Class {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	
	public static void setup() throws IOException {
	prop=new Properties();
	FileInputStream fis=new FileInputStream(All_constants.PropertiesFilepath);
	prop.load(fis);
	
	String browser=prop.getProperty("browser");
	SelectDrivers.driverIntitialize(browser);
	
	
	}
	
	public static void insertUrl() {
		driver.get(prop.getProperty("url"));
	}
	public static void teardown() {
		driver.quit();
	}
}


