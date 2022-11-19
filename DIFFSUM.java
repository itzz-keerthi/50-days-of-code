/* TASK
Problem
Write a program to take two numbers as input and print their difference if the first number is greater than the second number otherwiseotherwise print their sum.

Input Format
First line will contain the first number (N1N1)
Second line will contain the second number (N2N2)
Output Format
Output a single line containing the difference of 2 numbers (N1 - N2)(N1−N2) if the first number is greater than the second number otherwise output their sum (N1 + N2)(N1+N2).

Constraints
-1000 \leq N1 \leq 1000−1000≤N1≤1000
-1000 \leq N2 \leq 1000−1000≤N2≤1000
Sample 1:
Input
Output
82 28
54 */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(n1>n2){
		    System.out.println(n1-n2);
		}
		else{
		    System.out.println(n1+n2);
		}
	}
}
