// Lambda expression provides a clear and concise way to represent one method interface (functional interface) using an expression.

// The Lambda expression is used to provide the implementation of an interface which has functional interface. It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing the implementation. Here, we just write the implementation code.

@FunctionalInterface
interface MyFunctionalInterface{
    void greet(String name);
}

@FunctionalInterface
interface MyFunctionalInterface2{
    int encode(int n) throws ArithmeticException;
}

public class App {
    public static void main(String[] args) throws Exception {
        MyFunctionalInterface obj = (name)->{
            // Since datatype of the parameter this method is already set in the functional interface, thus we need not remention it
            System.out.println("Hello "+name);
        };

        obj.greet("Priyanshu");

        MyFunctionalInterface2 obj2 = (n)->{
            int dividend = (6*n)-18;
            return (dividend/n)+13;
        };

        System.out.println(obj2.encode(46));
        System.out.println(obj2.encode(-13));
        System.out.println(obj2.encode(6));

        try {
            System.out.println(obj2.encode(0));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
