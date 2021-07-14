package com.qa.stepDefinitions;

import com.qa.pages.ValuesPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.*;

public class ValuesSteps extends TestBase {
	
	ValuesPage valuepage=new ValuesPage();
	
	@Given("^user is on Values Page$")
	public void user_is_on_Values_Page(){
		invokeURL();
	}

	@Then("^validate the count of values in the screen$")
	public void validate_the_count_of_values_in_the_screen(){
		valuepage.validateCountOfValues();
	}

	@Then("^validate values are greater than zero$")
	public void validate_values_are_greater_than_zero(){
		valuepage.checkValueGreaterThanZero();
	}

	@Then("^validate the total balance$")
	public void validate_the_total_balance(){
		valuepage.checkTotalBalanceAmount();
	}

	@Then("^validate the currency format of the values$")
	public void validate_the_currency_format_of_the_values(){
		valuepage.validateCurrencyFormatOfValues();
	}
	
}
