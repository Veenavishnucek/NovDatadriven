package datapagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Datadrivnpage {
	
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement fbemail;
	
	@FindBy(id="pass")
	WebElement fbpassword;
	
	@FindBy(name="login")
	WebElement fbclick;
	
	public Datadrivnpage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	public void setValues(String username,String password)
	{
		fbemail.sendKeys(username);
		fbpassword.sendKeys(password);
	}
	
	public void login()
	{
		fbclick.click();
	}
	
	public void clearemail()
	{
		fbemail.clear();
	}
	
	
	
	

}
