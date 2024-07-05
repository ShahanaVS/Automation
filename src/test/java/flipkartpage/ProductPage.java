package flipkartpage;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class ProductPage {
	   public WebDriver driver;

	    By addToCartButton = By.cssSelector("button._2KpZ6l._2U9uOA._3v1-ww");

	    public ProductPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void addToCart() {
	        driver.findElement(addToCartButton).click();
	    }
	}



