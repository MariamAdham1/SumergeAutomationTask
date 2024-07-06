import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task {

    WebDriver driver;
    WebElement Username;
    WebElement Password;
    WebElement LoginButton;
    WebElement TitlePage;
    WebElement ErrorMessage;

    @BeforeTest
    public void setUp() {
    	
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void setUpElements() {
        Username = driver.findElement(By.id("user-name"));
        Password = driver.findElement(By.id("password"));
        LoginButton = driver.findElement(By.id("login-button"));
    }

    @Test
    public void validLogin() {
        Username.sendKeys("standard_user");
        Password.sendKeys("secret_sauce");
        LoginButton.click();

        TitlePage = driver.findElement(By.className("app_logo"));

        assertTrue(TitlePage.isDisplayed());
    }

    @Test
    public void invalidLogin() {
        Username.sendKeys("Test");
        Password.sendKeys("Test");
        LoginButton.click();

        ErrorMessage = driver.findElement(By.cssSelector(".error-message-container.error"));

        assertTrue(ErrorMessage.isDisplayed());
    }
    
    @Test
    public void emptyUsername() 
    {
    	Username.sendKeys("");
    	Password.sendKeys("secret_sauce");
    	LoginButton.click();
    	
    	WebElement validationEmptyMessage = driver.findElement(By.xpath("//*[contains(text(),'Epic sadface: Username is required')]"));
    	
    	assertTrue(validationEmptyMessage.isDisplayed());
		
	}
    
    @Test
    public void emptyPassword()
    {
    	Username.sendKeys("standard_user");
    	Password.sendKeys("");
    	LoginButton.click();
    	
    	WebElement validationEmptyMessage = driver.findElement(By.xpath("//*[contains(text(),'Epic sadface: Password is required')]"));
    	
    	assertTrue(validationEmptyMessage.isDisplayed());
    }
}
