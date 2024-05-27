package maven_demo;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageUITest extends Base {
	
	static WebElement lbl_Username=null, inp_Username=null, lbl_Password=null, inp_Password=null;
	static WebElement btn_Signin=null;
	
	
	@Test(priority=0)
	public void Find_Username_Label() //if exception is caught and assertion is added in catch block, test case will fail with provided message
	{	
		try {
		
			lbl_Username=driver.findElement(By.xpath("//label[text()='Username']"));
		
		}catch(NoSuchElementException e)
		{
			Assert.fail("Email label not visible");
		}
	}
	
	
	@Test(priority=1)
	public void Find_Email_Input()          //if exception is caught and no assertion is added in catch block, test case will pass
	{
		try{
			
			inp_Username=driver.findElement(By.xpath("//input[@id='username']"));
		
		}catch(NoSuchElementException e)
		{
			//System.out.println("Element not found");
			//Assert.assertFalse(inp_email==null,"Email input field not visible");
		}
	}
	
	
	@Test(priority=2)
	public void Find_Password_Label()
	{				
		try {
			
			lbl_Password=driver.findElement(By.xpath("//label[text()='Password']"));
			
		}catch(NoSuchElementException e)
		{
			Assert.fail("Password label not visible");
		}
	
	}
	
	
	@Test(priority=3)
	public void Find_Password_Input()
	{				
		try{
			
			inp_Password=driver.findElement(By.xpath("//input[@id='password']"));
			
		}catch(NoSuchElementException e)
		{
			Assert.fail("Password input field not visible");
		}
	}
	
	
	
	@Test(priority=7)
	public void Find_Signin_Button()
	{				
		try{
			
			btn_Signin=driver.findElement(By.xpath("//a[@id='log-in']"));
			
		}catch(NoSuchElementException e)
		{
			Assert.fail("Signin Button not visible");
		}
	}


}
