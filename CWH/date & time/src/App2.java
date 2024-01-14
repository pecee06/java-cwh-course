// import java.util.Calendar;
// import java.util.TimeZone;
import java.util.GregorianCalendar;

public class App2 {
    public static void main(String[] args) {

        /*
        // Calendar is an abstract class, thus its object can't be instantiated
        // However it provides a static method, which can be instantiated with reference Calendar

        Calendar c = Calendar.getInstance();    // This creates an instance of System Timezone

        // Creating instance of British Timezone
        for (String element : TimeZone.getAvailableIDs()) {
            System.out.print(element+"\t"); // Will print IDs of all the time zones
        }

        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        
        String c_type = c.getCalendarType();    // Returns "gregory" (Gregorian calendar)
        System.out.println(c_type);

        // Getting the time zone
        System.out.println(c.getTimeZone());
        System.out.println(c1.getTimeZone());

        System.out.println(c.getTime());    // Returns current date and time

        System.out.println(c.get(Calendar.DATE));   // Returns current date
        System.out.println(c.get(Calendar.HOUR));   // Returns current hour (12-hour format)
        */

        /*
        System.out.println(c.get(Calendar.HOUR_OF_DAY));    // Returns current hour (24-hour format)
        System.out.println(c.get(Calendar.MINUTE));   // Returns current minute
        System.out.println(c.get(Calendar.SECOND)); // Returns current second
        */

        /*
        System.out.println("*****TIME*****");
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        System.out.println("**********");
        */

        GregorianCalendar c2 = new GregorianCalendar(); // This is a concrete class inherited from 'Calendar' class
        System.out.println(c2.isLeapYear(2022));
        
    }
}

/*
URL for Timezone IDs (official documentation):
* https://docs.oracle.com/cd/B13866_04/webconf.904/b10877/timezone.htm
*/