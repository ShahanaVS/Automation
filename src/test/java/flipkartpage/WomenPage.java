package flipkartpage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WomenPage {
    WebDriver driver;

    By sareesLink = By.linkText("Sarees");

    public WomenPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSarees() {
        driver.findElement(sareesLink).click();
    }
}



