/* PROBLEM

Chef is fond of burgers and decided to make as many burgers as possible.

Chef has 
�
A patties and 
�
B buns. To make 
1
1 burger, Chef needs 
1
1 patty and 
1
1 bun.
Find the maximum number of burgers that Chef can make.

Input Format
The first line of input will contain an integer 
�
T — the number of test cases. The description of 
�
T test cases follows.
The first and only line of each test case contains two space-separated integers 
�
A and 
�
B, the number of patties and buns respectively.
Output Format
For each test case, output the maximum number of burgers that Chef can make.

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
,
�
≤
1
0
5
1≤A,B≤10 
5
 
Sample 1:
Input
Output
4
2 2
2 3
3 2
23 17
2
2
2
17
Explanation:
Test case 
1
1: Chef has 
2
2 patties and 
2
2 buns, and therefore Chef can make 
2
2 burgers.

Test case 
2
2: Chef has 
2
2 patties and 
3
3 buns. Chef can make at most 
2
2 burgers by using 
2
2 patties and 
2
2 buns.

Test case 
3
3: Chef has 
3
3 patties and 
2
2 buns. Chef can make at most 
2
2 burgers by using 
2
2 patties and 
2
2 buns.

Test case 
4
4: Chef has 
23
23 patties and 
17
17 buns. Chef can make at most 
17
17 burgers by using 
17
17 patties and 
17
17 buns.          */
  
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
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    if(a>b){
		        System.out.println(b);
		    }
		    else{
		        System.out.println(a);
		    }
		}
	}
}

