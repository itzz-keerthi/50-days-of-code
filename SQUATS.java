/* PROBLEM

Somu went to the gym today. He decided to do 
�
X sets of squats. Each set consists of 
15
15 squats. Determine the total number of squats that he did today.

Input Format
The first line contains a single integer 
�
T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains an integer 
�
X — the total number of sets of squats that Somu did.
Output Format
For each test case, output the total number of squats done by Somu.

Constraints
1
≤
�
≤
1000
1≤T≤1000
1
≤
�
≤
1
0
5
1≤X≤10 
5
 
Sample 1:
Input
Output
3
1
4
99
15
60
1485
Explanation:
Test Case 1: Since, he does only 
1
1 set of squats, the total number of squats done by him is 
15
15.

Test Case 2: Since, he does 
4
4 sets of squats, the total number of squats is 
15
+
15
+
15
+
15
=
60
15+15+15+15=60.                             */

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
		    System.out.println(x*15);
		}
	}
}
