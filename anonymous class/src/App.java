// Java anonymous inner class is an inner class without a name and for which only a single object is created. An anonymous inner class can be useful when making an instance of an object with certain "extras" such as overloading methods of a class or interface, without having to actually subclass a class.

abstract class AnonymousClass{
    abstract void sayHello();
}

interface AnonymousInterface{
    int add(int a, int b);
    int sub(int a, int b);
    int mul(int a, int b);
    double div(double a, double b);
}

public class App {
    public static void main(String[] args) throws Exception {
        AnonymousClass obj = new AnonymousClass(){
            @Override
            void sayHello(){
                System.out.println("Hello World");
            }
        };

        obj.sayHello();

        AnonymousInterface obj2 = new AnonymousInterface(){
            public int add(int a, int b){
                return a+b;
            }
            public int sub(int a, int b){
                return a-b;
            }
            public int mul (int a, int b){
                return a*b;
            }
            public double div(double a, double b){
                return a/b;
            }
        };

        System.out.println(obj2.mul(6,23));
        
    }
}

// Normally, we inherit abstract classes and implement interfaces to other concrete classes for making objects
// But, using this concept, we can directly make objects of an abstract class or interface