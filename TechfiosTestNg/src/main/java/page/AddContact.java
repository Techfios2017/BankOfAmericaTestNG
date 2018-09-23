package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddContact {

	WebDriver driver;

	public AddContact(WebDriver ldriver){
		
		this.driver=ldriver;	
	}

	@FindBy(how=How.ID,using="account")
	WebElement FullName;

	@FindBy(how=How.ID,using="company")
	WebElement Company ;

	@FindBy(how=How.ID,using="email")
	WebElement Email;

	@FindBy(how=How.ID,using="phone")
	WebElement Phone;

	@FindBy(how=How.ID,using="address")
	WebElement Address;

	@FindBy(how=How.ID,using="select2-country-container")
	WebElement Country;

	@FindBy(how=How.XPATH,using="html/body/span/span/span[1]/input")
	WebElement CountryTextbox;

	@FindBy(how=How.ID,using="city")
	WebElement City;

	@FindBy(how=How.ID,using="state")
	WebElement State;

	@FindBy(how=How.ID,using="zip")
	WebElement Zip;

	@FindBy(how=How.ID,using="submit")
	WebElement Submit;

	public void FillingUpAddressForm(String name,String company,String email, String phone,String address,String city, String state,String zip,String country) throws InterruptedException{
		
	FullName.sendKeys(name);
	Company.sendKeys(company);
	Email.sendKeys(email);
	Phone.sendKeys(phone);
	Address.sendKeys(address);
	City.sendKeys(city);
	State.sendKeys(state);
	Zip.sendKeys(zip);
	Country.click();
	CountryTextbox.sendKeys(country);
	CountryTextbox.sendKeys(Keys.ENTER);
	Submit.click();			
	}
	
}
