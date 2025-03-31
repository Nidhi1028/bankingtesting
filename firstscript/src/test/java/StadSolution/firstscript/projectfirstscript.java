package StadSolution.firstscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class projectfirstscript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	// setup
		WebDriverManager.chromedriver().setup();
		
		//open browser
		WebDriver driver = new ChromeDriver();
		
		// redirct to url
		String url = "https://www.saucedemo.com/";
		driver.get(url);
		
		driver.manage().window().maximize();
	
		String actualTitle = driver.getTitle();
		String expectedTitle= "Swag Labs";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("matced title");
		}
		else
		{
			System.out.println("not match title");
		}
		
		
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://www.saucedemo.com/";
		
		if(actualurl.equalsIgnoreCase(expectedurl))
		{
			System.out.println("match website url");
		}
		else
		{
			System.out.println("not match url");
		}
		
	WebElement usernames  = driver.findElement(By.id("login_credentials"));
	String  Str = usernames.getText();
	System.out.println(Str);
	
	
    String firstLine = Str.split("\n")[6];
   System.out.println(firstLine);

	WebElement username = 	driver.findElement(By.id("user-name"));
	username.click();	
	for(int i=0; i<firstLine.length(); i++);
	{
		username.sendKeys(firstLine);
	}
	
	WebElement password = driver.findElement(By.id("password"));
	password.click();
	
	WebElement pass=  driver.findElement(By.cssSelector("div[class='login_password']"));
	String size1 = pass.getText();
	// System.out.println(size1);
	
	String Secoundline = size1.split("\n")[1];
	
	password.sendKeys(Secoundline);
	
	boolean buttn = driver.findElement(By.id("login-button")).isEnabled();
	System.out.println("login button Enabeled = "+buttn);
	
	driver.findElement(By.id("login-button")).click();

	
	String actualUrl = driver.getCurrentUrl();
	String expectedUrl="https://www.saucedemo.com/inventory.html";
	if(actualUrl.equalsIgnoreCase(expectedUrl))
	{
		System.out.println("match product page url");
	}
	else
	{
		System.out.println("not match product page url");
	}
	
	
	driver.findElement(By.className("bm-burger-button")).click();
	
	driver.findElement(By.id("inventory_sidebar_link")).click();
	
	driver.findElement(By.id("about_sidebar_link")).click();
	driver.navigate().back();
	
	
	driver.findElement(By.id("react-burger-menu-btn")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.id("reset_sidebar_link")).click();	
	boolean lastmenu = 	driver.findElement(By.id("reset_sidebar_link")).isEnabled();
	System.out.println(" "+lastmenu);
	
	driver.findElement(By.id("react-burger-cross-btn")).click();
	
	driver.findElement(By.className("product_sort_container")).click();
	
	driver.findElement(By.cssSelector("option[value='lohi']")).click();
	
	
	//System.out.println();
	
	
	
	
	}

}
