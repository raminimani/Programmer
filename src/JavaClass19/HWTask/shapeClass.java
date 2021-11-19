package JavaClass19.HWTask;

public class shapeClass {

    /*
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code
     */

    double radius;

    shapeClass(){

    }

    shapeClass(double radius){
        this.radius=radius;
    }
}
     class circle extends shapeClass{
     circle(double radius){
         super(radius);
     }
     double CalAreaOFCircle(){
         return 2*Math.PI*radius*radius;
     }
     }

     class CirAreaResult{
         public static void main(String[] args) {
             circle obj=new circle(5);
             System.out.println(obj.CalAreaOFCircle());
         }
     }