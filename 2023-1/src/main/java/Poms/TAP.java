package Poms;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class TAP {
	
	WebDriver driver;
	String alertButtonXpath = "//button[text()='Click Me']";
	String BotonDeAlerta = "//*[@id=\"HTML9\"]/div[1]/button[1]";
	String filexXpath = "//select[@name='files']";
	String speedXpath = "//select[@name='speed']";
	String wiki = "//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[1]/a";


	public TAP(WebDriver driver) {
		
		super();
		this.driver = driver;
		
	}
	
	public void clickAlertButton() {
		
		WebElement Button = this.driver.findElement(By.xpath(this.BotonDeAlerta));
		Button.click();
	}
		
	
	public void aceptAlert() {
		
		this.driver.switchTo().alert().accept();
		
	}
	
    public void cancelAlert() {
		
		this.driver.switchTo().alert().dismiss();
		
	}
    
    
    //por valor
    
   public String SelectCheckBoxByValue(String option) {
    	
    	String value = "";
		Select cb = new Select(this.driver.findElement(By.xpath(filexXpath)));
    	List<WebElement> options = cb.getOptions();
    	
    	for(WebElement element:options) {
    		
    		String auxValue = element.getAttribute("value");
    		if(auxValue.equals(option)) {
    			value = element.getText();
    		}
    		
    	}
    	
    	return value;
    }
   
   
   // por texto
    
    public String SelectCheckBoxByText(String option) {
    	
    	String value = "";
    	Select cb = new Select(this.driver.findElement(By.xpath(speedXpath)));
    	cb.deselectByVisibleText(value);
    	return value;
    }

	public void clickWikipediaIcon() {
		
		WebElement wikiico = driver.findElement(By.xpath(wiki));
		wikiico.click();
	}
	
	public void switchPageId(int n) {
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	   driver.switchTo().window(tabs2.get(n));

	}
	
	public void switchPageTitle() throws InterruptedException {
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());

		
	for (int i = 0; i < tabs2.size(); i++ ) {
		
		Thread.sleep(3000);
		driver.switchTo().window(tabs2.get(i));
			if (driver.getTitle().equals("YouTube")) {
				System.out.println(driver.getTitle());
			}
	    }
	}
}
