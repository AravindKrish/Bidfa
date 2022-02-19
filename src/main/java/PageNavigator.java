import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageNavigator {

    public void navigateToAuctionPage(WebDriver driver, String auctionID,String pageID){
        //https://www.bidfta.com/auctionItems?listView=true&idauctions=142323&pageId=1
        String auctionPageUrl = String.format("https://www.bidfta.com/auctionItems?listView=true&idauctions=%s&pageId=%s",auctionID,pageID);
        driver.get(auctionPageUrl);
    }

    public void getTotalPageinAuction(WebDriver driver){
        String lastPageNumber = driver.findElement(By.xpath("//*[@class=“total total_page”]")).getText();
    }
}
