// A method is a block of code or collection of statements or a set of code grouped together to perform a certain task or operation. It is used to achieve the reusability of code. We write a method once and use it many times. We do not require to write code again and again. It also provides the easy modification and readability of code, just by adding or removing a chunk of code. The method is executed only when we call or invoke it.

// A method that has static keyword is known as static method. In other words, a method that belongs to a class rather than an instance of a class is known as a static method.
// The main advantage of a static method is that we can call it without creating an object. It can access static data members and also change the value of it.

public class App {
    // Defining a static method
    static float add(float x, float y){
        float val = x+y;
        return val;
    }
    static void modifier(int arr[]){
        arr[0] = 1;
    }

    // The following two methods have the same name, but different parameters, and so is legal
    static int calc(int x, int y){
        int val = x*y;
        return val;
    }
    static double calc(double x, double y){
        double val = x/y;
        return val;
    }
    // Method overloading cannot be performed by just changing the return type of a method

    // Defining a non-static method
    void greet(String name){
        String msg = "Good evening "+name;
        System.out.println(msg);
    }

    public static void main(String[] args) throws Exception {
        // Using a static method
        // ---------------------
        // float sum = add(30.9f,8.4f);
        // System.out.println(sum);

        // int array[] = {7,3,3,7,6,1,1,1,6,9};
        // modifier(array);
        // for (int i : array) {
        //     System.out.println(i);
        // }

        // Using a non-static method
        // -------------------------
        // App obj = new App();    // Creating an object of class App
        // obj.greet("Priyanshu");

        // Method overloading
        // If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

        int a = calc(5, 6);
        double b = calc(1.414, 2);

        System.out.println(a);
        System.out.println(b);
    }
}

// The arguments passed, while calling a method are copied to the corresponding parameters of the function. Thus even if the parameters are altered in the function, it won't change the value of arguments passed, while calling it
// Interesting catch : If an array is passed in a method as an argument and any of its elements' value is changed in the function, then the changes will reflect in the argument as well. This is because, the identifier of an array is a reference to its address in the memory, and so is its copy, and when it's passed as an argument, the parameter also points to the same address, thus not accessing the copy, rather the array itself