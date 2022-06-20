//# Task
/* Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), 
and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. Round the result to the nearest integer.
Example
Meal cost: 100
Tip percent: 15
Tax percent: 8
A tip of 15% * 100 = 15, and the taxes are 8% * 100 = 8. Print the value 123 and return from the function. */


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
        
        double tip, tax;
        Scanner scan = new Scanner(System.in);

        double meal_cost = scan.nextDouble();
        int tip_percent = scan.nextInt();
        int tax_percent = scan.nextInt();

        tip = meal_cost * tip_percent/100;
        tax = meal_cost * tax_percent/100;
        
        int result = (int) Math.round(meal_cost + tip + tax);
        System.out.println(result);
    }
}
