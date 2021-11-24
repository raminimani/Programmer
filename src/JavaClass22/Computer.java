package JavaClass22;

public class Computer {
    void speed(){
        System.out.println("Computers speeds depends on RAM and Processors");
    }

    void Graphics(){
        System.out.println("Beside RAM and processors in computers graphic memory is also important ");
    }
    void Harddrives(){
        System.out.println("Hard drives or HDD is the storage of computers for saving data's ");
    }
    void ROM(){
        System.out.println("ROM or read only memory is the permanent memory of computers for saving BIOS files");
    }
    void Memory(){
        System.out.println("If the computer memory will be less computers will not work");
    }
    void Security(){
        System.out.println("All computers has the same security for being protected from cyber attacks");
    }
    void OS(){
        System.out.println("All the OS are same in computers");
    }
}
    class Apple extends Computer{
        @Override
        void Memory() {
            System.out.println("Apple can work with less memory");
        }

        @Override
        void Security() {
            System.out.println("Apple use different cyber security than other computers");
        }

        @Override
        void OS() {
            System.out.println("Apple use different OS than other PC's");
        }
        void color(){
            System.out.println("Apple computers has beautiful colors" );
        }
        void shape(){
            System.out.println("Apple shapes are slimmer than other computers");
        }
    }

    class Lenovo extends Computer{
        @Override
        void Graphics() {
            System.out.println("Lenovo company has high graphics computer");
        }
        void strong(){
            System.out.println("Lenovo computers are stronger in frames than others");
        }
    }
    class HP extends Computer{
        @Override
        void Harddrives() {
            System.out.println("HP has SSD hard drives with high quality than other computers");
        }
        void Speakers(){
            System.out.println("HP has High level sound system computers");
        }
        void Fans(){
            System.out.println("HP has more fans for cooling the processor than other computers");
        }
    }
    class Dell extends Computer{
        @Override
        void speed() {
            System.out.println("Dell Computers has great processors with new generation RAM's");
        }
        void battery(){
            System.out.println("Dell battery's are powerful than other computers");
        }
        void Screens(){
            System.out.println("Dell has announced the new technology touch screens");
        }
    }