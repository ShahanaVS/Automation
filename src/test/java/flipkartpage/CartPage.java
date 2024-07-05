package flipkartpage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    public WebDriver driver;
    By cartIcon = By.xpath("//span[normalize-space()='Cart']");
    By removeItemButton = By.xpath("//div[normalize-space()='Remove']");
    By confirmRemoveButton = By.xpath("//div[normalize-space()='Remove']");
 

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openCart() {
        driver.findElement(cartIcon).click();
    }

    public void removeItem() {
        driver.findElement(removeItemButton).click();
        driver.findElement(confirmRemoveButton).click(); // Confirm removal
    }
}



