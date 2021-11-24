package JavaClass21;

public class Student {

    void lessons(){
        System.out.println("The lessons are so hard for the students");
    }
    void Teachers(){
        System.out.println("All the teachers has the same method of teaching");
    }
    void intelligent(){
        System.out.println("Lots of the students are lazy and some of them are intelligent");
    }
    void subject(){
        System.out.println("Students studies different subjects outside the curriculum");
    }
}

    class syntaxStudents extends Student{

        @Override
        void intelligent() {
            System.out.println("Lots of the Syntax students are intelligent and they try their best");
        }

        @Override
        void Teachers() {
            System.out.println("The Syntax teachers has different methods of teaching");
        }
        void homeWorks(){
            System.out.println("We have lots of daily task and Homeworks in Syntax school");
        }
        void replits(){
            System.out.println("Syntax Students have lots of daily tasks to do in replits");
        }
    }

    class collageStudents extends Student{
        @Override
        void subject() {
            System.out.println("The collage students studies all the subjects which is inside curriculum");
        }

        @Override
        void Teachers() {
            System.out.println("Collage Students love the Teachers with any methods of teaching they have");
        }
        void exam(){
            System.out.println("Collage students have mid term and final exams");
        }
        void grades(){
            System.out.println("The collage students have different grades in school");
        }
    }
    class schoolStudents extends Student{
        @Override
        void Teachers() {
            System.out.println("We don't like some of the teachers teaching method");
        }
        void holidays(){
            System.out.println("School students has winter and summer holidays");
        }
        void classActivity(){
            System.out.println("School students has less class activities");
        }
    }
