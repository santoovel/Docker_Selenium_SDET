package com.docker;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirefoxTest4 {
	
	@Test
	public void test4() throws Exception{
		
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		
		URL url = new URL("http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);

		driver.get("https://www.amazon.in/");
		
		System.out.println("Amazon Page title is : ===> "+ driver.getTitle());
		
		driver.quit();
	}
}
