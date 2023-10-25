// Polymorphism means 'many forms', and it occurs when we have many classes that are related to each other by inheritance.

interface Gallery{
    void showPics();
    void showVideos();
}

interface Contact{
    void showContacts();
    void callNumber(long number);
}

class Phone implements Gallery,Contact{
    public void showPics(){
        return;
    }
    public void showVideos(){
        return;
    }
    public void showContacts(){
        return;
    }
    public void callNumber(long number){
        System.out.println("Calling "+number);
    }
    void lightTorch(){
        System.out.println("Torch on...");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Gallery phnGlry = new Phone();  // This is a phone whose gallery(only) is accessible
        phnGlry.showPics(); // This is allowed

        // phnCon.showContacts();    // This ain't allowed, as Phone's Contact ain't accessible

        Contact phnCon = new Phone();   // This is a phone whose contact(only) is accessible
        phnCon.callNumber(7337611169l); // This is allowed

        // phnCon.showVideos(); // This ain't allowed, as Phone's Gallery ain't accessible

        // phnCon.lightTorch();    // This ain't allowed either, as Phone specific methods aren't accessible through interface reference

        Phone phn = new Phone();    // This is a phone and yeah every method that the Phone class has, or has been implemented to it or has inherited from a superclass is accessible
        phn.showVideos();
        phn.showContacts();
        phn.lightTorch();
    }
}

// Let's understand this using an example
// Say, my friend asked for my smartphone for clicking pictures. How would it be, if he/she starts checking my E-mails or WhatsApp messages?
// It won't be good
// So, I would simply restrict his/her accessibility just to camera app alone by applying app-lock to other apps
// That's exactly what we did
// Using dynamic method dispatch, we've created an object of Phone, but it is referenced using that interface which is needed/required at the very moment