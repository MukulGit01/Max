package com.isomorphic.stepdefs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.WebDriver;
import org.yaml.snakeyaml.Yaml;

import com.isomorphic.automation.framework.ConfigurationRegistory;
import com.isomorphic.automation.framework.TestSession;
import com.isomorphic.login.po.LoginPO;
import com.isomorphic.utils.PropFileHandler;

/**
 * 
 * @author Nimit Jain
 *
 */
public class StepDefinitionInit {

	Map<String, Object> options = new HashMap<String, Object>();
	protected static TestSession session;
	static LoginPO loginPO;


	public TestSession getTestSession() throws Exception {

		options.put("APPIUM_APP_NO_RESET", true);
		if (session == null) {
			session = new TestSession(options);
			// session.driver.navigate().refresh();
		}else {

			
	
			String url = ConfigurationRegistory.url;
			session.driver.get(url);

		}

		for (Entry<String, Object> entry : session.config.entrySet()) {
			System.out.println(" ********  " + entry.getKey() + " " + entry.getValue());
		}

		loginPO = new LoginPO(session);
		
		return session;
	}

}
