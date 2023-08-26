package cucumber_prj.BDD_with_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helper 
{
	public WebDriver driver;
	
	By var_UserName = By.id("user-name");
	By var_Password = By.id("password");
	By var_Logging_button = By.id("login-button");
	By var_side_bar_button = By.id("react-burger-menu-btn");
	By var_back_to_products_button = By.id("back-to-products");
	By var_continue_shopping_button = By.id("continue-shopping");
	By var_checkout_button = By.id("checkout");
	
	By var_Logout_link = By.linkText("Logout");
	By var_twitter_link = By.linkText("Twitter");
	By var_facebook_link = By.linkText("Facebook");
	By var_linkedIn_link = By.linkText("LinkedIn");
	
	
	public Helper(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement typeUserName()
	{
		return driver.findElement(var_UserName);
	}
	
	public WebElement typePassword()
	{
		return driver.findElement(var_Password);
	}
	
	public WebElement clickLoggingButton()
	{
		return driver.findElement(var_Logging_button);
	}
	
	public WebElement HomePage()
	{
		By ProductLable = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
		return driver.findElement(ProductLable);
	}
	
	public WebElement clickLogoutButton()
	{
		//By logout = By.xpath("//*[@id=\"logout_sidebar_link\" and contains(., 'Logout')]");
		return driver.findElement(var_Logout_link);
	}
	
	public WebElement LoginPage()
	{
		By SwagLabLable = By.xpath("//*[@id=\"root\"]/div/div[1]");
		return driver.findElement(SwagLabLable);	
	}
	
	public WebElement ErrorMessage()
	{
		By ErrorLable = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");
		return driver.findElement(ErrorLable);
	}
	
	public WebElement SideNaviButton()
	{
		return driver.findElement(var_side_bar_button);
	}
	
	public WebElement Footer()
	{
		By Footer = By.xpath("/html/body/div/div/footer");
		return driver.findElement(Footer);	
	}
	
	public WebElement FooterText()
	{
		By FooterText = By.xpath("//*[@id=\"page_wrapper\"]/footer/div");
		return driver.findElement(FooterText);	
	}
	
	public WebElement TwitterButton()
	{
		return driver.findElement(var_twitter_link);
	}
	
	public WebElement FacebookButton()
	{
		return driver.findElement(var_facebook_link);
	}
	
	public WebElement LinkedInButton()
	{
		return driver.findElement(var_linkedIn_link);
	}
	
	public WebElement TwitterPage()
	{
		By twitterPage = By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[1]/div[1]/div/div/div/div/div/div[2]/div/h2/div/div/div/div/span[1]/span/span[1]");
		return driver.findElement(twitterPage);	
	}
	
	public WebElement FacebookPage()
	{
		By fbPage = By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div/div[1]/div[2]/div/div/div/div[3]/div/div/div[1]/div/div/span/h1");
		return driver.findElement(fbPage);	
	}
	
	public WebElement LinkedinPage()
	{
		By linkedInPage = By.xpath("/html/body/main/section[1]/section/div/div[2]/div[1]/h1");
		return driver.findElement(linkedInPage);	
	}
	
	public WebElement TitleProduct()
	{
		By TitleProduct = By.xpath("/html/body/div/div/div/div[1]/div[2]/span");
		return driver.findElement(TitleProduct);	
	}
	
	public WebElement ProductSortOpt()
	{
		By ProductSortOpt = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");
		return driver.findElement(ProductSortOpt);	
	}
	
	public List<WebElement> InventoryItem()
	{
		By InventoryItem = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div");
		return driver.findElements(InventoryItem);	
	}
	
	public List<WebElement> AddToCartButton()
	{
		return driver.findElements(By.cssSelector(".btn.btn_primary.btn_small.btn_inventory"));	
	}
	
	public List<WebElement> RemoveButton()
	{
		return driver.findElements(By.cssSelector(".btn.btn_secondary.btn_small.btn_inventory"));	
	}
	
	public WebElement CartBadgeContainer()
	{
		By ProductSortOpt = By.xpath("//*[@id=\"shopping_cart_container\"]");
		return driver.findElement(ProductSortOpt);	
	}
	
	public List<WebElement> TitleButtons()
	{
		return driver.findElements(By.className("inventory_item_name"));	
	}
	
	public WebElement ProductLargeTitle()
	{
		return driver.findElement(By.cssSelector(".inventory_details_name.large_size"));
	}
	
	public List<WebElement> CartItem()
	{
		return driver.findElements(By.className("inventory_item_name"));
	}
	
	public List<WebElement> RemoveCartButton()
	{
		return driver.findElements(By.cssSelector(".btn.btn_secondary.btn_small.cart_button"));	
	}
	
	public WebElement BackToProductsButton()
	{
		return driver.findElement(var_back_to_products_button);
	}
	
	public WebElement ContinueShopingButton()
	{
		return driver.findElement(var_continue_shopping_button);
	}
	
	public WebElement CheckoutButton()
	{
		return driver.findElement(var_checkout_button);
	}
	
	public WebElement CheckoutInfo()
	{
		By CheckoutInfo = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
		return driver.findElement(CheckoutInfo);	
	}
	
	public WebElement SortDropDown()
	{
		By SortOpt = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");
		return driver.findElement(SortOpt);	
	}
	
	public List<WebElement> ItemImg()
	{
		return driver.findElements(By.className("inventory_item_img"));
	}
	
	public List<WebElement> ItemNames()
	{
		return driver.findElements(By.className("inventory_item_name"));
	}
	
	public List<WebElement> ItempRrice()
	{
		return driver.findElements(By.className("inventory_item_price"));
	}
}
