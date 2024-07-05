package flipkartpage;


import org.openqa.selenium.WebDriver;
import java.net.HttpURLConnection;
import java.net.URL;

public class UtilPage {
    public WebDriver driver;

    public UtilPage(WebDriver driver) {
        this.driver = driver;
    }

   
    public void getResponseCode() throws Exception {
    	URL ob = new URL("https://www.flipkart.com/");
    	HttpURLConnection con = (HttpURLConnection)ob.openConnection();
    	int responsecode = con.getResponseCode();
    	System.out.println(responsecode);
    	con.connect();
    	if(con.getResponseCode()==200)
    	{
    		System.out.println("valid");
    	}
    	else
    	{
    		System.out.println("invalid");

    	}
    	
     
    }
}



