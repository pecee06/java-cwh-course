// In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory.

// It is a special type of method which is used to initialize the object. Every time an object is created using the new() keyword, at least one constructor is called.

// It is called constructor because it constructs the values at the time of object creation. It is not necessary to write a constructor for a class. It is because java compiler creates a default constructor if your class doesn't have any.

// Rules for creating Java constructor:
// 1. Constructor name must be the same as its class name
// 2. A Constructor must have no explicit return type
// 3. A Java constructor cannot be abstract, static, final, and synchronized

class Student{
    private String school;
    private int grade;
    private String name;
    private char sex;
    private int age;

    // Defining constructor
    Student(int Grade, String Name, char Sex, int Age){
        school = "RKVV";    // Setting a default value
        grade = Grade;
        name = Name;
        sex = Sex;
        age = Age;
    }

    // Method overloading in constructor
    Student(String School ,int Grade, String Name, char Sex, int Age){
        school = School;
        grade = Grade;
        name = Name;
        sex = Sex;
        age = Age;
    }

    void getDetails(){
        System.out.printf("%s's details\n",name);
        System.out.println("------------------");
        System.out.println(school);
        System.out.println(grade);
        System.out.println(sex);
        System.out.println(age);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Student stu1 = new Student(9, "Prashant", 'M', 15);
        stu1.getDetails();

        Student stu2 = new Student("KV",12, "Sugandha", 'F', 18);
        stu2.getDetails();
    }
}
