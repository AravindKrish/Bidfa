import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverHelper {

    public WebDriver getWebDriver(){
        System.setProperty("webdriver.chrome.driver","/Users/aravindkrishnan/IdeaProjects/bidfat/chromedriver");
        WebDriver driver = new ChromeDriver();
        return driver;
    }
}
