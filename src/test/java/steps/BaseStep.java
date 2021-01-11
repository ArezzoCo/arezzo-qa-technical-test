package steps;

import utils.Browser;
import utils.Utils;
import cucumber.api.Scenario;
import cucumber.api.java8.Pt;

public class BaseStep implements Pt {

	public BaseStep() {
		Before((Scenario scenario) -> {

			//System.setProperty("webdriver.chrome.driver", Utils.webdriverLocation());
			System.out.println("Base URL: " + Utils.getBaseUrl());
			Browser.loadPage(Utils.getBaseUrl());
		});

		After((scenario) -> {
			System.out.println("Cenário teste: " + scenario.getName());
			System.out.println("Status teste: " + scenario.getStatus().toUpperCase());
			System.out.println("---------------------------------------------------------------------------------------------------");
			Browser.close();
		});
	}

}

