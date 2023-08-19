import java.util.Calendar;
public class l2{
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        String [] month={"jan","feb","march","april","may","june","july","august","sept","oct","nov","dec"};
        System.out.println("current month="+month[c.get(Calendar.MONTH)]);
    }
}