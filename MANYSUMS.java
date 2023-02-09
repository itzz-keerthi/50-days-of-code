/* PROBLEM

You are given a range of integers 
{
�
,
�
+
1
,
…
,
�
}
{L,L+1,…,R}. An integer 
�
X is said to be reachable if it can be represented as a sum of two not necessarily distinct integers in this range. Find the number of distinct reachable integers.

Input
The first line of the input contains a single integer 
�
T denoting the number of test cases. The description of 
�
T test cases follows.
The first and only line of each test case contains two space-separated integers 
�
L and 
�
R.
Output
For each test case, print a single line containing one integer — the number of reachable integers.

Constraints
1
≤
�
≤
1
0
5
1≤T≤10 
5
 
1
≤
�
≤
�
≤
1
0
6
1≤L≤R≤10 
6
 
Sample 1:
Input
Output
2
2 2
2 3
1
3
Explanation:
Example case 1: The only reachable integer is 
2
+
2
=
4
2+2=4.

Example case 2: 
4
4, 
5
5 and 
6
6 are reachable, since 
2
+
2
=
4
2+2=4, 
2
+
3
=
5
2+3=5 and 
3
+
3
=
6
3+3=6.   */

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
		    int l=sc.nextInt();
		    int r=sc.nextInt();
		    if(l==r)
		        System.out.println(1);
		    else
		        System.out.println(2*(r-l)+1);
		}
	}
}
