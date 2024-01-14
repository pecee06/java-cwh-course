public class App {
    public static void main(String[] args) throws Exception {
        int a = 24;
        System.out.println(a);
        float b = 103.8f;

        int c = a++;
        // First c is assigned the value of a and then a is incremented by 1
        System.out.println(c);
        System.out.println(a);  // By now a is incremented, so its value is 25

        float d = ++b;
        // First b is incremented by 1 and then d is assigned the value of b (new value)
        System.out.println(d);
    }
}
