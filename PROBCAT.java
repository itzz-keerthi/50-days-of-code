/* Problem
Read problem statements in Mandarin, Russian, and Vietnamese as well.
Chef prepared a problem. The admin has rated this problem for 
�
x points.

A problem is called :

Easy if 
1
≤
�
<
100
1≤x<100

Medium if 
100
≤
�
<
200
100≤x<200

Hard if 
200
≤
�
≤
300
200≤x≤300

Find the category to which Chef’s problem belongs.

Input Format
The first line contains 
�
T denoting the number of test cases. Then the test cases follow.
The first and only line of each test case contains a single integer 
�
x.
Output Format
For each test case, output in a single line the category of Chef's problem, i.e whether it is an Easy, Medium or Hard problem. The output is case sensitive.

Constraints
1
≤
�
≤
50
1≤T≤50
1
≤
�
≤
300
1≤x≤300
Subtasks
Subtask 1 (100 points): Original constraints
Sample 1:
Input
Output
3
50
172
201
Easy
Medium
Hard
Explanation:
Test case 
1
1: The problem with rating 
�
=
50
x=50 is an easy problem as 
1
≤
50
<
100
1≤50<100.

Test case 
2
2: The problem with rating 
�
=
172
x=172 is a medium problem as 
100
≤
172
<
200
100≤172<200.

Test case 
3
3: The problem with rating 
�
=
201
x=201 is a hard problem as 
200
≤
201
≤
300
200≤201≤300.  */

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
	        int x=input.nextInt();
	        if(x>=1 && x<100)
	            System.out.println("Easy");
	        else if((x>=100) && (x<200))
	            System.out.println("Medium");
	        else
	            System.out.println("Hard");
	    }
	}
}
