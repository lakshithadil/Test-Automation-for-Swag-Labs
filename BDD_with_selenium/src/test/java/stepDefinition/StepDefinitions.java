package stepDefinition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber_prj.BDD_with_selenium.Base;
import cucumber_prj.BDD_with_selenium.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends Base {
	
	private String username;
	private String password;
	private String numOfitems;
	private String smallTitle;
	private String itemNames []; 
	private Float itemPrices [];
	
//login.feature
	
	@Given("User should navigate to swag labs login page")
	public void user_should_navigate_to_swag_labs_login_page() {
		String url = "https://www.saucedemo.com/";
		driver = inheritance();
		driver.get(url);
	}

	@When("^User enter the \"([\\w\\s\"']*)\" and \"([\\w\\s\"']*)\"$")
	public void user_enter_the_Username(String Username, String Password) {
		username = Username;
		password = Password;
		Helper H1 = new Helper(driver);
		H1.typeUserName().sendKeys(Username);
		H1.typePassword().sendKeys(Password);

	}

	@When("User click the login button")
	public void user_click_the_login_button() {

		Helper H1 = new Helper(driver);
		H1.clickLoggingButton().click();

	}

	@Then("User should navigate to Swag Labs home page")
	public void user_should_navigate_to_swag_labs_home_page() throws InterruptedException {

		Helper H1 = new Helper(driver);
		boolean var1 = H1.HomePage().isDisplayed();

		if (var1 == true) {
			System.out.println("Navigated Successfully");
			Thread.sleep(2000);
			driver.close();
		} else {
			System.out.println("Not navigated");
		}

	}

	@Then("User should not navigate to Swag Labs home page")
	public void user_should_not_navigate_to_swag_labs_home_page() throws InterruptedException {

		Helper H1 = new Helper(driver);
		boolean var1 = H1.LoginPage().isDisplayed();

		if (var1 == true) {
			System.out.println("Not Navigated");
			Thread.sleep(2000);
			driver.close();
		} else {
			System.out.println("Navigated to Home page");

		}

	}

//loginerrormessage.feature
	
	@Then("User should see the correct error message")
	public void user_should_see_the_correct_error_message() {

		
		  Helper H1 = new Helper(driver); 
		  String errmsg = H1.ErrorMessage().getAttribute("innerText");
		  
		  if (username.equals("") && password.equals("") && errmsg.equals("Epic sadface: Username is required")) { 
			  System.out.println("Error message is correct: " +errmsg);
		  
		  }

		  else if (username.equals("") && password.equals("something") && errmsg.equals("Epic sadface: Username is required")) {
			
			System.out.println("Error message is correct: " +errmsg);

		 }

		  else if (username.equals("something") && password.equals("") && errmsg.equals("Epic sadface: Password is required")) {
			
			System.out.println("Error message is correct: "+errmsg);

		}

		  else if (username.equals("something") && password.equals("somethings") && errmsg.equals("Epic sadface: Username and password do not match any user in this service")) {
 			
 			System.out.println("Error message is correct: "+errmsg);

 		}
         
        else {
			  
        	System.out.println("Error message is wrong: " +errmsg);
		  }
		  driver.quit();
	}
	
//logout.feature
	
	@Given("^User should login to swag labs using correct \"([\\w\\s\"']*)\" and \"([\\w\\s\"']*)\"$")
	public void user_should_login_to_swag_labs_using_correct_and(String Username, String Password) {
		
		String url = "https://www.saucedemo.com/";
		driver = inheritance();
		driver.get(url);
		
		Helper H1 = new Helper(driver);
		H1.typeUserName().sendKeys(Username);
		H1.typePassword().sendKeys(Password);
		
		H1.clickLoggingButton().click();
		
	}
	
	@Given("User should navigate to left sidebar")
	public void user_should_navigate_to_left_sidebar() throws InterruptedException {
		Helper H1 = new Helper(driver);
		H1.SideNaviButton().click();
		Thread.sleep(2000); 
		
	}

	@When("User click the logout button")
	public void user_click_the_logout_button() {
		Helper H1 = new Helper(driver);
		H1.clickLogoutButton().click();
	}

	@Then("User should logout from Swag Labs")
	public void user_should_logout_from_swag_labs() {
		
		Helper H1 = new Helper(driver);
		boolean var1 = H1.LoginPage().isDisplayed();

		if (var1 == true) {
			System.out.println("Logout successfully");
			
		} else {
			System.out.println("Unable to logout");

		}
		driver.quit();
	}
	
//footer.feature
	
	@Then("User should see the footer")
	public void user_should_see_the_footer() {
		
		Helper H1 = new Helper(driver);
		boolean var1 = H1.Footer().isDisplayed();
		
		if (var1 == true) {
			
			System.out.println("footer is displayed");
		}
		else {
			
			System.out.println("Not displayed: footer");
		}
		
		driver.quit();
		
	}

	@Then("User should see the correct footer text")
	public void user_should_see_the_correct_footer_text() {
		
		Helper H1 = new Helper(driver);
		String footerText = H1.FooterText().getAttribute("innerText");
		
		if(footerText.equals("© 2023 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy")) {
			
			System.out.println("footer Text is correct");
		}
		else {
			
			System.out.println("footer Text is not correct");
		}
		
		driver.quit();
		
	}

	@When("User clicked the twitter icon")
	public void user_clicked_the_twitter_icon() {
		
		Helper H1 = new Helper(driver);
		H1.TwitterButton().click();
	}

	@Then("User should navigate to swag labs twitter page")
	public void user_should_navigate_to_swag_labs_twitter_page() throws InterruptedException {
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(0));
	    driver.switchTo().window(tabs2.get(1));
	    
	    Helper H1 = new Helper(driver);
	    String twitterpageName = H1.TwitterPage().getAttribute("innerText");
	    
        if (twitterpageName.equals("Sauce Labs")) {
			
			System.out.println("Navigated to twitter page");
		}
        else {
        	System.out.println("Not Navigated to twitter page");
        }
        
        Thread.sleep(1000);
		driver.quit();
		
	}

	@When("User clicked the facebook icon")
	public void user_clicked_the_facebook_icon() throws InterruptedException {
		
		Helper H1 = new Helper(driver);
		H1.FacebookButton().click();
		//Thread.sleep(2000); 
	}

	@Then("User should navigate to swag labs facebook page")
	public void user_should_navigate_to_swag_labs_facebook_page() throws InterruptedException {
		
	    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(0));
	    driver.switchTo().window(tabs2.get(1));
	    
	    Helper H1 = new Helper(driver);
	    String fbpageName = H1.FacebookPage().getAttribute("innerText");
	    
        if (fbpageName.equals("Sauce Labs")) {
			
			System.out.println("Navigated to facebook page");
		}
        
        else {
        	
        	System.out.println("Not Navigated to facebook page");
        }
        
        Thread.sleep(1000);
		driver.quit();
	}

	@When("User clicked the linkedin icon")
	public void user_clicked_the_linkedin_icon() {
		
		Helper H1 = new Helper(driver);
		H1.LinkedInButton().click();
		
	}

	@Then("User should navigate to swag labs linkedin page")
	public void user_should_navigate_to_swag_labs_linkedin_page() throws InterruptedException {
	    
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(0));
	    driver.switchTo().window(tabs2.get(1));
	    
	    Helper H1 = new Helper(driver);
	    String linkedInPageName = H1.LinkedinPage().getAttribute("innerText");
	    
        if (linkedInPageName.equals("Sauce Labs")) {
			
			System.out.println("Navigated to linkedIn page");
		}
        
        else {
        	
        	System.out.println("Not Navigated to linkedIn page");
        }
        
        Thread.sleep(1000);
		driver.quit();
	}

