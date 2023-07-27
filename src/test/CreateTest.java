package test;


import org.testng.annotations.Test;

import page.Createaccount;

public class CreateTest extends Base {
	
	@Test
	public void testing() throws InterruptedException
	{
		Createaccount p=new Createaccount(driver);
		Thread.sleep(2000);
		p.createclick();
		Thread.sleep(2000);
		//p.createlink();
		//p.accountcreate("Subitha", "Bhaskar", "subithab1994@gmail.com", "Manni22019");
		p.accountbutton();
		p.login("subithab1994@gmail.com", "Manni22019");
		Thread.sleep(2000);
		p.search("sunscreen");
		Thread.sleep(2000);
		p.selectitem();
		Thread.sleep(2000);
		p.cartadd();
		
	}
	

}
