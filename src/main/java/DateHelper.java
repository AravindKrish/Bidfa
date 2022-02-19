import java.util.Calendar;
import java.util.Date;

public class DateHelper {

    public String getDayofMonth(){
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        String dayOfMonthStr = String.valueOf(dayOfMonth)+"th";
        return dayOfMonthStr;
    }
}
