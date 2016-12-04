import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int Factorial(int n){
        /**/
        
        if(n<=1){
            return 1;
        }
        else{
            return n*Factorial(n-1);
        }
        
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i=in.nextInt();
        in.close();
        System.out.println(Factorial(i));
    }
}