//product.feature
	
	@Then("User should see the product title label")
	public void user_should_see_the_product_label() {

		Helper H1 = new Helper(driver);
		String TitleProduct = H1.TitleProduct().getAttribute("innerText");
		
		if(TitleProduct.equals("Products")) {
			
			System.out.println("Product title label is correct");
			
		}
		else {
			
			System.out.println("Product title label is not correct");
		}
		driver.quit();
		
	}
	
	@Then("User should see the product sort option")
	public void user_should_see_the_product_sort_option() {
	    
		Helper H1 = new Helper(driver);
		Boolean var1 = H1.ProductSortOpt().isDisplayed();
		
		if(var1 == true) {
			
			System.out.println("Product sort option is displayed");
			
		}
		else {
			System.out.println("Not displayed");
		}
		driver.quit();
	}
	
	@Then("User should see the products correctly")
	public void user_should_see_the_products_correctly() {
		
		Helper H1 = new Helper(driver);
		List<WebElement> items = H1.InventoryItem();
		
		String [] itemDetailNames = {"name","description","price","button text"};
		String [] itemDetailsRecieved; 
				//items.get(1).getText().split("\\R");
		
		String [][] itemDetailsCorrect = { 
                						 {"Sauce Labs Backpack", "Carry all the things with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.","$29.99","Add to cart"},
                						 {"Sauce Labs Bike Light", "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.","$9.99","Add to cart"},
                						 {"Sauce Labs Bolt T-Shirt","Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.","$15.99","Add to cart"},
                						 {"Sauce Labs Fleece Jacket", "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.","$49.99","Add to cart"},
                						 {"Sauce Labs Onesie","Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.","$7.99","Add to cart"},
                						 {"Sauce Labs T-Shirt (Red)","This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.","$15.99","Add to cart"},
										 };

    	 //itemDetailsRecieved = items.get(1).getText().split("\\R");
		System.out.println("Number of product items :" + items.size());
		
    	  for (int i=0; i<=5; i++) {
    		  
    		  itemDetailsRecieved = items.get(i).getText().split("\\R");
    		  
	    		  for (int j=0; j<=3; j++) {
	    		  
	    			  if(itemDetailsCorrect[i][j].equals(itemDetailsRecieved[j]) ) {
	    				  
	    				  System.out.println("Product "+(i+1)+ " "+itemDetailNames[j] +" is correct: "+ itemDetailsRecieved[j] );
	    			  }
	    			  else {
	    				  
	    				  System.out.println("Product "+(i+1)+ " "+itemDetailNames[j] +" is wrong: "+ "Received --> "+itemDetailsRecieved[j]+" Expected --> "+itemDetailsCorrect[i][j] );
	    			  }
	    		  }
    	 }
    	  driver.quit();
    }
	
