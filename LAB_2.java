
import java.util.Calendar;
public class LAB_2 {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();/*this just give you a templet of calander as we have hindu calender and all similarly 
        it gives GRIGORIAN calander just because for performing calender operation first of all we need a calendar*/
        System.out.println(c.getCalendarType());
       // System.out.println(c.getTimeZone());/*  USE THIS OR DOWN ONE GOOD LOOKING IS DOWN ONE */
        System.out.println(c.getTimeZone().getID());// asia/kolkata;
        System.out.println(c.getTime());// present day ka date time and year batayega 
        System.out.println(c.get(Calendar.DATE));// present date
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        String[] month={"january","febuary","march","april","may","june","july","august","september","october","november","december"};
        System.out.println("current month="+month[c.get(Calendar.MONTH)]);
    }
    
}
