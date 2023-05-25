package Woocommerce;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library.Utility;

public class woo_TestScenario {
	WebDriver driver;
	String price="";

	@BeforeMethod
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver\\chromedriver_win32 (5)\\chromedriver.exe");      
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	 }
	
	@Test(priority=1)
	public void loginCredentials() throws InterruptedException, AWTException  {
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.get("https://woocommerce-850415-2933260.cloudwaysapps.com/my-account");
  	Thread.sleep(5000);	 
	Robot robot = new Robot();
	for (int i = 0; i < 3; i++) {
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_CONTROL);   }
				
	driver.findElement(By.id("username")).sendKeys("test_customer");
	driver.findElement(By.id("password")).sendKeys("password");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement Element = driver.findElement(By.name("login"));
	js.executeScript("arguments[0].scrollIntoView();", Element);
	driver.findElement(By.name("login")).click();
	System.out.println("Login successfully");
	Thread.sleep(2000);
	} 
	
	 @Test(priority=2)
	public void ProductPageFieldTest() throws InterruptedException, AWTException {
			 
	driver.get("https://woocommerce-850415-2933260.cloudwaysapps.com/product/rf-id-card");
	Thread.sleep(5000);	 
	Robot robot = new Robot();
	for (int i = 0; i < 3; i++) {
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_CONTROL);   }
	Select color = new Select(driver.findElement(By.id("color")));
	color.selectByValue("Red");	
		
	Select orientation = new Select(driver.findElement(By.id("orientation")));
	orientation.selectByValue("Landscape");
		
	driver.findElement(By.id("profile_description")).sendKeys("Test description");
	driver.findElement(By.id("need_phone")).click();
	driver.findElement(By.id("phone_number")).sendKeys("9876543210");
		
	WebElement lo=driver.findElement(By.className("select2-selection__rendered"));
	lo.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/span/span/span/ul/li[1]")).click();
	lo.click();

	WebElement Border=driver.findElement(By.xpath("/html/body/span/span/span/ul/li[2]"));
	Border.click();
	
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/main/div[2]/div[2]/form/div/div[2]/table/tbody/tr[5]/td[2]/input")).sendKeys("C:\\Users\\91884\\Pictures\\Screenshots\\Pet1.png");
    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/main/div[2]/div[2]/form/div/div[2]/button")).click();
    System.out.println(" “RF ID Card” has been added to your cart.");
    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/a")).click();
    System.out.println("Product successfully added to the Cart");

	 }	 
	
	 @Test(priority=3)
	public void FieldValidationTest() throws InterruptedException, AWTException {
			 
	driver.get("https://woocommerce-850415-2933260.cloudwaysapps.com/product/rf-id-card");
	Thread.sleep(5000);	 
	Robot robot = new Robot();
	for (int i = 0; i < 4; i++) {
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_CONTROL);   }
	Select color = new Select(driver.findElement(By.id("color")));
	color.selectByValue("Red");	
			
	Select orientation = new Select(driver.findElement(By.id("orientation")));
	orientation.selectByValue("Landscape");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement Cart = driver.findElement(By.xpath("//button[normalize-space()='Add to cart']"));
	js.executeScript("arguments[0].scrollIntoView();", Cart);
	Cart.click();
	driver.manage().timeouts().implicitlyWait(1800, TimeUnit.SECONDS);
	
	Utility.CaptureScreenShot(driver, "Add to cart");
	System.out.println("'Please fill out this field' validation is shown successfully.Please refer the screenshot for details. ");

 }	
	
	 @Test(priority=4)
		public void VerifyMinimumValidationOfAdditionalElementField() throws InterruptedException, AWTException {
				 
		driver.get("https://woocommerce-850415-2933260.cloudwaysapps.com/product/rf-id-card");
		Thread.sleep(5000);	 
		Robot robot = new Robot();
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);   }
		Select color = new Select(driver.findElement(By.id("color")));
		color.selectByValue("Red");	
			
		Select orientation = new Select(driver.findElement(By.id("orientation")));
		orientation.selectByValue("Landscape");
				
		driver.findElement(By.id("profile_description")).sendKeys("Test description");
		
		driver.findElement(By.className("select2-selection__rendered")).click();
				
		WebElement Border=driver.findElement(By.xpath("/html/body/span/span/span/ul/li[2]"));
		Border.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Cart = driver.findElement(By.xpath("//button[normalize-space()='Add to cart']"));
		js.executeScript("arguments[0].scrollIntoView();", Cart);
		Cart.click();

		Utility.CaptureScreenShot(driver, "Minium Field Limit");
		System.out.println("Perform Minimum Validation Test & refer screenshot for details. ");

		WebElement Error=driver.findElement(By.cssSelector("#content > div > div.woocommerce > ul > li"));
		System.out.println("VALIDATION MESSAGE : "+Error.getText()+" is shown. ");
		
		 }
	
	 @Test(priority=5)
		public void VerifyProductQuickViewTest() throws InterruptedException, AWTException {
	    					
		driver.get("https://woocommerce-850415-2933260.cloudwaysapps.com/shop");
		Thread.sleep(5000);	 
		Robot robot = new Robot();
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);   }  
	     driver.findElement(By.linkText("Quick View")).click();
	     System.out.println("Successfully shows the quick View popup. But cannot find color field on popup. ");
	    }
	 
	 @Test(priority=6)
		public void VerifyCheckout_FieldTest() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver\\chromedriver_win32 (5)\\chromedriver.exe");      
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	 
		driver.get("https://woocommerce-850415-2933260.cloudwaysapps.com/product/cap");
		WebElement AddCart=driver.findElement(By.name("add-to-cart"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", AddCart);
		AddCart.click();
		
		WebElement Pprice =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/main/div[2]/div[2]/p/ins/span/bdi"));
		price=Pprice.getText();
		System.out.println("Product price = "+price);
		price=price.replaceAll("[$]*", "");
		Double d = Double.valueOf(price); 
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		 handlewindlow("Untitled"); //Untitled is title for new tab 

		driver.get("https://woocommerce-850415-2933260.cloudwaysapps.com/checkout");
		driver.findElement(By.id("billing_first_name")).sendKeys("Fname");
		driver.findElement(By.id("billing_last_name")).sendKeys("Lname");
		
		Select country=new Select(driver.findElement(By.id("billing_country")));
		country.selectByValue("IN");
		
		driver.findElement(By.id("billing_address_1")).sendKeys("123 abc");
		driver.findElement(By.id("billing_city")).sendKeys("Calicut");
		
		Select state=new Select(driver.findElement(By.id("billing_state")));
		state.selectByValue("KL");
		
		driver.findElement(By.id("billing_postcode")).sendKeys("673016");
		driver.findElement(By.id("billing_phone")).sendKeys("9876543210");
		driver.findElement(By.id("billing_email")).sendKeys("mufidauc@gmail.com");
        driver.findElement(By.id("need_delivery_yes")).click();
        double n=40.00;
        double ExpectedPrice=d + n ;
		System.out.println("Expected Product Price = "+ExpectedPrice);
	
		WebElement Actprice=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/main/article/div/div/form[2]/div[2]/table/tfoot/tr[4]/td/strong/span/bdi"));
		js.executeScript("arguments[0].scrollIntoView();", Actprice);

		String Actualvalue=Actprice.getText();
		System.out.println("Actual price= "+Actualvalue);
		Actualvalue=Actualvalue.replaceAll("[$]*", "");
		Double Avalue = Double.valueOf(Actualvalue); 
		//System.out.println(Avalue); 
	    if(Avalue==ExpectedPrice) {
			System.out.print("Actual product value displayed correctely");
		}
	    else {
			System.out.print("Actual product price displayed on order summary does not match with expected price ");
		}
	    
	   driver.findElement(By.id("delivery_date")).click();
	   driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[5]/td[2]/a")).click();
	   driver.manage().timeouts().implicitlyWait(1800, TimeUnit.SECONDS);
	   driver.findElement(By.id("delivery_time")).click();
	   driver.findElement(By.xpath("/html/body/div[5]/ul/li[23]")).click();
	   driver.manage().timeouts().implicitlyWait(1800, TimeUnit.SECONDS);
	   driver.findElement(By.id("delivery_addons_packing")).click();
    driver.manage().timeouts().implicitlyWait(1800, TimeUnit.SECONDS);
    driver.findElement(By.id("delivery_addons_wooden_box")).click();
    Thread.sleep(3000);
    WebDriverWait wait = new WebDriverWait(driver,2000);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div/div/main/article/div/div/form[2]/div[2]/div/ul/li[3]/label")));
    js.executeScript("window.scrollBy(0,-500)");
    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/main/article/div/div/form[2]/div[2]/div/ul/li[3]/label")).click();
    driver.findElement(By.id("place_order")).click();
    System.out.println("Order placed Successfully ");


}
	 private void handlewindlow(String string) {
			Set<String>setHandleValues=driver.getWindowHandles();

			Iterator<String> iteHandleValues=setHandleValues.iterator();    
			                   while(iteHandleValues.hasNext()==true){
			            String handleValue=iteHandleValues.next();
			                driver.switchTo().window(handleValue);
			              
		}
	 }
}
