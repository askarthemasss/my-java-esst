public class Circle implements Shape {

    Circle(float radius){
        this.radius = radius;
    }
  
    float radius;

    // setter
    public void setRadius(float radius){
        this.radius = radius;
    }

    // getters
    public float getRadius(){
        return radius;
    }

    // Area of Circle - PI*r*r
    public double getArea() {
        return Math.PI*radius*radius;
    }

    // Perimeter of Circle - 2*PI*r
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

}
