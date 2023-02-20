/*  PROBLEM

You are given an integer 
�
N. Consider the sequence containing the integers 
1
,
2
,
…
,
�
1,2,…,N in increasing order (each exactly once). Find the maximum length of its contiguous subsequence with an even sum.

Input Format
The first line of the input contains a single integer 
�
T denoting the number of test cases. The description of 
�
T test cases follows.
The first and only line of each test case contains a single integer 
�
N.
Output Format
For each test case, print a single line containing one integer --- the maximum length of a contiguous subsequence with even sum.

Constraints
1
≤
�
≤
1
0
4
1≤T≤10 
4
 
2
≤
�
≤
1
0
4
2≤N≤10 
4
 
Subtasks
Subtask #1 (100 points): original constraints

Sample 1:
Input
Output
3
3
4
5
3
4
4
Explanation:
Example case 1: The optimal choice is to choose the entire sequence, since the sum of all its elements is 
1
+
2
+
3
=
6
1+2+3=6, which is even.

Example case 3: One of the optimal choices is to choose the subsequence 
[
1
,
2
,
3
,
4
]
[1,2,3,4], which has an even sum.             */

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
		    int n=sc.nextInt();
		    int sum=0;
		    for(int i=1;i<=n;i++)
		         sum+=i;
		    if(sum%2==0)
		        System.out.println(n);
		    else 
		        System.out.println(n-1);
		}
	}
}
