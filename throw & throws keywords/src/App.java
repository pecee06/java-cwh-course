// The Java throws keyword is used to declare an exception. It gives an information to the programmer that there may occur an exception. So, it is better for the programmer to provide the exception handling code so that the normal flow of the program can be maintained.

// The Java throw keyword is used to throw an exception explicitly.

class NegativeRadiusException extends Exception{
    @Override
    public String getMessage() {
        return "Radius can't be negative\nPlease enter a valid radius";
    }
}

class Circle{
    double radius;
    Circle(double r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        else{
            this.radius = r;
        }
    }
    double area() {
        return Math.PI*radius*radius;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Circle circle1 = new Circle(3.4);
        // System.out.println(circle1.area());

        try {
            Circle circle2 = new Circle(-3);
            System.out.println(circle2.area());
        } catch (Exception e) {
            System.out.println(e);
        }
        

        System.out.println("Thank you");
    }
}
