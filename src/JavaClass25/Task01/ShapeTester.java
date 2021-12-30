package JavaClass25.Task01;

public class ShapeTester {
    public static void main(String[] args) {
        Shape circle=new Circle();
        circle.calculateArea(5);
        circle.calculatePerimeter(5);

        Shape [] shapes = {new Circle(), new Square()};
        for(Shape s:shapes){
            s.calculateArea(2.5);
            s.calculatePerimeter(17.5);
        }
    }
}
