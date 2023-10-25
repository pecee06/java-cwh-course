// Variables are containers for storing data values
// Variable name, i.e., identifier should not be a keyword, it must not begin with a digit, should not have spaces in between and are case sensitive

// Data types specify the different sizes and values that can be stored in a variable
// 2 types of data types :
    // Primitive --> boolean, char, byte, short, int, long, float and double
    // Non-primitive --> string, classes, interfaces and arrays

public class App {
    public static void main(String[] args) throws Exception {
        int a1 = 1000000000;
        // <datatype, identifier, assignmentOperator, value>
        // Unlike Python, Java is statically typed and not dynamically thus we need to specify the datatype of variable while defining it
        System.out.println(a1);

        byte a2 = 100;
        System.out.println(a2);

        short a3 = 10000;
        System.out.println(a3);

        long a4 = 1000000000000000000l;
        // That 'l' must be added at the end of long type literal, as by defalut java assumes it to be integer
        System.out.println(a4);

        char b = 'b';
        // Char is defined within single quotes
        System.out.println(b);

        float num1 = 24.9f;
        // That 'f' must be added at the end of decimal number to make it floating point literal, as by defalut java assumes it to be double type literal
        System.out.println(num1);

        double num2 = 36.9;
        System.out.println(num2);

        String name = "Priyanshu";
        // Strings are defined within double quotes
        System.out.println(name);

        boolean val1 = true;
        boolean val2 = false;
        System.out.println(val1);
        System.out.println(val2);
    }
}
