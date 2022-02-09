import java.util.Scanner;
// Scanner Class is inside java.util

// Topics covered
// Class - String, System
// byte, short, int, long, float, double, char, boolean
// constant variable - "final"
// Integer.MAX_VALUE
// .toUpperCase(), .toLowerCase(), .length(), isEmpty(), isBlank(), .charAt(),
// .indexOf(), .lastIndexOf(), .concat()
// instance of a class - "new" keyword
// Scanner Class
// .next(), ,nextLine(), .nextByte(), .nextShort(), .nextInt(), .nextLong(),
// .nextFloat(), .nextDouble(), .nextBoolean()
// To read char - .next().charAt(0)


public class Main {
    public static void main(String[] args) {
        
        // built-in classes starts with Capital letter - String, System.out

        // variables in java
        String myName, myJob;
        myName = "Askar"; myJob = "Programmer";
        String myNameCopy = myName + " is an " + myJob;
        
        // constants in java - "final"
        final String COMPANY_NAME = "Mr Masss Academy";

        // Identifiers - letters, digits, _ , $ (shouldn't start with digit), Case sensitive
        // byte, short, int, float
        byte b1 = 49; // -128, 127
        short s1 = 32000; // -32768, 32767
        int i1 = 66815;
        long l1 = 94861548L;
        // int c3 = '\u0041';   // 65
        // int c1 = 'A';        // 65

        // float, double
        float f1 = 4.5F;
        double d1 = 10.6;
        
        // char
        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';

        // boolean
        boolean isAlive = true;
        boolean bo2 = false;
        boolean bo3 = 2 > 3;

        // string concatenation
        String part1 = "Mr";
        String part2 = "Masss";
        String full = part1 + " " + part2;


        System.out.println(myNameCopy);
        System.out.println(COMPANY_NAME);
        System.out.println(b1);
        System.out.println(s1 + 21);
        System.out.println(i1);
        System.out.println(l1);

        // bytes and values
        System.out.println();
        System.out.println("Max int Value:" + Integer.MAX_VALUE);
        System.out.println("Min float value:" + Float.MIN_VALUE);
        System.out.println();
        // end

        System.out.println(f1 - 2.5);
        System.out.println(d1);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println(bo2);
        System.out.println(bo3);

        if (isAlive) {
            System.out.println("Yes, It's Alive");
        } else {
            System.out.println("It's not Alive");
        }

        // String is a Class - first letter 'S' - uppercase,
        // has static methods as we r calling them with the name of class (String.)
        // String objects - (String myName;) // myName is object of String Class
        // objects also has methods (myName.toUpperCase()) - not static methods, just methods
        String str1 = "Mohamed Askar";

        // toUpperCase(), toLowerCase()
        String str2 = str1.toLowerCase();
        String str3 = "  ";
        System.out.println(str1.toUpperCase());
        System.out.println(str2);
        System.out.println(str1);

        // length()
        System.out.println("Length of str1: " + str1.length());

        // isEmpty(), isBlank() - spaces not considered
        System.out.println("Is str3 an Empty String?: " + str3.isEmpty());
        System.out.println("Is str3 an Blank String?: " + str3.isBlank());

        // charAt(index_val) - returns value
        char c4 = str1.charAt(4);
        System.out.println(c4);

        // indexOf(char) - returns index of 1st char
        // lastIndexOf(char) - returns index of last char
        System.out.println(str1.indexOf('a'));
        System.out.println(str1.lastIndexOf('a'));

        // concat()
        System.out.println(str1.concat(" - @askarthemasss"));

        System.out.println(full);
        System.out.println(full.concat(" _askar").isBlank() );

        // Instantinating a object
        // "new" - keyword is used to create or instantiate objects of classes
        // we r not using "new" keyword for "String" class as it is frequently used
        // java developers made "String" to act like a primitive Data Type
        // (name1)object(s) reference the ("NEW STRING") value
        String name1 = new String("NEW STRING");
        System.out.println(name1);
        // using "new" keyword - a new object with separate value will b created
        // otherwise objects will reference the same value
        // String (class) is immutable

        // Scanner Class
        // import java.util.Scanner;
        // System.out - points to Screen
        // System.in - points to Keyboard
        //      - field of System class
        //      - static field as it is accessed using class name
        // when .next() method(s) is called, prog will stop execution & wait for
        // user to enter a value

        Scanner input = new Scanner(System.in); // creating object
        System.out.print("Enter your Name: ");
        System.out.println("Welcome " + input.nextLine()); // getting input
        // .next(), ,nextLine(), .nextByte(), .nextShort(), .nextInt(), .nextLong(),
        // .nextFloat(), .nextDouble(), .nextBoolean()
        // .next() - stops at space, .nextLine() - reads until we press "Enter"

        System.out.print("Enter Float 2: ");
        float f2 = input.nextFloat();
        System.out.print("Enter Integer 2: ");
        int i2 = input.nextInt();
        System.out.println("Float 2 = " + f2);
        System.out.println("Integer 2 = " + i2);
        System.out.println("Float 2 = " + f2);
        // no need to create multiple objects
        // can use 1 object to create multiple variables

    }   
}
