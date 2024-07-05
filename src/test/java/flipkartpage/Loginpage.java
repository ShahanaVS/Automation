package flipkartpage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
   public WebDriver driver;

    By myProfileLink = By.xpath("//div[contains(text(),'My Profile')]");
    By createAccountLink = By.xpath("//a[text()='Create an account']");
    By mobileNumberField = By.cssSelector("input._2IX_2-");
    By continueButton = By.cssSelector("button._2KpZ6l._2HKlqd._3AWRsL");

    public Loginpage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMyProfile() {
        driver.findElement(myProfileLink).click();
    }

    public void createAccount(String mobileNumber) {
        driver.findElement(createAccountLink).click();
        driver.findElement(mobileNumberField).sendKeys(mobileNumber);
        driver.findElement(continueButton).click();
    }
}



