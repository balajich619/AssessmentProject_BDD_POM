package com.qa.util;

import java.text.NumberFormat;
import java.util.regex.*;

public class TestUtil {
	
	public static int PAGE_LOAD_TIMEOUT = 20;
	public static int IMPLICIT_WAIT=10;
	
	public static Double convertCurrencyToDouble(String value) {
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setGroupingUsed(false);
		nf.setMinimumFractionDigits(2);
		Double amount= Double.parseDouble(nf.format(value));
		return amount;
	}
	
	public static boolean isValidAmount(String value)
    {
		String regex="^$?([1-9]{1}[0-9]{0,2}(\\,[0-9]{3})*(\\.[0-9]{0,2})?|[1-9]{1}[0-9]{0,} (\\.[0-9]{0,2})?|0(\\.[0-9]{0,2})?|(\\.[0-9]{1,2})?)$";
		Pattern p = Pattern.compile(regex);
		if (value == null) {
            return false;
        }
		Matcher m = p.matcher(value);
		return m.matches();
		
    }

}
