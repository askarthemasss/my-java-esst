// Static Method  - we can call it without creating an object

public class Display
{
  public static void main(String[] args)
  {
    show();
  }
  static void show()
  {
    System.out.println("It is an example of static method.");
  }
}

// Instance Method - Before calling or invoking the instance method, it is necessary to create an object of its class
public class Display
{
    public static void main(String[] args)
    {
        Display dp = new Display();
        dp.show();
    }
    void show()
    {
        System.out.println("It is an example of Instance method.");
    }
}  
