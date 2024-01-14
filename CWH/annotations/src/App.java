// Java Annotation is a tag that represents the metadata i.e. attached with class, interface, methods or fields to indicate some additional information which can be used by java compiler and JVM.

/*
Built-In Java Annotations used in Java code:
1. @Override    : @Override annotation assures that the subclass method is overriding the parent class method. If it is not so, compile time error occurs.

2. @SuppressWarnings    : @SuppressWarnings annotation is used to suppress warnings issued by the compiler.

3. @Deprecated  : @Deprecated annoation marks that this method is deprecated so compiler prints warning. It informs user that it may be removed in the future versions. So, it is better not to use such methods.

4. @FunctionalInterface : @FunctionalInterface annotation is used to ensure that the functional interface can’t have more than one abstract method. In case more than one abstract methods are present, the compiler flags an ‘Unexpected @FunctionalInterface annotation’ message.
*/

@FunctionalInterface
interface Cook{
    void cookFood(String dish);
    // void serveFood();    // This method can't be declared now, as this is a functional interface
}

class Parent{
    void greet(){
        System.out.println("Good morning");
    }
}

class Child extends Parent implements Cook{
    @Override
    void greet(){
        System.out.println("Good evening");
    }

    @Deprecated
    void myMethod(){
        System.out.println("This is my method");
    }

    @Override
    public void cookFood(String dish){
        System.out.println("Cooking "+dish);
    }
}

public class App {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws Exception {
        Child c = new Child();
        c.myMethod();
        c.cookFood("Paneer Masala");

        Parent p = new Parent();
        // This Parent class object ain't used, but the compiler doesn't show any warnings
    }
}
