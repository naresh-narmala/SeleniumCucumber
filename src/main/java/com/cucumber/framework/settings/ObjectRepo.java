/**
 * @author Naresh Narmala
 *
 * December 13, 2016
 */
package com.cucumber.framework.settings;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.cucumber.framework.interfaces.IconfigReader;

/**
 * @author Naresh Narmala
 *
 * December 13, 2016
 */
public class ObjectRepo {
	
	public static WebDriver driver;
	public static IconfigReader reader;
	public static Map<String, Object> data = new LinkedHashMap<String, Object>();
	
}

