package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TuckerWebsite {
	public static WebDriver driver;
	
		@Given("To launch the browser and maximise window")
		public void to_launch_the_browser_and_maximise_window() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		}

		@When("To launch the URL of Tucker website")
		public void to_launch_the_url_of_tucker_website() {
		   driver.get("http://www.tuckermotors.com/");
		}

		@When("Scrolldown the page till Tucker products")
		public void scrolldown_the_page_till_tucker_products() {
		    
		}

		@When("To click on Fatafat charger")
		public void to_click_on_fatafat_charger() {
		    
		}

		@When("To click on Ac type charger")
		public void to_click_on_ac_type_charger() {
		    
		}

		@When("To click on DC wallmount charger")
		public void to_click_on_dc_wallmount_charger() {
		    
		}

		@When("To click on DC charging station")
		public void to_click_on_dc_charging_station() {
		    
		}

		@When("To click on AC charging station")
		public void to_click_on_ac_charging_station() {
		    
		}

		@When("Scrolldown the page till VISION&MISSION false")
		public void scrolldown_the_page_till_vision_mission_false() {
		    
		}

		@When("To click on Battery swapping station")
		public void to_click_on_battery_swapping_station() {
		    
		}

		@When("To click on DC charging pile station")
		public void to_click_on_dc_charging_pile_station() {
		    
		}

		@When("Scrolldown the page till VISION&MISSION true")
		public void scrolldown_the_page_till_vision_mission_true() {
		    
		}

		@When("To place the cursor on Smarter")
		public void to_place_the_cursor_on_smarter() {
		    
		}

		@When("To place the cursor on Faster")
		public void to_place_the_cursor_on_faster() {
		    
		}

		@When("To place the cursor on Efficient")
		public void to_place_the_cursor_on_efficient() {
		    
		}

		@When("To place the cursor on Comfort")
		public void to_place_the_cursor_on_comfort() {
		    
		}

		@When("Scrolldown the page till last")
		public void scrolldown_the_page_till_last() {
		    
		}

		@When("Click on back to top button")
		public void click_on_back_to_top_button() {
		    
		}

		@Then("To close the HOME page browser")
		public void to_close_the_home_page_browser() {
		    
		}

	}

