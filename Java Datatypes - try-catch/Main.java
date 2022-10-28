import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        
        for(int i=0; i < t; i++){
            
            try{
                long n = in.nextLong();
                System.out.println(n + " can be fitted in:");
                if(n >= -128 && n <= 127){
                    System.out.println("* byte");
                }
                if(n >= -Math.pow(2,15) && n <= Math.pow(2,15)-1){
                    System.out.println("* short");
                }
                if(n >= -Math.pow(2,31) && n <= Math.pow(2,31)-1){
                    System.out.println("* int");
                }
                if(n >= -Math.pow(2,63) && n <= Math.pow(2,63)){
                    System.out.println("* long");
                }   
            } catch(Exception e){
                System.out.println(in.next() + " can't be fitted anywhere.");
            }
            
        }
        
    }
}
