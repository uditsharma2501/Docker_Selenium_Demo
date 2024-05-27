package maven_demo;

import org.testng.annotations.Test;

public class LoginTest{
	
	@Test(priority=0)
	public void Login_Success()
	{
		LoginPageUITest.inp_Username.sendKeys("abc@test.com");
		
		LoginPageUITest.inp_Password.sendKeys("test@123");
		
		LoginPageUITest.btn_Signin.click();
		
	}
}
