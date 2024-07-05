package flipkartpage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HomePage {
    WebDriver driver;

    By groceryLink = By.xpath("//span[text()='Grocery']");
    By mobilePhonesLink = By.xpath("//span[text()='Mobiles']");
    By logo = By.xpath("//img[@title='Flipkart']");
    By searchBox = By.name("q");
    By image = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img");
    By loginMenu = By.xpath("//a[@href='/account/login']");
    By womenMenu = By.xpath("//span[text()='Women']");
    

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickGrocery() {
        driver.findElement(groceryLink).click();
    }

    public void clickMobilePhones() {
        driver.findElement(mobilePhonesLink).click();
    }


       
    

    public void searchFor(String keyword) {
        driver.findElement(searchBox).sendKeys(keyword);
        driver.findElement(searchBox).submit(); 
   
    }
     
    
    public void mouseOverLogin() {
        Actions actions = new Actions(driver);
        WebElement loginElement = driver.findElement(loginMenu);
        actions.moveToElement(loginElement).perform();
    }

    public void mouseOverWomen() {
        Actions actions = new Actions(driver);
        WebElement womenElement = driver.findElement(womenMenu);
        actions.moveToElement(womenElement).perform();
    }

   
}



