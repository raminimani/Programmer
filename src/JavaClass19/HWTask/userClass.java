package JavaClass19.HWTask;

public class userClass {
    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.
     */

    String name;
    int PhoneNumber;

    userClass(){
    }
    userClass(String name, int PhoneNumber){
        this.name=name;
        this.PhoneNumber=PhoneNumber;

    }
}
     class userInfo extends userClass {
    String userAddress;

    userInfo(String name, int PhoneNumber){
        super(name,PhoneNumber);
        this.userAddress=userAddress;
    }
    void userForm (){
        System.out.println(name+" "+ PhoneNumber+" "+userAddress);
    }
     }

     class userClassTester {
         public static void main(String[] args) {

             userInfo file=new userInfo("Ramin",706081801);
             file.userAddress="US/VA";
             file.userForm();

         }
     }
