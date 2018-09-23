package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
WebDriver driver;

public HomePage(WebDriver ldriver){
	
	this.driver=ldriver;	
}

@FindBy(how=How.XPATH,using=".//*[contains(text(),'CRM')]")
WebElement CRM;

@FindBy(how=How.XPATH,using=".//*[contains(text(),'Add Contact')]")
WebElement AddContact;

@FindBy(how=How.NAME,using="name")
WebElement SearchCustomer;


public void NavigatingToAddContact(){
	
	CRM.click();
	AddContact.click();	
	
}

public void VerifyPageLogin(){
	
	CRM.isDisplayed(); // isDisplayed means if a element is visible or not.	
	SearchCustomer.isDisplayed();	
}

}
