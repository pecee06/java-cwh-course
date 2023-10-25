// Each thread has a priority. Priorities are represented by a number between 1 and 10. In most cases, the thread scheduler schedules the threads according to their priority (known as preemptive scheduling). But it is not guaranteed because it depends on JVM specification that which scheduling it chooses.

// public final int getPriority(): The java.lang.Thread.getPriority() method returns the priority of the given thread.

// public final void setPriority(int newPriority): The java.lang.Thread.setPriority() method updates or assign the priority of the thread to newPriority. The method throws IllegalArgumentException if the value newPriority goes out of the range, which is 1 (minimum) to 10 (maximum).

// 3 constants defined in Thread class:
// 1. public static int MIN_PRIORITY(1)
// 2. public static int NORM_PRIORITY(5)(default)
// 3. public static int MAX_PRIORITY(10)

class Cooking implements Runnable{
    @Override
    public void run() {
        System.out.println("I am cooking dinner");
    }
}
class Washing implements Runnable{
    @Override
    public void run() {
        System.out.println("I am washing clothes");
    }
}
class Mopping implements Runnable{
    @Override
    public void run() {
        System.out.println("I am mopping floor");
    }
}
class Coding implements Runnable{
    @Override
    public void run() {
        System.out.println("I am coding in Java");
    }
}
class Chatting implements Runnable{
    @Override
    public void run() {
        System.out.println("I am chatting with friend");
    }
}

public class App2 {
    public static void main(String[] args) {
        Cooking cook = new Cooking();
        Washing wash = new Washing();
        Mopping mop = new Mopping();
        Coding code = new Coding();
        Chatting chat = new Chatting();
        
        Thread cookThread = new Thread(cook);
        Thread washThread = new Thread(wash);
        Thread mopThread = new Thread(mop);
        Thread codeThread = new Thread(code);
        Thread chatThread = new Thread(chat);
        
        // Setting priorities
        cookThread.setPriority(Thread.MAX_PRIORITY);
        codeThread.setPriority(9);
        washThread.setPriority(7);
        mopThread.setPriority(Thread.NORM_PRIORITY);    // No need to set priority to norm, as it's the default priority
        chatThread.setPriority(Thread.MIN_PRIORITY);

        System.out.println(codeThread.getPriority());   // This returns the priority of a thread

        chatThread.start();
        washThread.start();
        codeThread.start();
        mopThread.start();
        cookThread.start();

        // More methods
        /*
        1. interrupt() : Interrupts this thread
        2. interrupted() : Tests whether the current thread has been interrupted
        3. isInterrupted() : Tests whether this thread has been interrupted
        4. isAlive() : Tests if this thread is alive.
        5. 	join() : Waits for this thread to die
        6. sleep(long millis) : Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds, subject to the precision and accuracy of system timers and schedulers
        7. getState() : Returns the state of the thread
        8. currentThread() : Returns a reference to the currently executing thread object
        */
    }
}
