package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Base {
public WebDriver driver;
@BeforeClass
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.drsheths.com/");
	driver.manage().window().maximize();
}
}
