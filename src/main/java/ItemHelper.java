import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemHelper {

    public void addItemtoWatchList(String itemName, WebDriver driver){
        driver.findElements(By.xpath("//*[@class=“title txt-sm m-b-5”]"));
    }
}
