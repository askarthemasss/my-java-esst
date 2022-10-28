import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        int numOfQuries = scanner.nextInt();
        
        for(int i=0; i< numOfQuries; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            // My Solution
            for(int j=1; j<= n; j++){
                int x =0;
                for(int k=0; k<j; k++){
                    x += Math.pow(2,k) * b;
                }
                System.out.print(a + x + " ");
            }
            
            // Best Solution
//             for(int j=0;j<n;j++){
//                 a = a + (int)Math.pow(2,j)*b;
//                 System.out.print(a + " ");
//             }
            
            System.out.println();
            
        }        
    }
}
