package JavaClass21;

public class StudentTester {
    public static void main(String[] args) {

       Student [] student={new syntaxStudents(),new collageStudents(),new schoolStudents()};

       for (Student obj:student) {

           obj.intelligent();
           obj.lessons();
           obj.Teachers();
           obj.intelligent();
       }
        Student student1=new schoolStudents();
       schoolStudents stu=(schoolStudents) student1;
       stu.classActivity();
       stu.holidays();

       }
    }
