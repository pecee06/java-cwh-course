class Student{
    // Defining atributes
    String name;
    char sex;
    int grade;
    int roll;

    // Defining methods
    void printDetails(){
        System.out.print(name+" ");
        System.out.print(sex+" ");
        System.out.print(grade+" ");
        System.out.printf("Roll number : %d\n",roll);
        System.out.println("---------------------------");
    }

    void isGirl(){
        if (sex=='F'){
            System.out.printf("%s is a girl\n",name);
        }
        else{
            System.out.printf("%s is not a girl\n",name);
        }
    }

    void isSenior(){
        if (grade==12){
            System.out.printf("%s is senior student\n",name);
        }
        else{
            System.out.printf("%s is junior student\n",name);
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student();
        s1.name = "Priyanshu";
        s1.sex = 'M';
        s1.grade = 12;
        s1.roll = 12201;

        Student s2 = new Student();
        s2.name = "Nayan";
        s2.sex = 'M';
        s2.grade = 11;
        s2.roll = 11115;

        Student s3 = new Student();
        s3.name = "Shrishti";
        s3.sex = 'F';
        s3.grade = 12;
        s3.roll = 12304;

        // s1.printDetails();
        // s2.printDetails();
        // s3.printDetails();

        // s3.isGirl();
        // s1.isGirl();
        
        s2.isSenior();
        s1.isSenior();
    }
}
