package Poms;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSh {

	WebDriver driver;
	String searchBarId = "twotabsearchtextbox";
	String checkSamsung = "//*[@id=\"p_89/SAMSUNG\"]/span/a/span";
	String PricePhoneText = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div/a/span";
	String OrderXpath = "//*[@id=\"search\"]/span/div/h1/div/div[2]/div/div/form/span";
	String OrderXpath2 = "//*[@id=\"a-popover-2\"]/div/div/ul/li[2]";
	
	public AmazonSh(WebDriver driver) {
		
		super();
		this.driver = driver;
		
	}
	
        public void typeOnSearchBar(String value) {
		
		WebElement searchBar = driver.findElement(By.id(searchBarId));
		searchBar.sendKeys(value);
		searchBar.sendKeys(Keys.ENTER);
	}
        
        public void ClickSamsungOption() {
        	
        	WebElement selectSamsung = driver.findElement(By.xpath(checkSamsung));
        	selectSamsung.click();
        	
        }
              
        public void OrderBy() {
        	
        	WebElement orderbyprice = driver.findElement(By.xpath(OrderXpath));
        	orderbyprice.click();
        	
        	WebElement orderbyprice2 = driver.findElement(By.xpath(OrderXpath2));
        	orderbyprice2.click();   	
        }
                
        public void getPricePhone() {
        	
        	WebElement pricepfhone = driver.findElement(By.xpath(PricePhoneText));
    		System.out.println(pricepfhone.getText());
        	
        }
        	
        
	
}
