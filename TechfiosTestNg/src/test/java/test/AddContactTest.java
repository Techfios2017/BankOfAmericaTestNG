package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContact;
import page.HomePage;
import page.LoginPage;
import util.BrowserFactory;
import util.Xls_Reader;

public class AddContactTest {
	
Xls_Reader reader=new Xls_Reader("/Users/eldrid/PageObject/TechfiosTestNg/Data/TestDataNg.xlsx");

String email= reader.getCellData("Sheet1", "Email", 2);
String password=reader.getCellData("Sheet1", "Password", 2);
String name= reader.getCellData("Sheet1", "FullName", 2);
String Company=reader.getCellData("Sheet1", "company", 2);
String Email=reader.getCellData("Sheet1", "EmailAdress", 2);
String phone=reader.getCellData("Sheet1", "phone", 2);
String address=reader.getCellData("Sheet1", "adress", 2);
String City=reader.getCellData("Sheet1", "city", 2);
String State=reader.getCellData("Sheet1", "state", 2);
String Zip=reader.getCellData("Sheet1", "zip", 2);
String country=reader.getCellData("Sheet1", "country", 2);



@Test
public void AddContact() throws InterruptedException{
	
WebDriver driver=BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");

LoginPage login= PageFactory.initElements(driver, LoginPage.class);

login.Login(email, password);

HomePage home=PageFactory.initElements(driver, HomePage.class);

home.VerifyPageLogin();

home.NavigatingToAddContact();

AddContact contact=PageFactory.initElements(driver, AddContact.class);

contact.FillingUpAddressForm(name, Company, Email, phone, address, City, State, Zip, country);



driver.close();
driver.quit();	
	
}








	


	

}
