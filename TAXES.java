/* PROBLEM

In Chefland, a tax of rupees 
10
10 is deducted if the total income is strictly greater than rupees 
100
100.

Given that total income is 
�
X rupees, find out how much money you get.

Input Format
The first line of input will contain a single integer 
�
T, denoting the number of test cases.
The first and only line of each test case contains a single integer 
�
X — your total income.
Output Format
For each test case, output on a new line, the amount of money you get.

Constraints
1
≤
�
≤
100
1≤T≤100
1
≤
�
≤
1000
1≤X≤1000
Sample 1:
Input
Output
4
5
105
101
100
5
95
91
100
Explanation:
Test case 
1
1: Your total income is 
5
5 rupees which is less than 
100
100 rupees. Thus, no tax would be deducted and you get 
5
5 rupees.

Test case 
2
2: Your total income is 
105
105 rupees which is greater than 
100
100 rupees. Thus, a tax of 
10
10 rupees would be deducted and you get 
105
−
10
=
95
105−10=95 rupees.

Test case 
3
3: Your total income is 
101
101 rupees which is greater than 
100
100 rupees. Thus, a tax of 
10
10 rupees would be deducted and you get 
101
−
10
=
91
101−10=91 rupees.

Test case 
4
4: Your total income is 
100
100 rupees which is equal to 
100
100 rupees. Thus, no tax would be deducted and you get 
100
100 rupees.         */

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
		    if(x>100)
		        System.out.println(x-10);
		    else
		        System.out.println(x);
		}
	}
}
