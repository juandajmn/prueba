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
		//Keyword
	    WebElement searchBox = driver.findElement(By.id("search_keywords"));
	    //si existe un registro en la caja de texto lo limpia
		searchBox.clear();
		//busqueda de palabra
		searchBox.sendKeys("automatizador medellín y bogotá");

		//Location
		WebElement locationsearchBox = driver.findElement(By.id("search_location"));
		//si existe un registro en la caja de texto lo limpia
		locationsearchBox.clear();
		//busqueda de localidad
		locationsearchBox.sendKeys("medellín");

		//btn-search
		WebElement btnsearchBox = driver.findElement(By.id("Search Jobs"));
		btnsearchBox.click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  }

}
