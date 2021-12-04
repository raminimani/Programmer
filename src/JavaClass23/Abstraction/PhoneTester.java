package JavaClass23.Abstraction;

import JavaClass23.Abstraction.Iphone;
import JavaClass23.Abstraction.Phone;
import JavaClass23.Abstraction.Samsung;

public class PhoneTester {
    public static void main(String[] args) {

        //Phone phone=new Phone(); Can't create the obj of abstract class.

        Iphone iphone=new Iphone();
        iphone.displayPicture();
        iphone.unlockPhone();
        iphone.makePhoneCalls();
        iphone.sendText();

        Samsung samsung=new Samsung();
        samsung.displayPicture();
        samsung.unlockPhone();
        samsung.makePhoneCalls();
        samsung.sendText();

        Phone[] phones={new Iphone(),new Samsung()};

        for (Phone ph:phones){
            ph.displayPicture();
            ph.makePhoneCalls();
            ph.unlockPhone();
            ph.sendText();
        }

    }
}