//cart.feature
	
	@When("User click the add to cart button (\\d+)$")
	public void user_click_the_add_to_cart_button(int itemNumber) throws InterruptedException {
	    
		
		
		Helper H1 = new Helper(driver);
		numOfitems = H1.CartBadgeContainer().getText();
		//System.out.println("Button text before is : "+H1.AddToCartButton().get(0).getText());
		H1.AddToCartButton().get(itemNumber).click();
		//Thread.sleep(3000);
		//System.out.println("Button text after is : "+H1.RemoveButton().get(0).getText());
		System.out.println("Button is " +itemNumber );
		
	
	}

	@Then("User should see the updated cart badge")
	public void user_should_see_the_updated_cart_badge() {
		Helper H1 = new Helper(driver);
		//numOfitems = H1.CartBadgeContainer().getText();
		if(numOfitems.equals("") ) {
			numOfitems = "0";
		}
		
		String numOfitemsNew = H1.CartBadgeContainer().getText();
		
		System.out.println("Number of items in the cart is : "+numOfitems);
		System.out.println("Number of items in the cart new is : "+numOfitemsNew);
		
		if(Integer.parseInt(numOfitemsNew) == Integer.parseInt(numOfitems)+1) {
			System.out.println("Cart badge is updated successfully");
		}
		else {
			System.out.println("Fail to upadted");
		}
		driver.quit();
	}
	
	@When("User click the add to cart buttons")
	public void user_click_the_add_to_cart_buttons() {
		
		Helper H1 = new Helper(driver);
		
		for(int i = 0;i<=5;i++) {
		H1.AddToCartButton().get(0).click();
		}
		
	}

	@Then("User should see the remove button")
	public void user_should_see_the_remove_button() {
		
		Helper H1 = new Helper(driver);
		for(int i=0;i<=5;i++) {
			if(H1.RemoveButton().get(i).getText().equals("Remove")) {
				System.out.println("Remove button"+ i +"is displyed");
			}
			else {
				System.out.println("Remove button"+ i +"is not displyed");
			}
		}
		driver.quit();
	}
	
	
	@When("User click the product title (\\d+)$")
	public void user_click_the_product_title(int itemNumber) {
		Helper H1 = new Helper(driver);
		smallTitle = H1.TitleButtons().get(itemNumber).getText();
		H1.TitleButtons().get(itemNumber).click();
	}

	@Then("User should see the full product view")
	public void user_should_see_the_full_product_view() {
		
		Helper H1 = new Helper(driver);
		if(H1.ProductLargeTitle().getText().equals(smallTitle)) {
			System.out.println("Navigated to large product view Correctly");
		}
		else {
			System.out.println("Incorrect Navigation to large product view");
		}
		driver.quit();
		
	}

	@When("User click the cart icon")
	public void user_click_the_cart_icon() {
		Helper H1 = new Helper(driver);
		 H1.CartBadgeContainer().click();

	}

	@Then("User should see the cart items added to cart")
	public void user_should_see_the_cart_items_added_to_cart() {
		
		Helper H1 = new Helper(driver);
		String [] cartItemNames = {"Sauce Labs Backpack","Sauce Labs Bike Light","Sauce Labs Bolt T-Shirt","Sauce Labs Fleece Jacket","Sauce Labs Onesie","Test.allTheThings() T-Shirt (Red)"};
	
		for (int i =0;i<=5;i++) {
			
			if(H1.CartItem().get(i).getText().equals(cartItemNames[i])) {
				System.out.println(cartItemNames[i]+" : Add to cart successfully");
			}
			else {
				System.out.println(cartItemNames[i]+" : Fail to add to cart");
			}
		}
		driver.quit();
	}
	
	@When("User click the remove buttons")
	public void user_click_the_remove_buttons() {
		Helper H1 = new Helper(driver);
		
		for(int i = 0;i<=5;i++) {
		H1.RemoveCartButton().get(0).click();
		}
	}

	@Then("User should see the cart without removed item")
	public void user_should_see_the_cart_without_removed_item() {
		Helper H1 = new Helper(driver);
		//String [] cartItemNames = {"Sauce Labs Backpack","Sauce Labs Bike Light","Sauce Labs Bolt T-Shirt","Sauce Labs Fleece Jacket","Sauce Labs Onesie","Test.allTheThings() T-Shirt (Red)"};
	
		if(H1.CartItem().size()!=0) {
			for (int i =0;i<=H1.CartItem().size();i++) {
				
					System.out.println(H1.CartItem().get(i).getText()+" : Fail to removed from cart");
				}
			}
			
		else {
			
			System.out.println("All the items removed from cart successfully");
			
		}
		driver.quit();
	}

	@When("User click the back to products button")
	public void user_click_the_back_to_products_button() {
		Helper H1 = new Helper(driver);
		H1.BackToProductsButton().click();
	}

	@Then("User should see the product page")
	public void user_should_see_the_product_page() {
		Helper H1 = new Helper(driver);
		boolean titleProduct = H1.TitleProduct().isDisplayed();
		
		if(titleProduct) {
			
			System.out.println("Navigated successfully");
			
		}
		else {
			
			System.out.println("Not navigated");
		}
		driver.quit();
	}
	
	@When("User click the continue shopping button")
	public void user_click_the_continue_shopping_button() {
		Helper H1 = new Helper(driver);
		H1.ContinueShopingButton().click();
	}
	
	@When("User click the checkout button")
	public void user_click_the_checkout_button() {
		Helper H1 = new Helper(driver);
		H1.CheckoutButton().click();
	}

	@Then("User should see the checkout info page")
	public void user_should_see_the_checkout_info_page() {
		Helper H1 = new Helper(driver);
		boolean CheckoutInfo = H1.TitleProduct().isDisplayed();
		if(CheckoutInfo) {
					
			System.out.println("Navigated successfully");
					
		}
		else {
					
			System.out.println("Not navigated");
		}
		driver.quit();
	}
	
	@When("User click the sort ZA")
	public void user_click_the_sort_za() {
		
		itemNames = new String[6];
		Helper H1 = new Helper(driver);
		
		for (int i=0;i<=5;i++) {
			itemNames[i] = H1.ItemNames().get(i).getText();
			System.out.println("before sort Item name : "+itemNames[i]);
		}
		
		Select se = new Select(H1.SortDropDown());
		
		se.selectByValue("za");
	}
    
	@When("User click the sort AZ")
	public void user_click_the_sort_az() {
		
		itemNames = new String[6];
		Helper H1 = new Helper(driver);
		
		for (int i=0;i<=5;i++) {
			itemNames[i] = H1.ItemNames().get(i).getText();
			System.out.println("before sort Item name : "+itemNames[i]);
		}
		
		Select se = new Select(H1.SortDropDown());
		
		se.selectByValue("az");
	}
	
	@Then("User should see the ZA sorted products")
	public void user_should_see_the_ZA_sorted_products() {
		
		Helper H1 = new Helper(driver);
		String itemNamesAfterSort [] = new String[6]; 
		
		for (int i=0;i<=5;i++) {
			itemNamesAfterSort[i] = H1.ItemNames().get(i).getText();
			System.out.println("After clicked sort Item name : "+itemNamesAfterSort[i]);
		}
		//Arrays.sort(itemNames);
		Arrays.sort(itemNames, Collections.reverseOrder());

			if(Arrays.equals(itemNames, itemNamesAfterSort)) {
				
				System.out.println("Sorted correctly Z-A");
			}
			else{
				System.out.println("Incorrectly sorted Z-A");
			}
			driver.quit();
	}
	
	@Then("User should see the AZ sorted products")
	public void user_should_see_the_AZ_sorted_products() {
		
		Helper H1 = new Helper(driver);
		String itemNamesAfterSort [] = new String[6]; 
		
		for (int i=0;i<=5;i++) {
			itemNamesAfterSort[i] = H1.ItemNames().get(i).getText();
			System.out.println("After clicked sort Item name : "+itemNamesAfterSort[i]);
		}
		Arrays.sort(itemNames);
			if(Arrays.equals(itemNames, itemNamesAfterSort)) {
				
				System.out.println("Sorted correctly A-Z");
			}
			else{
				System.out.println("Incorrectly sorted A-Z");
			}
			driver.quit();
	}

	@Then("User should see the correct products images")
	public void user_should_see_the_correct_products_images() {
		
		Helper H1 = new Helper(driver);
		String [] imgSrcNames = {"sauce-backpack","bike-light","bolt-shirt","sauce-pullover","red-onesie","red-tatt"};
		
		int j = 1;
		for(int i=1;i<=12;i+=2) {
			String imgsrc = H1.ItemImg().get(i).getAttribute("src").toString();
			
			
			if(imgsrc.contains(imgSrcNames[i-j])) {
				System.out.println("Image is correct : "+imgSrcNames[i-j]);
			}
				
			else {
				System.out.println("Image source is wrong : "+imgsrc);
			}
			j++;
		}
		driver.quit();
	}
	
	@When("User click the sort low to high")
	public void user_click_the_sort_low_to_high() {
		itemPrices = new Float[6];
		Helper H1 = new Helper(driver);
		
		for (int i=0;i<=5;i++) {
			itemPrices[i] = Float.parseFloat(H1.ItempRrice().get(i).getText().substring(1));
			System.out.println("before sort Item price : "+itemPrices[i]);
		}
		
		Select se = new Select(H1.SortDropDown());
		
		se.selectByValue("lohi");
	}

	@Then("User should see the low to high sorted products")
	public void user_should_see_the_low_to_high_sorted_products() {
		Helper H1 = new Helper(driver);
		Float itemPricesAfterSort [] = new Float[6]; 
		
		for (int i=0;i<=5;i++) {
			itemPricesAfterSort[i] = Float.parseFloat(H1.ItempRrice().get(i).getText().substring(1));
			System.out.println("After clicked sort Item price : "+itemPricesAfterSort[i]);
		}
		
		Arrays.sort(itemPrices);
		
			if(Arrays.equals(itemPrices, itemPricesAfterSort)) {
				
				System.out.println("Sorted correctly price low to high");
			}
			else{
				System.out.println("Incorrectly sorted price low to high");
			}
			for (int i=0;i<=5;i++) {
		
				System.out.println("Aftersort Item price : "+itemPrices[i]);
			}
			driver.quit();
	}
	
	@When("User click the sort high to low")
	public void user_click_the_sort_high_to_low() {
		itemPrices = new Float[6];
		Helper H1 = new Helper(driver);
		
		for (int i=0;i<=5;i++) {
			itemPrices[i] = Float.parseFloat(H1.ItempRrice().get(i).getText().substring(1));
			System.out.println("before sort Item price : "+itemPrices[i]);
		}
		
		Select se = new Select(H1.SortDropDown());
		
		se.selectByValue("hilo");
	}

	@Then("User should see the high to low sorted products")
	public void user_should_see_the_high_to_low_sorted_products() {
		Helper H1 = new Helper(driver);
		Float itemPricesAfterSort [] = new Float[6]; 
		
		for (int i=0;i<=5;i++) {
			itemPricesAfterSort[i] = Float.parseFloat(H1.ItempRrice().get(i).getText().substring(1));
			System.out.println("After clicked sort Item price : "+itemPricesAfterSort[i]);
		}
		
		
		Arrays.sort(itemPrices, Collections.reverseOrder());
			if(Arrays.equals(itemPrices, itemPricesAfterSort)) {
				
				System.out.println("Sorted correctly price high to low");
			}
			else{
				System.out.println("Incorrectly sorted price high to low");
			}
			for (int i=0;i<=5;i++) {
		
				System.out.println("Aftersort Item price : "+itemPrices[i]);
			}
			driver.quit();
	}

	
}
