// Question 1
class Employee{
    String name;
    float salary;

    void getName(){
        System.out.println(name);
    }
    float getSalary(){
        return salary;
    }
    void setName(String new_name){
        name = new_name;
    }
}

// Question 2
class CellPhone{
    String model;

    void setModel(String new_model){
        model = new_model;
    }

    void ring(){
        System.out.println(model+" is ringing, pick it up!");
    }
}

// Question 3
class Square{
    int side;

    void setSide(int s){
        side = s;
    }
    int calcArea(){
        int area = side*side;
        return area;
    }
    int calcPerimeter(){
        int perimeter = 4*side;
        return perimeter;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee();
        e1.name = "Jatin";
        e1.salary = 35000f;

        Employee e2 = new Employee();
        e2.name = "Deepika";
        e2.salary = 40000f;

        // e1.getName();

        // float e2_salary = e2.getSalary();
        // System.out.println(e2_salary);

        // e1.setName("Punit");
        // e1.getName();

        // CellPhone p1 = new CellPhone();
        // p1.setModel("Poco M2");
        // p1.ring();

        Square s1 = new Square();
        s1.setSide(12);

        int s1_a = s1.calcArea();
        System.out.println(s1_a);

        int s1_p = s1.calcPerimeter();
        System.out.println(s1_p);
    }
}
