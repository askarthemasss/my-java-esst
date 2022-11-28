public class Rectangle implements Shape{

    Rectangle(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }

    float length;
    float breadth;

    // Area of Rectangle - length*breadth
    public double getArea() {
        return length*breadth;
    }

    // Perimeter of Rectangle - 2*(length+breadth)
    public double getPerimeter() {
        return 2*(length+breadth);
    }
}
