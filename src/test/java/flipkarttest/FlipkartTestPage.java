package flipkarttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import flipkartpage.CartPage;
import flipkartpage.GiftCardsPage;
import flipkartpage.HomePage;
import flipkartpage.Loginpage;
import flipkartpage.ProductPage;
import flipkartpage.SellerPage;
import flipkartpage.UtilPage;
import flipkartpage.WomenPage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FlipkartTestPage {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void url() {
        driver.get("https://www.flipkart.com");
    }

    @Test
public void homepage()
{
    	HomePage ob = new HomePage(driver);
    	ob.clickGrocery();
    	ob.clickMobilePhones();
    	ob.searchFor("laptop");
    	ob.mouseOverLogin();
    	ob.mouseOverWomen();
    	
}

    @Test
 public void cart()
 {
    	CartPage b = new CartPage(driver);
    	b.openCart();
    	b.removeItem();
 }
    @Test
    public void giftcard()
    {
    	GiftCardsPage c = new GiftCardsPage(driver);
    	c.clickGiftCards();
    	c.clickAddToWallet();
    	
    }

    @Test
    public void LoginPage()
    {
    	Loginpage d = new Loginpage(driver);
    	d.clickMyProfile();
    	d.createAccount("5555555555");
    }

    

    @Test
    public void product()
    {
    	ProductPage e = new ProductPage(driver);
    	e.addToCart();
    }

    @Test
    public void seller()
    {
    	SellerPage f = new SellerPage(driver);
    	f.clickBecomeSeller();
    	f.clickLogin();
    	f.clickRegister();
    	f.fillSellerDetails("Shaah", "shaa@gmail.com", "sgfg", "5555555555");
    	f.clickRegisterButton();
    }

    @Test
public void util() throws Exception
{
   UtilPage i = new UtilPage(driver);
   i.getResponseCode();
}
   

    @Test
public void women()
{
    	WomenPage j = new WomenPage(driver);
    	j.clickSarees();
}
   
}
