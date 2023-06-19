package Poms;//page object model, son clases que representan paginas

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {

	WebDriver driver;
	String searchBarId = "APjFqb";
	String firstResult= "//h3[text()='Wikipedia']";
	String SecondResult= "//*[@id='firstHeading']/span";
	String resultClass = "//h3[@class='LC20lb MBeuO DKV0Md']";
	String imprime1 = "//*[@id=\"mw-content-text\"]/div[1]/p[1]";
	String imprime2 = "//*[@id=\"mw-content-text\"]/div[1]/p[3]";
	String imprime3 = "//*[@id=\"mw-content-text\"]/div[1]/p[4]";
	String AceptResult = "//*[@id=\"demo\"]";
	String CancelResult = "//*[@id=\"demo\"]";
	String PrimerParrafo = "//*[@id=\"main-tfa\"]/p[1]";


	public GooglePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public GooglePage() {
		
	}
	
	public void printTXT() {
		WebElement fr = driver.findElement(By.xpath(AceptResult));
		System.out.println(fr.getText());
	}
	
	public void printCancel() {
		WebElement fr = driver.findElement(By.xpath(CancelResult));
		System.out.println(fr.getText());
	}

	public void typeOnSearchBar(String value) {
		
		WebElement searchBar = driver.findElement(By.id(searchBarId));
		searchBar.sendKeys(value);
		searchBar.sendKeys(Keys.ENTER);
	}
	public void clickFirstResult() {
		WebElement fr = driver.findElement(By.xpath(firstResult));//buqueda por xpath
		fr.click();
	}
	
	public void printFirstResult() {
		WebElement fr = driver.findElement(By.xpath(SecondResult));
		System.out.println(fr.getText());
				
	}
	
	public void clickResultById(int result) {
		
		List <WebElement> list = driver.findElements(By.xpath(resultClass));
		list.get(result).click();//obtiene el elemento result
	}
	
	public void printTitle() {
		System.out.println(driver.getTitle());
	}
	
	public void printResults() {//imprime todos los resultados
		List <WebElement> list = driver.findElements(By.xpath(resultClass));
		
		for(WebElement element: list) {
			System.out.println(element.getText());
		}
	}
	
	
	public void imprimirParrafo() {
		
			WebElement fr = driver.findElement(By.xpath(PrimerParrafo));
			System.out.println(fr.getText());
		
	}
	
	public void print1() {//imprime todos los resultados
		List <WebElement> list = driver.findElements(By.xpath(imprime1));
		
		for(WebElement element: list) {
			System.out.println(element.getText());
		}
	}
	
	public void print2() {//imprime todos los resultados
		List <WebElement> list = driver.findElements(By.xpath(imprime2));
		
		for(WebElement element: list) {
			System.out.println(element.getText());
		}
	}
	
	public void print3() {//imprime todos los resultados
		List <WebElement> list = driver.findElements(By.xpath(imprime3));
		
		for(WebElement element: list) {
			System.out.println(element.getText());
		}
	}
	
	
	
}






