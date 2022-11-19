/*TASk
Write a program to obtain a number NN and increment its value by 1 if the number is divisible by 4 otherwiseotherwise decrement its value by 1.

Input Format
First line will contain a number NN.

Output Format
Output a single line, the new value of the number.

Constraints
0 \leq N \leq 10000≤N≤1000
Sample 1:
Input
Output
5
4
Explanation:
Since 5 is not divisible by 4 hence, its value is decreased by 1.  */

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
        int n=sc.nextInt();
        if((n%4)==0){
            System.out.println(n+1);
        }
        else{
            System.out.println(n-1);
        }
	}
}
