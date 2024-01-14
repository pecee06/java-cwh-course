// The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class. We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.

// There are four types of Java access modifiers:

// 1. Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.

// 2. Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.

// 3. Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.

// 4. Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.

class Emp{
    private String name;    // Setting access to 'private' restricts its direct accessibility to this class only
    private int salary;
    // However they can be accessed using methods like setters & getters

    // Defining setters
    void setName(String N){
        name = N;
    }
    void setSalary(int S){
        salary = S;
    }

    // Defining getters
    String getName(){
        return name;
    }
    int getSalary(){
        return salary;
    }

}

class Arithmetic{
    private int a;
    private int b;
    int result;

    void set(int x, int y){
        a=x;
        b=y;
        result = a+b;
    }

    void inpAnswer(int n){
        if (n==result){
            System.out.println("You've passed the test");
        }
        else{
            System.out.println("You've failed");
            System.out.println("Correct answer "+result);
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Emp e1 = new Emp();
        e1.setName("Priyanshu");
        e1.setSalary(50000);

        // String e1_name = e1.getName();
        // System.out.println(e1_name);
        // int e1_sal = e1.getSalary();
        // System.out.println(e1_sal);

        Arithmetic test = new Arithmetic();
        test.set(7, 8);
        
        // test.inpAnswer(15);
        test.inpAnswer(16);
    }
}
