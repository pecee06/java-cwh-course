// A class is declared abstract using the 'abstract' keyword. It can have zero or more abstract and non-abstract methods. We need to extend the abstract class and implement its methods. It cannot be instantiated.

// A method declared using the abstract keyword within an abstract class and does not have a definition (implementation) is called an abstract method.

// An abstract class may or may not contain abstract methods.

// When we need just the method declaration in a super class, it can be achieved by declaring the methods as abstracts.
// Abstract method is also called subclass responsibility as it doesn't have the implementation in the super class. Therefore a subclass must override it to provide the method definition.

abstract class Parent{
    String name;
    Parent(String name){
        this.name = name;
    }
    abstract void greet();  // This method is just declared and not defined

    void nonAbstractMethod(){
        System.out.println("Salutations from Parent class");
    }
}

class Child extends Parent{
    Child(String name){
        super(name);
    }

    @Override   // overriding an abstract method
    void greet(){
        System.out.println("Hello "+this.name);
    }
}

// class Child2 extends Parent{}   // This class doesn't override the abstract method of Parent class and thus, either it has to be declared abstract or it simply can't be a subclass to the Parent class

abstract class Child3 extends Parent{   // This would work fine
    Child3(String name){
        super(name);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Parent foo = new Parent();   // This will throw error as abstract classes can't be instantiated

        // Parent foo = new Child("Java");  // However this is allowed
        // So we can say, a reference of an abstract class can be made, but not object
        // foo.greet();
        

        Child obj = new Child("Lenovo");
        obj.greet();
        obj.nonAbstractMethod();
    }
}

// Key points

// 1. An abstract method do not have a body (implementation), they just have a method signature (declaration). The class which extends the abstract class implements the abstract methods.

// 2. If a non-abstract (concrete) class extends an abstract class, then the class must implement all the abstract methods of that abstract class. If not the concrete class has to be declared as abstract as well.

// 3. As the abstract methods just have the signature, it needs to have semicolon (;) at the end.

// 4. A concrete class can't have abstract methods. For a class to contain abstract methods, it must be abstract itself

// Understanding its usage
// Let's say we have a parent phone manufacturing company and it lets other companies to inherit its Phone class.
// Now it has set some regulations such as, the phone must have methods to switch it on, turn it off and other such basic methods without which the phone won't work
// To apply such regulations, it had made the Phone class an abstract one and defined abstract methods within, so that every company that inherits the parent class must override those methods