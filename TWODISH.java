/* PROBLEM
Chef will have 
�
N guests in his house today. He wants to serve at least one dish to each of the 
�
N guests. Chef can make two types of dishes. He needs one fruit and one vegetable to make the first type of dish and one vegetable and one fish to make the second type of dish. Now Chef has 
�
A fruits, 
�
B vegetables, and 
�
C fishes in his house. Can he prepare at least 
�
N dishes in total?

Input Format
First line will contain 
�
T, number of testcases. Then the testcases follow.
Each testcase contains of a single line of input, four integers 
�
,
�
,
�
,
�
N,A,B,C.
Output Format
For each test case, print "YES" if Chef can prepare at least 
�
N dishes, otherwise print "NO". Print the output without quotes.

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
,
�
,
�
,
�
≤
100
1≤N,A,B,C≤100
Subtasks
Subtask 1 (100 points): Original constraints
Sample 1:
Input
Output
4
2 1 2 1
3 2 2 2
4 2 6 3
3 1 3 1
YES
NO
YES
NO
Explanation:
Test case 
1
1: Chef prepares one dish of the first type using one fruit and one vegetable and another dish of the second type using one vegetable and one fish.

Test case 
2
2: Chef prepares two dishes of the first type using two fruit and two vegetable. Now all the vegetables are exhausted, hence he can't prepare any other dishes.

Test case 
3
3: Chef can prepare a total of 
5
5 dishes, two dishes of the first type and three dishes of the second type.   */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		int n=input.nextInt();
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int counter=0;
		while(b-->0){
		    if(a>0){
		        counter++;
		        a--;
		    }
		    else if(c>0){
		        counter++;
		        c--;
		    }
		}
		if(counter>=n)
		    System.out.println("Yes");
		else
		    System.out.println("No");
		}
	}
}
