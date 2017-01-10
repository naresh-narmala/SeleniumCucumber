/**
 * @author Naresh Narmala
 *
 * December 13, 2016
 */
package com.cucumber.framework.helper.Logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cucumber.framework.utility.ResourceHelper;
import org.junit.Test;
import java.io.FileInputStream;


/**
 * @author Naresh Narmala
 *
 * December 13, 2016
 */
@SuppressWarnings("rawtypes")
public class LoggerHelper {
	
	private static boolean root = false;
	
	public static Logger getLogger(Class clas) {
		if(root)
			return Logger.getLogger(clas);
		
		String file = Test.class.getResource("/configfile/log4j.properties").getFile();
		String newLogFile=file.replaceAll("target/test-classes","src/main/resources");
		PropertyConfigurator.configure(newLogFile);
		//PropertyConfigurator.configure(ResourceHelper
		//.getResourcePath("configfile/log4j.properties"));
		root = true;
		return Logger.getLogger(clas);
	}

}
