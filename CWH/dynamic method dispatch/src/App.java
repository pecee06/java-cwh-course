// Dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at run time, rather than compile time.

// When an overridden method is called through a superclass reference, Java determines which version(superclass/subclasses) of that method is to be executed based upon the type of the object being referred to at the time the call occurs. Thus, this determination is made at run time.

// At run-time, it depends on the type of the object being referred to (not the type of the reference variable) that determines which version of an overridden method will be executed.

// A superclass reference variable can refer to a subclass object. This is also known as upcasting. Java uses this fact to resolve calls to overridden methods at run time.

class Phone{
    String model;
    void setModel(String model){
        this.model = model;
    }
    String getModel(){
        return model;
    }
    void makeCall(){
        System.out.println("Calling...");
    }
    void sendMsg(){
        System.out.println("Sending message...");
    }
}

class SmartPhone extends Phone{
    @Override
    void makeCall(){
        System.out.println("Calling through smartphone...");
    }
    @Override
    void sendMsg(){
        System.out.println("Sending message through smartphone...");
    }
    void playMusic(){
        System.out.println("Playing music...");
    }
    void capturePhoto(){
        System.out.println("Capturing photograph...");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Phone phn1 = new Phone();
        // phn1.setModel("Nokia 3310");
        // System.out.println(phn1.getModel());
        // phn1.sendMsg();

        // SmartPhone smrtp1 = new SmartPhone();
        // smrtp1.setModel("Apple IPhone X");
        // smrtp1.makeCall();  // Overridden method will execute
        // smrtp1.playMusic();

        // Upcasting
        // Every smartphone is a phone
        Phone phn2 = new SmartPhone();  // This is a SmartPhone object whose reference variable is Phone
        // So this is absolutely valid
        // However, the reverse is not true, i.e., every phone is not a smartphone
        // SmartPhone smrtp2 = new Phone(); // Thus this ain't valid
        

        phn2.sendMsg(); // Since phn2 is a SmartPhone object, thus overridden method will execute

        // But there's a catch
        // Methods specific to SmartPhone() can't be accessed with this object, as its reference variable is Phone
        // phn2.capturePhoto(); // This will throw an error
        // This implies, with upcasting, superclass methods and overridden methods can be accessed, but not subclass methods 
    }
}
