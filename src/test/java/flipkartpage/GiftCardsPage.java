package flipkartpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GiftCardsPage {
    public WebDriver driver;
    By giftCardsLink = By.xpath("//div[contains(text(),'Gift Cards')]");

    By addToWalletLink = By.linkText("Add to Wallet");

    public GiftCardsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickGiftCards() {
        driver.findElement(giftCardsLink).click();
    }
    public void clickAddToWallet() {
        driver.findElement(addToWalletLink).click();
    }
}



