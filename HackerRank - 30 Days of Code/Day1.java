// # Task
/* Complete the code in the editor below. The variables i, d, and s are already declared and initialized for you. You must:
    Declare 3 variables: one of type int, one of type double, and one of type String.
    Read 3 lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your variables.
    Use the + operator to perform the following operations:

    1) Print the sum of i plus your int variable on a new line.
    2) Print the sum of d plus your double variable to a scale of one decimal place on a new line.
    3) Concatenate s with the string you read as input and print the result on a new line. */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);


System.out.println(scan.nextInt() + i);
System.out.println(scan.nextDouble() + d);
scan.nextLine(); //declaring only one nextline will display an empty line
System.out.println(s + scan.nextLine());
