class Parent{
    String first_name;

    void setFirstName(String name){
        first_name = name;
    }

    String getFirstName(){
        return first_name;
    }
}

class Child extends Parent{
    // 'extends' keyword enables a class to inherit the variables and methods of some other class
    // This implies, 'Parent' class' methods will be available to 'Child' class' objects, however their accessibility will depend upon their respective access modifiers
    String last_name;

    void setLastName(String name){
        last_name = name;
    }

    String getLastName(){
        return last_name;
    }
}

// You cannot have multiple super-classes in Java
// A class can only inherit 1 other class

class Base{
    Base(){
        System.out.println("This is the Base class");
    }
}

class Derived1 extends Base{}

class Derived2 extends Base{
    Derived2(){
        System.out.println("This is a derived class");
    }
}

// Constructor overloading in inheritance
class Person1{
    Person1(){
        System.out.println("I am Person1");
    }
    Person1(String time){
        System.out.println("Good "+time);
        System.out.println("Salutations from Person1");
    }
}
class Person1Daughter1 extends Person1{
    Person1Daughter1(String time, String name){
        super(time);    // The super keyword in Java is a reference variable which is used to refer immediate parent class object.
        // In the absence of super keyword, (as constructor overloading has been done) that constructor (of parent class) will get executed which don't require parameters
        System.out.println("Good "+time+" "+name);
        System.out.println("Salutations from Person1Daughter1");
    }
}

class Person1Daughter2 extends Person1{
    Person1Daughter2(String time, String name){
        // No super keyword
        System.out.println("Good "+time+" "+name);
        System.out.println("Salutations from Person1Daughter1");
    }
}
class Person1Grandson extends Person1Daughter1{
    Person1Grandson(String time, String name, int n){
        super(time,name);
        System.out.println("Good "+time+" "+name);
        System.out.println(n+" Waves to you");
        System.out.println("Salutations from Person1Grandson");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Child obj = new Child();

        // obj.setFirstName("Priyanshu");  // Accessing method of 'Parent' class from 'Child' class' object
        // obj.setLastName("Choudhury");
        // System.out.println("Name of student : "+obj.getFirstName()+" "+obj.getLastName());

        // Base b = new Base();    // Creating a 'Base' class' object, runs its constructor

        // Derived1 d1 = new Derived1(); // Creating a 'Derived1' class' object, also runs the constructor of 'Base' class as 'Derived1' class has no constructor

        // Derived2 d2 = new Derived2();    // 'Derived2' class has it own constructor, but then also, the 'Base' class' constructor was executed, after which 'Derived2' class' constructor ran

        // If a derived class is behaving as a parent to some other class, then the hierarchy of execution of constructors is:
            // Parent --> Child --> Grand child

        // Person1Daughter1 pd = new Person1Daughter1("Evening","Priyanshu");

        // Person1Daughter2 pd = new Person1Daughter2("Evening","Priyanshu");

        // Person1Grandson pg = new Person1Grandson("Afternoon","Salman",5);
    }
}
