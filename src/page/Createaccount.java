package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class Createaccount {
	WebDriver driver;
	By account=By.xpath("//a[@href='/account']");
	By createlink=By.xpath("//button[@class='btn-button bordered']");
	By firstname=By.xpath("//input[@name='customer[first_name]']");
	By lastname=By.xpath("//input[@name='customer[last_name]']");
	By emailid=By.xpath("//input[@name='customer[email]']");
	By pass=By.xpath("//input[@name='customer[password]']");
	By submit=By.xpath("//input[@type='submit']");
	By logemail=By.xpath("//input[@type='email']");
	By logpass=By.xpath("//input[@type='password']");
	By loginbutton=By.xpath("//input[@value='Log in']");
	By searchitem=By.xpath("//input[@name='s']");
	By itemselect=By.xpath("//*[@id=\"searchModal\"]/div/div/div[1]/div[1]/div[2]/div[3]/div[1]/div/div[1]/a/img");
	By cart=By.xpath("//button[@name='add']");
	
public Createaccount(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}

public void createclick()
{
	driver.findElement(account).click();
}
public void createlink()
{
	driver.findElement(createlink).click();
}
public void login(String email,String pass)
{
driver.findElement(logemail).sendKeys(email);
driver.findElement(logpass).sendKeys(pass);
driver.findElement(loginbutton).click();
}


/*
 * public void accountcreate(String fname,String lname,String email,String
 * password) { driver.findElement(firstname).sendKeys(fname);
 * driver.findElement(lastname).sendKeys(lname);
 * driver.findElement(emailid).sendKeys(email);
 * driver.findElement(pass).sendKeys(password); }
 */
public void accountbutton()
{
	driver.findElement(submit).click();
}
public void search(String item)
{
	driver.findElement(searchitem).sendKeys(item,Keys.ENTER);
}
public void selectitem()
{
	driver.findElement(itemselect).click();
}
public void cartadd()
{
	driver.findElement(cart).click();
}
}