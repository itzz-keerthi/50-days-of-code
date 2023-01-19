/* PROBLEM
Chef is a software developer, so he has to switch between different languages sometimes. Each programming language has some features, which are represented by integers here.

Currently, Chef has to use a language with two given features 
�
A and 
�
B. He has two options --- switching to a language with two features 
�
1
A 
1
​
  and 
�
1
B 
1
​
 , or to a language with two features 
�
2
A 
2
​
  and 
�
2
B 
2
​
 . All four features of these two languages are pairwise distinct.

Tell Chef whether he can use the first language, the second language or neither of these languages (if no single language has all the required features).

Input Format
The first line of the input contains a single integer 
�
T denoting the number of test cases. The description of 
�
T test cases follows.
The first and only line of each test case contains six space-separated integers 
�
,
�
,
�
1
,
�
1
,
�
2
,
�
2
A,B,A 
1
​
 ,B 
1
​
 ,A 
2
​
 ,B 
2
​
 .
Output Format
For each test case, print a single line containing the integer 
1
1 if Chef should switch to the first language, or 
2
2 if Chef should switch to the second language, or 
0
0 if Chef cannot switch to either language.

Constraints
1
≤
�
≤
288
1≤T≤288
1
≤
�
,
�
,
�
1
,
�
1
,
�
2
,
�
2
≤
4
1≤A,B,A 
1
​
 ,B 
1
​
 ,A 
2
​
 ,B 
2
​
 ≤4
�
,
�
A,B are distinct
�
1
,
�
1
,
�
2
,
�
2
A 
1
​
 ,B 
1
​
 ,A 
2
​
 ,B 
2
​
  are pairwise distinct
Subtasks
Subtask #1 (100 points): original constraints

Sample 1:
Input
Output
3
1 2 2 1 3 4
3 4 2 1 4 3
1 2 1 3 2 4
1
2
0
Explanation:
Example case 1: The first language has the required features --- features 
1
1 and 
2
2.

Example case 2: The second language has the required features --- features 
3
3 and 
4
4.

Example case 3: Neither language has both features 
1
1 and 
2
2.           */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	    Scanner input=new Scanner(System.in);
	    int t=input.nextInt();
	    while(t-->0){
	        int a=input.nextInt();
	        int b=input.nextInt();
	        int a1=input.nextInt();
	        int b1=input.nextInt();
	        int a2=input.nextInt();
	        int b2=input.nextInt();
	        if(((a1==a) && (b1==b)) || ((a1==b) && (b1==a)))
	            System.out.println(1);
	        else if (((a2==a) && (b2==b)) || ((a2==b) && (b2==a)))
	            System.out.println(2);
	        else
	            System.out.println(0);
	    }
	}
}
