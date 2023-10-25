class Welcome extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(2000); // It delays the execution of this thread by 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true){
            System.out.println("Welcome");
        }
    }
}
class GM extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Good Morning");
        }
    }
}

class Bike extends Thread{
    @Override
    public void run() {
        System.out.println("I am riding my bike");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        /*GM obj1 = new GM();
        System.out.println(obj1.getPriority());
        obj1.start();

        Welcome obj2 = new Welcome();
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj2.start();*/

        Bike b = new Bike();
        System.out.println(b.getState());
        b.start();
        System.out.println(b.getState());
    }
}
