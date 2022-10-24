import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main()throws IOException {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        String str="";
	Scanner scan=new Scanner(System.in);	
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1=scan.nextInt();
        double n2=scan.nextDouble();
        str=scan.nextLine();
        //System.out.println(str);
        System.out.println((n1+i)+"\n"+(n2+d)+"\n"+(s.concat(str)));
        
        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
    }
}