/* PROBLEM

Chef's son Chefu found some matches in the kitchen and he immediately starting playing with them.

The first thing Chefu wanted to do was to calculate the result of his homework — the sum of 
�
A and 
�
B, and write it using matches. Help Chefu and tell him the number of matches needed to write the result.

Digits are formed using matches in the following way:
Input
The first line of the input contains a single integer 
�
T denoting the number of test cases. The description of 
�
T test cases follows.
The first and only line of each test case contains two space-separated integers 
�
A and 
�
B.
Output
For each test case, print a single line containing one integer — the number of matches needed to write the result (
�
+
�
A+B).

Constraints
1
≤
�
≤
1
,
000
1≤T≤1,000
1
≤
�
,
�
≤
1
0
6
1≤A,B≤10 
6
 
Sample 1:
Input
Output
3
123 234
10101 1010
4 4
13
10
7
Explanation:
Example case 1: The result is 
357
357. We need 
5
5 matches to write the digit 
3
3, 
5
5 matches to write the digit 
5
5 and 
3
3 matches to write the digit 
7
7.

Example case 2: The result is 
11111
11111. We need 
2
2 matches to write each digit 
1
1, which is 
2
⋅
5
=
10
2⋅5=10 matches in total.      */

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
		    int sum=a+b;
		    int result=0;
		    while(sum>0){
		        int rem=sum%10;
		        sum=sum/10;
		        switch(rem){
		            case 0:
		                result+=6;
		                break;
		            case 1:
		                result+=2;
		                break;
		            case 2:
		                result+=5;
		                break;
		            case 3:
		                result+=5;
		                break;
		            case 4:
		                result+=4;
		                break;
		            case 5:
		                result+=5;
		                break;
		            case 6:
		                result+=6;
		                break;
		            case 7:
		                result+=3;
		                break;
		            case 8:
		                result+=7;
		                break;
                    case 9:
		                result+=6;
		                break;		              
		        }
		    }
		    System.out.println(result);
		}
		
	}
}
