package flipkartpage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SellerPage {
    public WebDriver driver;

    By becomeSellerLink = By.linkText("Become a Seller");
    By loginLink = By.linkText("Login");
    By registerLink = By.linkText("Register for new account");
    By nameField = By.id("seller_name");
    By emailField = By.id("seller_email");
    By passwordField = By.id("seller_password");
    By mobileNumberField = By.id("seller_mobile");
    By registerButton = By.id("seller_register");

    public SellerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBecomeSeller() {
        driver.findElement(becomeSellerLink).click();
    }

    public void clickLogin() {
        driver.findElement(loginLink).click();
    }

    public void clickRegister() {
        driver.findElement(registerLink).click();
    }

    public void fillSellerDetails(String name, String email, String password, String mobileNumber) {
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(mobileNumberField).sendKeys(mobileNumber);
    }

    public void clickRegisterButton() {
        driver.findElement(registerButton).click();
    }
}



