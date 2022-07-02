package org.napf.locators;

import org.openqa.selenium.support.PageFactory;
import org.swiggy.baseclass.Seleniumday1;

public class HompageLocator extends Seleniumday1 {
	
	public HompageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	public String createInves="return document.querySelector(\"pf-portal-header > pf-menu-item\").shadowRoot.querySelector(\"div  > a\")";
	
	public String creteInvestText="return document.querySelector(\"pf-editor-page\").shadowRoot.querySelector(\"div > div > pf-grid > pf-editor-header\").shadowRoot.querySelector(\"pf-text\")";
	

}
