package com.creasoft.pruebas;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PruebasApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testGoogleSearch() throws InterruptedException {
	    // Optional. If not specified, WebDriver searches the PATH for chromedriver.
	    System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.choucairtesting.com/empleos-testing/");
	    Thread.sleep(5000);  // Let the user actually see something!
	    WebElement searchBox = driver.findElement(By.name("q"));
	    searchBox.sendKeys("ChromeDriver");
	    searchBox.submit();
	    Thread.sleep(5000);  // Let the user actually see something!
	    driver.quit();
	  }

}
