package Scripts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import Poms.TAP;

public class Sesion6 {

private WebDriver driver; 
	
	@Before
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver(options);	
		}
	    
	
	@Test
	public void test() throws InterruptedException {
		driver.get("https://testautomationpractice.blogspot.com/");
		//busqueda google
		
		TAP tap = new TAP(driver);
		Thread.sleep(3000);
		
		tap.clickWikipediaIcon();
		Thread.sleep(500);
		tap.clickWikipediaIcon();
		Thread.sleep(500);
		tap.clickWikipediaIcon();
		Thread.sleep(500);
		tap.clickWikipediaIcon();
	
		tap.switchPageId(0);
		driver.get("https://www.youtube.com/");

		tap.switchPageId(1);
		driver.get("https://listado.mercadolibre.com.mx/");

		tap.switchPageId(2);
		driver.get("https://amazon.com.mx/");

		tap.switchPageId(3);
		driver.get("https://www.agroboca.com/comprar/sandias/");

		tap.switchPageId(4);
		driver.get("https://polytopia.io/");
		
		tap.switchPageTitle();
		
	

	}
	
	@After
	public void teardown() {
		
		//driver.quit();
	}
	
}
