// import java.util.ArrayList;
// import java.time.LocalTime;
// import java.time.format.DateTimeFormatter;
import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        // Question 1
        /*
        ArrayList<String> arr1 = new ArrayList<>(10);
        arr1.add("Suman");
        arr1.add("Priya");
        arr1.add("Amit");
        arr1.add("Karan");
        arr1.add("Dev");
        arr1.add("Surbhi");
        arr1.add("Karthik");
        arr1.add("Pragya");
        arr1.add("Niyati");
        arr1.add("Shyam");

        for (String item : arr1) {
            System.out.println(item);
        }
        */

        // Question 2
        /*
        LocalTime t = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");
        String time = t.format(dtf);
        System.out.println(time);
        */

        // Question 3
        HashSet<Integer> s = new HashSet<>();
        s.add(2);
        s.add(8);
        s.add(4);
        s.add(2);

        System.out.println(s);
    }
}
