/* PROBLEM

You are given two integers 
�
N and 
�
K. You may perform the following operation any number of times (including zero): change 
�
N to 
�
−
�
N−K, i.e. subtract 
�
K from 
�
N. Find the smallest non-negative integer value of 
�
N you can obtain this way.

Input
The first line of the input contains a single integer 
�
T denoting the number of test cases. The description of 
�
T test cases follows.
The first and only line of each test case contains two space-separated integers 
�
N and 
�
K.
Output
For each test case, print a single line containing one integer — the smallest value you can get.

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
1
0
9
1≤N≤10 
9
 
0
≤
�
≤
1
0
9
0≤K≤10 
9
 
Subtasks
Subtask #1 (100 points): original constraints

Sample 1:
Input
Output
3
5 2
4 4
2 5
1
0
2
Explanation:
Example case 1:

First, we change 
�
=
5
N=5 to 
�
−
�
=
5
−
2
=
3
N−K=5−2=3.
Then, we have 
�
=
3
N=3 and we change it to 
�
−
�
=
3
−
2
=
1
N−K=3−2=1.
Since 
1
<
�
1<K, the process stops here and the smallest value is 
1
1.

Example case 2: We change 
�
=
4
N=4 to 
�
−
�
=
4
−
4
=
0
N−K=4−4=0. Since 
0
<
�
0<K, the process stops here and the smallest value is 
0
0.

Example case 3: Since 
2
<
�
2<K initially, we should not perform any operations and the smallest value is 
2
2.        */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner  sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    if(k==0)
		    System.out.println(n);
		    else
		    System.out.println(n%k);
		}
	}
}
