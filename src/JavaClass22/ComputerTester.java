package JavaClass22;

public class ComputerTester {
    public static void main(String[] args) {
        Computer [] computers={new Apple(), new Dell(), new HP(), new Lenovo()};

            for (Computer obj: computers){

                obj.Graphics();
                obj.Harddrives();
                obj.Memory();
                obj.speed();
                obj.OS();
                obj.ROM();
                obj.Security();


                if (obj instanceof Apple){
                    ((Apple) obj).color();
                }
                if (obj instanceof Dell){
                    ((Dell) obj).battery();
                }
                if(obj instanceof HP){
                    ((HP) obj).Speakers();
                }
                if (obj instanceof Lenovo){
                    ((Lenovo) obj).strong();
                }
            }

    }
}
