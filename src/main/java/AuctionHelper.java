import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AuctionHelper {
    public List<String> getAuctionIDList(WebDriver driver){
        driver.get("https://www.bidfta.com/home");
        DateHelper dateHelper = new DateHelper();
        String dayofMonth = dateHelper.getDayofMonth();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> webElementList = driver.findElements(By.xpath("//*[@class='timeer-box']"));
        List<WebElement> webElementList1 = driver.findElements(By.xpath("//*[contains(@id, 'auctionContainer')]"));
        List <String> auctionIDList = null;
        for (int i=0 ;i<24; i++){
            if(webElementList.get(i).getText().contains(dayofMonth)){
                String str = webElementList1.get(i).getAttribute("id");
                auctionIDList.add(str.substring(16));
            }
        }
        return auctionIDList;
    }
}
