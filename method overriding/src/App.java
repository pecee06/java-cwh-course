// If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
// In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.

class Parent{
    String first_name;
    Parent(String first_name){
        this.first_name = first_name;
    }
    void greet(){
        System.out.println("Hello "+first_name);
    }
    void sayHi(){
        System.out.println("Hi");
    }
}

class Child extends Parent{
    String last_name;
    Child(String first_name, String last_name){
        super(first_name);
        this.last_name = last_name;
    }
    
    @Override   // This indicates that the method has been overridden
    void greet(){
        System.out.println("Hello "+first_name+" "+last_name);
    }
}

class GrandChild extends Child{
    GrandChild(String first_name, String last_name){
        super(first_name,last_name);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        /*Parent p = new Parent("Tiger");
        p.greet();

        Child c = new Child("Piyush","Dwivedi");

        // c.sayHi();
        c.greet();*/

        // The two greet() methods bahave differently, cause it is redefined (or overridden) in 'Child' class

        GrandChild gc = new GrandChild("Harshit","Pandey");
        gc.greet();
        // If a class is inherited from a class (say, father) which itself is inherited form some other class (say, grandfather), and 'father' class has overridden a method, then the new class will also be inherited with that overridden method and not the original one
    }
}
