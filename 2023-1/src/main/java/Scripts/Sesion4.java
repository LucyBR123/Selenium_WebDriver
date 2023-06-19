package Scripts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Poms.GooglePage;
import Poms.TAP;

public class Sesion4 {
	
	
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
		TAP tap = new TAP(driver);
		Thread.sleep(3000);
		//busqueda google
		
		gp.typeOnSearchBar("test automation practice");
		//click en e primer resultado
		
		Thread.sleep(3000);

		
		gp.clickResultById(0);
		//clicl en booton para alerta
		
		
		String value = tap.SelectCheckBoxByValue("3");
		System.out.println(value);
		
		String value2 = tap.SelectCheckBoxByText("Medium");
		System.out.println(value2);

		
		//String value3 = tap.SelectCheckBoxByIndex(3);
		//System.out.println(value3);





		
	}
	
	@After
	public void teardown() {
		
		//driver.quit();
	}
	

}


