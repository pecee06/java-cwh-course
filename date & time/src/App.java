// Date in java is stored in the form of a long number. This long number holds the numbe of miliseconds passed since 1 Jan 1970

// Java assumes 1900 to be the start year

import java.util.Date;  // This class is deprecated now

public class App {
    public static void main(String[] args) throws Exception {
        /*
        long max = Long.MAX_VALUE;
        long current = System.currentTimeMillis();  // This returns number of miliseconds passed since 1 Jan 1970
        // This method is deprecated though

        System.out.println(max-current);
        */

        Date d = new Date();
        System.out.println(d);

        System.out.println(d.getTime());    // This returns number of miliseconds passed since 1 Jan 1970
    }
}
