// #Task
/* 
Given an integer, n, perform the following conditional actions:
    • If n is odd, print Weird
    • If n is even and in the inclusive range of 2 to 5, print Not Weird
    • If n is even and in the inclusive range of 6 to 20, print Weird
    • If n is even and greater than 20, print Not Weird

## Input Format
A single line containing a positive integer, n.  */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
       
       Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        if (!(n%2 == 0)){
            System.out.println("Weird");
        }
        else if (2<=n && n<=5){
                System.out.println("Not Weird");
            }
        
        else if (6<=n && n<=20) {
            System.out.println("Weird");
            }
        
        else if (n>20) {
              System.out.println("Not Weird");
          }  
          
    }
}
