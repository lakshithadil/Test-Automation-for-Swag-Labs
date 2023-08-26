package cucumber_prj.BDD_with_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	public WebDriver driver;
	public  WebDriver inheritance() {
		
		  String driverPath ="C:\\Users\\User\\eclipse-workspace\\BDD_with_selenium\\ChromeDriver\\chromedriver.exe";
	      System.setProperty("webdriver.chrome.driver",driverPath); 
	      
	      ChromeOptions options = new ChromeOptions();
	      options.addArguments("--remote-allow-origins=*");
	   
	      WebDriver driver = new ChromeDriver(options);
	      return driver; 
	}

}
