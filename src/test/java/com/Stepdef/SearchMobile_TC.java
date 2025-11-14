package com.Stepdef;
import java.io.IOException;

import com.Baseclass.Library;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SearchMobile_TC extends Library{

	
	@Given("Launch Flipkart Application")
	public void launch_flipkart_app() throws IOException {
		launchapp();
	}
	
	@When("Close the popup")
	public void close_popup() {
		
	}
	
	@Then("It should navigate to home page")
	public void it_should_navigate_to_homepage() {
		
	}
	@Given("User enter text in search box")
	public void user_enter_text_in_searchbox() {
		
	}
	
	@When("Click the search button")
	public void click_the_search_button() {
		
	}
}
