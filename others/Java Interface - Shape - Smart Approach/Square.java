public class Square extends Rectangle {

    // Efficient approach
    // Square IS-A Rectangle
    // Square extends rectangle - get single side length for square and set it as length and breadth of rectangle
    Square(float side){
        super(side, side);
    }

  
  
    // Normal Approach
    //    float side;
  
    //    // Area of Square - side*side
    //    public double getArea() {
    //        return side*side;
    //    }
  
    //    // Perimeter of square - 4*side
    //    public double getPerimeter() {
    //        return 4*side;
    //    }
}
