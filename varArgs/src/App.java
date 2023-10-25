public class App {
    static int add(int ...arr){
        // This will accept as many arguments and would store them in an array
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
        // In this function, no argument is mandatory
    }

    // To make few mandatory arguments
    static void mul(int x, int ...arr){
        int prod = x;
        for (int element : arr) {
            prod *= element;
        }
        System.out.println(prod);
    }

    public static void main(String[] args) throws Exception {
        // Let's consider a scenario, where we defined a function which add two numbers, sounds good, looks great, works absolutely fine. But, if one enters more than 2 arguments, it wil throw an error and won't simply add all three numbers
        // To counter such problems, we use the concept of varArgs

        int val1 = add(2,3,5,7,11);
        System.out.println(val1);

        int val2 = add();
        System.out.println(val2);

        // Giving only 1 argument (mandatory)
        mul(10);

        // Giving no argument
        // mul();  // This will throw an error, as mandatory argument is missing

        // Giving multiple arguments
        mul(5,1,2,3,4,5);
    }
}
