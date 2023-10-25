// An interface in Java is a blueprint of a class. It has static constants and abstract methods.

// The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

// In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.

// It cannot be instantiated just like the abstract class.

// Interfaces are declared using the 'interface' keyword
interface Cycle{    // This can only have absract methods, in that way it is different form abstract class

    String intro = "This is a cycle manufacturing company";
    // You cannot add seters for variables of interfaces, as they can't be changed. They are 'final'

    void purchaseMaterial(String mat1,String mat2,String mat3);
    void assembleBody();
    void paintIt(String clr);
    // The Java compiler adds public and abstract keywords before the interface method.
}

class HeroCycle implements Cycle{   // Since Cycle is not a regular class, but an interface, so it's implemented using 'implement' keyword rather than being extended

    // Implemented methods must be public
    public void purchaseMaterial(String mat1,String mat2,String mat3){
        String arr[] = {mat1,mat2,mat3};
        for (String material : arr) {
            System.out.println(material);
        }
    }

    public void assembleBody(){
        System.out.println("Body is assembled");
    }
    public void paintIt(String clr){
        System.out.println("It's being painted "+clr);
    }
}

// Implementing multiple interfaces
interface Land{
    void setLandArea(float area);
    void setLocation(String location);
}

interface House{
    void setNoOfFloors(int floor);
    void setFlooringMaterial(String material);
}

class MyHome implements Land,House{
    float area;
    String location;
    int floor;
    String material;

    public void setLandArea(float area){
        this.area = area;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setNoOfFloors(int floor){
        this.floor = floor;
    }
    public void setFlooringMaterial(String material){
        this.material = material;
    }

    void aboutHome(){
        System.out.printf("The land is located in %s and is %f acres big\n",location,area);
        System.out.printf("There are %d floors in the house and have %s floor\n",floor,material);
    }
}

// Default methods
// Java provides a facility to create default methods inside the interface. Methods which are defined inside the interface and tagged with default are known as default methods. These methods are non-abstract methods.
// Default methods were added to bring addtional functionality to interfaces, by letting us define a function there only, which aren't abstract and need not be overridden. However, they can be overridden

class Phone{
    void switchOn(){
        System.out.println("Device is booting");
    }

    void switchOff(){
        System.out.println("Device is shutting down");
    }
}

interface Camera{
    void clickPic();

    default void getCamSensor(){   // That's a default function
        System.out.println("Sony");
    }
}
interface GPS{
    void findLocation(String place);

    /*private void pvtFunc(){
        System.out.println("This is a private function");
    }*/
    // Private functions aren't accessible from objects of classes implementing this interface
    // They can only be accessed within the interface
}
interface MP3Player{
    void playMusic(String song);

    default void getPlayerWarranty(){
        System.out.println("3 years");
    }
}

class SmartPhone extends Phone implements Camera,GPS,MP3Player{
    public void clickPic(){
        System.out.println("Picture clicked");
    }
    public void findLocation(String place){
        System.out.println("Locating "+place);
    }
    public void playMusic(String song){
        System.out.println("Playing "+song);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        /*HeroCycle cyl = new HceroCycle();
        cyl.purchaseMaterial("Aluminium","Steel","Rubber");
        cyl.assembleBody();
        cyl.paintIt("blue");*/

        /*MyHome home = new MyHome();
        home.setLocation("Manendragarh");
        home.setLandArea(2.3f);
        home.setNoOfFloors(2);
        home.setFlooringMaterial("wood");
        home.aboutHome();*/

        SmartPhone phn = new SmartPhone();
        phn.switchOn();
        phn.clickPic();
        phn.findLocation("Bijuri");
        phn.playMusic("Kesariya");
        phn.getCamSensor();
        phn.getPlayerWarranty();

        // phn.pvtFunc();   // This will throw error
    }
}

// Understanding multiple inheritance
// Java doens't directly allow the inheritance of multiple classes, however it does support the implementation of mulitple interfaces

// Why this is so?
// Take the example of SmartPhone class which inherits Phone class and implements GPS, Camera and mp3 player
// We can say that a smartphone is a phone, i.e., a phone is upgraded to smartphone. However we can't say this for implemented classes
// A camera is not upgraded to smartphone, neither mp3 players are discontinued and smartphones are manufactured upon it
// A smartphone is a phone which can perform functions of a camera, GPS and mp3 player. But it's not a camera, GPS or mp3 player