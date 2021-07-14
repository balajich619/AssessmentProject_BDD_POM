package com.qa.pages;

import static org.junit.Assert.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;
import com.qa.util.TestUtil;



public class ValuesPage extends TestBase {
	
	@FindBy(id="lbl_val_1")
	WebElement lbl_val_1;
	
	@FindBy(id="lbl_val_2")
	WebElement lbl_val_2;
	
	@FindBy(id="lbl_val_3")
	WebElement lbl_val_3;
	
	@FindBy(id="lbl_val_4")
	WebElement lbl_val_4;
	
	@FindBy(id="lbl_ttl_val")
	WebElement lbl_totalValue;
	
	@FindBy(id="lbl_val_5")
	WebElement lbl_val_5;
	
	@FindBy(id="txt_val_1")
	WebElement txt_val_1;
	
	@FindBy(id="txt_val_2")
	WebElement txt_val_2;
	
	@FindBy(id="txt_val_3")
	WebElement txt_val_3;
	
	@FindBy(id="txt_val_4")
	WebElement txt_val_4;
	
	@FindBy(id="txt_val_5")
	WebElement txt_val_5;
	
	@FindBy(id="txt_ttl_val")
	WebElement txt_totalValue;
	
	@FindBy(xpath="//label[starts-with(@id,'lbl_val_')]")
	List<WebElement> labelFieldCount;
	
	@FindBy(xpath="//input[starts-with(@id,'txt_val_')]")
	List<WebElement> valueFieldCount;
	
	
	
	private static ThreadLocal<Map<String, Object>> context = new ThreadLocal<Map<String, Object>>();
	
	public ValuesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void validateCountOfValues() {
		assertTrue("Matching Label and Value count",labelFieldCount.size()== valueFieldCount.size());
			
	}
	
	public void validateCurrencyFormatOfValues() {
		for(int i=1;i<=valueFieldCount.size();i++) {
			String value=driver.findElement(By.xpath(String.format(prop.getProperty("input_value"), i))).getText();
			assertTrue("Value is in correct format",TestUtil.isValidAmount(value));
		}
	}
		
	
	
	public void checkValueGreaterThanZero() {
	//	List<Double>  list=new ArrayList<Double>();
		Double amount_sum = 0.00 ;
		for(int i=1;i<=valueFieldCount.size();i++) {
			String value=driver.findElement(By.xpath(String.format(prop.getProperty("input_value"), i))).getText();
			Double amount=TestUtil.convertCurrencyToDouble(value);
			assertTrue("Value Greater than Zero",amount>0.00);
			 amount_sum+=amount;
			
		}
		context.set(new HashMap<String, Object>());
		context.get().put("amount", amount_sum);
		
	}
	
	
	public void checkTotalBalanceAmount() {
		Double actual_totalAmount=TestUtil.convertCurrencyToDouble(txt_totalValue.getText());
		Double expected_totalAmount=TestUtil.convertCurrencyToDouble(context.get().get("amount").toString());
		assertTrue("Checking if Total Balance matches with sum of the values",actual_totalAmount==expected_totalAmount);
	}
	
	
	
	
	
	

}
