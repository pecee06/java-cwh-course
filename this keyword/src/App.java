// In Java, 'this' is a reference variable that refers to the current object.

// Usage:

// 1. this: to refer current class instance variable
// The 'this' keyword can be used to refer current class instance variable. If there is ambiguity between the instance variables and parameters, 'this' keyword resolves the problem of ambiguity.

class Emp{
    String name;
    int salary;
    float experience;   // In years

    Emp(String name,int salary,float experience){
        // name = name;    // Ambiguity arises, and thus this assignment to variable name has no effect

        // To remove ambiguity
        this.name = name;   // this.name refers to the instance variable and not the parameter
        this.salary = salary;
        this.experience = experience;
    }
    // If local variables(parameters) and instance variables are different, there is no need to use 'this' keyword. However, it is a better approach to use meaningful names for variables. So we use same name for instance variables and parameters in real time, and always use 'this' keyword.
}

// 2. this: to invoke current class method
// You may invoke the method of the current class by using the this keyword. If you don't use the this keyword, compiler automatically adds this keyword while invoking the method.

class Sample{
    String name;
    void setName(){
        name = "Aman";
    }
    void greet(){
        this.setName(); // In case, 'this' keyword was absent, compiler would automatically add it
        System.out.println("Good morning "+name);
    }
    
}

// 3. this() : to invoke current class constructor
// The this() constructor call can be used to invoke the current class constructor. It is used to reuse the constructor. In other words, it is used for constructor chaining.

class Student{
    Student(){
        System.out.println("You've passed your exams");
    }
    Student(String name){
        this(); // It will call the constructor without parameters
        // Important point: Constructor call must be the first statement in a constructor
        
        System.out.println("Keep it up "+name);
    }
    Student(String name, char grade){
        this(name); // It will call the constructor with String as a parameter
        System.out.println("You got "+grade);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Sample obj = new Sample();
        // obj.greet();

        // Student stu1 = new Student();
        // Student stu2 = new Student("Udit");
        // Student stu3 = new Student("Gaurav",'A');
    }
}
