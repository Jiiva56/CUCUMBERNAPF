package org.napf.stepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.napf.locators.HompageLocator;
import org.openqa.selenium.WebElement;
import org.swiggy.baseclass.Seleniumday1;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HompageDefinition extends Seleniumday1{
	
	
	@Given("Open the chrome browser {string}")
	public void open_the_chrome_browser(String browserName) {
		System.out.println("launching the browser");
	}

	@Given("Launch the NAPF url {string}")
	public void launch_the_napf_url(String url) {
		//Seleniumday1.loadUrl(url);
	}

	@When("after loading the napf navigate to userinbox")
	public void after_loading_the_napf_navigate_to_userinbox() {
		System.out.println("clicked in user inbox");
	}
	
	@When("after loading the napf navigate to userinbox {string}")
	public void after_loading_the_napf_navigate_to_userinbox(String evn) {
		System.out.println("clicked in user inbox");
	}

	@When("click on the table header..")
	public void click_on_the_table_header() {
		// instead of table header am clicking in create investigation
//		HompageLocator hompageLocator = new HompageLocator();
//		Seleniumday1.elementClick(Seleniumday1.expandRootElement(hompageLocator.createInves));
	}

	@Then("Check on clicking, the date is sorted in ascending order.")
	public void check_on_clicking_the_date_is_sorted_in_ascending_order() throws Exception {
//		// am clicking on create inves so checking the create invest page is opened
//		Set<String> windowHandles = driver.getWindowHandles();
//		List<String> window = new ArrayList<>(windowHandles);
//		driver.switchTo().window(window.get(window.size()-1));
//		Thread.sleep(3000);
//		HompageLocator hompageLocator = new HompageLocator();
//		WebElement creteInvestText = Seleniumday1.expandRootElement(hompageLocator.creteInvestText);
//		String text = creteInvestText.getText();
//		Assert.assertEquals("Create New Investigation", text);
	}

	@Given("Open the chrome browser")
	public void open_the_chrome_browser(DataTable dataTable) {
//		List<String> asList = dataTable.asList();
//		Seleniumday1.browserlaunch(asList.get(0));
		
//		List<List<String>> asLists = dataTable.asLists();
//		Seleniumday1.browserlaunch(asLists.get(1).get(0));
		
//		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
//		Seleniumday1.browserlaunch(asMap.get("browser2"));
	}

}
