import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int rem=0,s=0,t=0;


    while(n>0)
        {
        rem=n%2;
        n=n/2;
        
        if(rem==1)
         {   s++;
           if(s>=t)

            t=s;

        }
        else{

            s=0;
        }   
    }

    System.out.println(t);
        //System.out.println(Integer.toBinaryString(n));
        //10 to binary
        
}
}