package com.docker;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest2 {
	
	@Test
	public void test2() throws Exception{
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		
		URL url = new URL("http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);

		driver.get("https://www.google.com/");
		
		System.out.println("Google Page title is : ===> "+ driver.getTitle());
		
		driver.quit();
	}
}
