// Question 1
abstract class Pen{
    abstract void write();
    abstract void refill();
}

// Question 2
class FountainPen extends Pen{
    @Override
    void write(){
        System.out.println("I am writing");
    }

    @Override
    void refill(){
        System.out.println("Ink refilled");
    }

    void changeNib(){
        System.out.println("Nib changed");
    }
}

// Question 3
class Monkey{
    void jump(){
        return;
    }
    void bite(){
        return;
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        return;
    }
    public void sleep(){
        return;
    }
    void speak(){
        System.out.println("I'm human, I can speak :)");
    }
}

// Question 4
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone{
    @Override
    void ring(){
        System.out.println("Telephone's ringing");
    }

    @Override
    void lift(){
        System.out.println("Receiver picked up");
    }

    @Override
    void disconnect(){
        System.out.println("Call disconnected");
    }
}

// Question 6
interface TVremote{
    void on();
    void off();
}

interface SmartTVremote extends TVremote{
    void netflix();
    void hotstar();
}

// Question 7
class TV implements TVremote{
    public void on(){
        System.out.println("TV turned on");
    }
    public void off(){
        System.out.println("TV turned off");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        /*Telephone tel = new SmartTelephone();
        tel.ring();
        tel.lift();
        tel.disconnect();*/

        // Question 5
        Monkey monk = new Human();
        monk.bite();
        monk.jump();
    }
}
