/*  PROBLEM

Apple considers any iPhone with a battery health of 
80
%
80% or above, to be in optimal condition.

Given that your iPhone has 
�
%
X% battery health, find whether it is in optimal condition.

Input Format
The first line of input will contain a single integer 
�
T, denoting the number of test cases.
The first and only line of each test case contains an integer 
�
X — the battery health.
Output Format
For each test case, output on a new line, YES, if the battery is in optimal condition, and NO otherwise.

You may print each character in uppercase or lowercase. For example, NO, no, No and nO, are all considered identical.

Constraints
1
≤
�
≤
100
1≤T≤100
0
≤
�
≤
100
0≤X≤100
Sample 1:
Input
Output
4
97
42
80
10
YES
NO
YES
NO
Explanation:
Test case 
1
1: The battery health is 
97
%
97% which is greater than equal to 
80
%
80%. Thus, the battery is in optimal condition.

Test case 
2
2: The battery health is 
42
%
42% which is less than 
80
%
80%. Thus, the battery is not in optimal condition.

Test case 
3
3: The battery health is 
80
%
80% which is greater than equal to 
80
%
80%. Thus, the battery is in optimal condition.

Test case 
4
4: The battery health is 
10
%
10% which is less than 
80
%
80%. Thus, the battery is not in optimal condition.             */

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
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    if(x>=80)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
}
