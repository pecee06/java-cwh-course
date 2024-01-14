// Concurrency
// Concurrency is the task of running and managing the multiple computations at the same time.
// Eg: Let's suppose it's a sunday, and you're at home. You are cooking your lunch, watching the recipe in YouTube, chatting with your friend. So, basically you're managing all the tasks simultaneously. But are you doing them simultaneously?
// No, you aren't. If you are chatting, then you are typing your message and not stiring your food, right? This is concurrency

// Parallelism
// Parallelism is the task of running multiple computations simultaneously.
// Eg: Let's take the same sunday, but this time you have your friends along with you. Now, you are cooking the food, one of your friend is washing the clothes, someone else is mopping the roops.
// This time different tasks are indeed being performed simultaneously. This is parallelism

// Threads allows a program to operate more efficiently by doing multiple things at the same time.
// Threads can be used to perform complicated tasks in the background without interrupting the main program.
// Threads let you achieve concurrency

// Creating a thread by extending Thread class
class MyClass1 extends Thread{
    @Override
    public void run() {
        for (int i=0; i<20; i++){
            System.out.println("I am cooking");
        }
    }
}

class MyClass2 extends Thread{
    @Override
    public void run() {
        for (int i=0; i<20; i++){
            System.out.println("I am chatting");
        }
    }
}

// Creating a thread by implementing Runnable interface
class MyClass3 implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<20; i++){
            System.out.println("I am washing dishes");
        }
    }
}

class MyClass4 implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<20; i++){
            System.out.println("I am eating lunch");
        }
    }
}

class MyClass5 extends Thread{
    // This constructor gives name to this thread
    public MyClass5(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Hello World");
    }
}

class MyClass6 implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello Java");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // MyClass1 obj1 = new MyClass1();
        // MyClass2 obj2 = new MyClass2();
        
        // Starting the threads
        // obj1.start();
        // obj2.start();
        // Both the functions will execute concurrently

        // While using the runnable interface, you cannot directly execute the start() method from class's object
        // You need to create a thread object, which takes the thread class as argument

        // MyClass3 obj3 = new MyClass3();
        // Thread obj3Thread = new Thread(obj3);
        
        // MyClass4 obj4 = new MyClass4();
        // Thread obj4Thread = new Thread(obj4);

        // obj3Thread.start();
        // obj4Thread.start();

        MyClass5 obj5 = new MyClass5("MyThread");
        // obj5.start();

        MyClass6 obj6 = new MyClass6();
        Thread obj6Thread = new Thread(obj6,"MyThread2");   // Naming the thread
        // obj6Thread.start();

        String name1 = obj5.getName();  // GIves names of the thread
        long id1 = obj5.getId();    // Gives ID of the thread

        System.out.println(name1);
        System.out.println(id1);

        String name2 = obj6Thread.getName();
        long id2 = obj6Thread.getId();

        System.out.println(name2);
        System.out.println(id2);
    }
}

// The major difference between extending and implementing to create a thread is that when a class extends the Thread class, you cannot extend any other class, but by implementing the Runnable interface, it is possible to extend from another class as well.

// States of threads
/*
NEW
A thread that has not yet started is in this state.

RUNNABLE
A thread executing in the Java virtual machine is in this state.

BLOCKED
A thread that is blocked waiting for a monitor lock is in this state.

WAITING
A thread that is waiting indefinitely for another thread to perform a particular action is in this state.

TIMED_WAITING
A thread that is waiting for another thread to perform an action for up to a specified waiting time is in this state.

TERMINATED
A thread that has exited is in this state.
*/