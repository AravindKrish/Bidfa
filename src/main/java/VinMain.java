import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class VinMain {
    public static void main(String[] args) {
        DriverHelper driverHelper = new DriverHelper();
        WebDriver driver = driverHelper.getWebDriver();
        AuctionHelper auctionHelper = new AuctionHelper();
        List<String> auctionIDList = auctionHelper.getAuctionIDList(driver);

        driver.quit();
    }

    public static void AddItemtoWatchList(String itemName, List<String> auctionIDList, WebDriver driver){
        for (String auctionID:auctionIDList
             ) {

        }


    }
}
