package Scripts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Poms.AmazonSh;
import Poms.GooglePage;

public class Sesion5 {

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
		driver.get("https://www.google.com/");
		GooglePage gp = new GooglePage(driver);
		AmazonSh sh = new AmazonSh(driver);
		Thread.sleep(3000);
		//busqueda google
		
		gp.typeOnSearchBar("Amazon");
		//click en e primer resultado
		
		Thread.sleep(3000);

		
		gp.clickResultById(0);
		//clicl en booton para alerta
		
		Thread.sleep(3000);

		
		sh.typeOnSearchBar("Celulares");
		
		Thread.sleep(3000);
		
		sh.ClickSamsungOption();
		
		Thread.sleep(3000);
		
		sh.OrderBy();
		
		Thread.sleep(3000);
		
		sh.getPricePhone();

		
	}
	
	@After
	public void teardown() {
		
		//driver.quit();
	}
	
}
