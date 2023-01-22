/* PROBLEM


Chef has three spells. Their powers are 
�
A, 
�
B, and 
�
C respectively. Initially, Chef has 
0
0 hit points, and if he uses a spell with power 
�
P, then his number of hit points increases by 
�
P.

Before going to sleep, Chef wants to use exactly two spells out of these three. Find the maximum number of hit points Chef can have after using the spells.

Input Format
The first line of the input contains a single integer 
�
T denoting the number of test cases. The description of 
�
T test cases follows.
The first and only line of each test case contains three space-separated integers 
�
A, 
�
B, and 
�
C.
Output Format
For each test case, print a single line containing one integer — the maximum number of hit points.

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
 
1
≤
�
,
�
,
�
≤
1
0
8
1≤A,B,C≤10 
8
 
Subtasks
Subtask #1 (100 points): original constraints

Sample 1:
Input
Output
2
4 2 8
10 14 18
12
32
Explanation:
Example case 1: Chef has three possible options:

Use the first and second spell and have 
4
+
2
=
6
4+2=6 hitpoints.
Use the second and third spell and have 
2
+  
8
=
10
2+8=10 hitpoints.
Use the first and third spell and have 
4
+
8
=
12
4+8=12 hitpoints.
Chef should choose the third option and use the spells with power 
4
4 and 
8
8 to have 
12
12 hitpoints.

Example case 2: Chef should use the spells with power 
14
14 and 
18
18.               */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input= new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    int a=input.nextInt();
		    int b=input.nextInt();
		    int c=input.nextInt();
		    if(a<=b&&a<=c)
                System.out.println(b+c);
            else if(b<=a&&b<=c)
                System.out.println(a+c);
            else if(c<=a&&c<=b)
                System.out.println(a+b);
		}
	}
}
