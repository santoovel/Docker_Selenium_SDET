package com.docker;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SetUp_DockerGrid {

	//@Test(priority=1)
	@BeforeTest
	void startDockerGrid() throws Exception {
		//to run docker-compose up
		Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat");
		
		//wait for docker-compose up
		Thread.sleep(15000);
	}

	// @Test(priority=2)
	@AfterTest
	void stopDockerGrid() throws Exception {
		
		//to run docker-compose down
		
		Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat");
		Thread.sleep(5000);
		
		//closed all command promts
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
	}
}
