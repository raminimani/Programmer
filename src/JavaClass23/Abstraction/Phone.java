package JavaClass23.Abstraction;

public abstract class Phone {

    void makePhoneCalls(){
        System.out.println("Making a Call");
    }

    void sendText(){
        System.out.println("Sending a text");
    }

    abstract void displayPicture();
    abstract void unlockPhone();
}

class Iphone extends Phone{

    @Override
    void displayPicture() {
        System.out.println("Iphone uses Photos to display the Pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("Use faceID to unlock the Phone");
    }
}
class Samsung extends Phone{
    @Override
    void unlockPhone() {
        System.out.println("Use Fingerprint sensor to unlock the phone");
    }

    @Override
    void displayPicture() {
        System.out.println("Use gallery to view the photos");
    }
}