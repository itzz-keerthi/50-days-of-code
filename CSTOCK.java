/* PROBLEM

Chef wants to buy a stock whose price was 
�
S rupees when the market opened. He will buy the stock if and only if its price is in the range 
[
�
,
�
]
[A,B]. The price of the stock has changed by 
�
%
C% by the time he was trying to buy the stock. Will he be able to buy the stock?

Input Format
First line of the input contains 
�
T, the number of testcases. Then the test cases follow.
Each test case contains 
4
4 space-separated integers 
�
,
�
,
�
,
�
S,A,B,C in a single line.
Output Format
For each test case, if Chef buys the stock print YES, otherwise print NO.

You may print each character of the string in uppercase or lowercase (for example, the strings yEs, yes, Yes, and YES will all be treated as identical).

Constraints
1
≤
�
≤
1000
1≤T≤1000
0
≤
�
≤
1
0
6
0≤S≤10 
6
 
0
≤
�
≤
�
≤
1
0
6
0≤A≤B≤10 
6
 
−
100
≤
�
≤
100
−100≤C≤100
Sample 1:
Input
Output
3
100 93 108 7
100 94 100 -7
183 152 172 -17
Yes
No
No
Explanation:
Test Case 
1
1: The price of the stock after gaining 
7
%
7% will become 
107
107, which is in Chef's range of 
[
93
,
108
]
[93,108]. Hence, Chef will buy the stock.
Test Case 
2
2: The price of the stock after falling 
7
%
7% will become 
93
93, which is not in Chef's range of 
[
94
,
100
]
[94,100]. Hence, Chef will not buy the stock.
Test Case 
3
3: The price of the stock after falling 
17
%
17% will become 
151.89
151.89, which is not in Chef's range of 
[
152
,
172
]
[152,172]. Hence, Chef will not buy the stock.          */

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
		    int s = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    double price= s+(s*c)/100.0;
		    if(price<a || price>b)
		        System.out.println("NO");
		    else
		        System.out.println("YES");
		}
	}
}

