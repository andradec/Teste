package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReserverPage {

	private static WebElement cmp_UserName;
	private static WebElement cmp_Password;
	
	private static WebElement btnSign;
	private static WebElement btnContinue;
	private static WebElement btnConfirmFligth;
	private static WebElement btnSecure;
	
	private static Select SlcDepartingFrom;
	private static Select slcArrivingIn;
	
	private static Select data;
	private static WebElement Classe;
	
	private static WebElement checkOut;
	private static WebElement checkIn;
	private static WebElement checkOneWay;
	
	private static WebElement cmpFirstName;
	private static WebElement cmpLastName;
	private static WebElement numeroCartao;
	
	
	
	public static void Login(WebDriver driver) {
		
		cmp_UserName = driver.findElement(By.name("userName"));
		cmp_Password = driver.findElement(By.name("password"));
		
		cmp_UserName.sendKeys("mercury");
		cmp_Password.sendKeys("mercury");
		
		btnSign = driver.findElement(By.name("login"));
		btnSign.click();		
	}
	
	public static void SelecionarDestinoOrigem(WebDriver driver) {
		
		SlcDepartingFrom = new Select(driver.findElement(By.name("fromPort")));
		SlcDepartingFrom.selectByValue("Acapulco");

	}
	
	public static void SelecinarDestion(WebDriver driver) {
		
		slcArrivingIn = new Select(driver.findElement(By.name("toPort")));
		slcArrivingIn.selectByValue("Frankfurt");
	}
	
	public static void SelecionarData(WebDriver driver) {
		
		data = new Select(driver.findElement(By.name("toDay")));
		data.selectByValue("24");		
		
	}
	
	public static void SelecionarClasse(WebDriver driver) {
		
		Classe = driver.findElement(By.name("servClass"));
		Classe.click();		
	}
	
	public static void SelecionarContinue(WebDriver driver) {
		btnContinue = driver.findElement(By.name("findFlights"));
		btnContinue.click();
	}
	
	public static void Check(WebDriver driver) {
		checkOut = driver.findElement(By.name("outFlight"));
		checkOut.click();
		
		checkIn = driver.findElement(By.name("inFlight"));
		checkIn.click();
	}
	
	public static void ClicarContinueVoo(WebDriver driver) {
		btnConfirmFligth = driver.findElement(By.name("reserveFlights"));
		btnConfirmFligth.click();
	}
	
	public static void PreencherDados(WebDriver driver) {
		
		cmpFirstName = driver.findElement(By.name("passFirst0"));
		cmpFirstName.sendKeys("Caio");
		
		cmpLastName = driver.findElement(By.name("passLast0"));
		cmpLastName.sendKeys("Andrade");
		
		numeroCartao = driver.findElement(By.name("creditnumber"));
		numeroCartao.sendKeys("02132165456");
		
	}
	
	public static void ClicarSecurePurchase(WebDriver driver) {
		
		btnSecure = driver.findElement(By.name("buyFlights"));
		btnSecure.click();
		
	}
	
	public static void SelecionarOneWay(WebDriver driver) {
		
		checkOneWay = driver.findElement(By.xpath("//input[@value='roundtrip']"));
	}
	
	
	
	
}
