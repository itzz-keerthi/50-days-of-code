/* PROBLEM

Chef and Chefina are playing with dice. In one turn, both of them roll their dice at once.

They consider a turn to be good if the sum of the numbers on their dice is greater than 
6
6.
Given that in a particular turn Chef and Chefina got 
�
X and 
�
Y on their respective dice, find whether the turn was good.

Input Format
The first line of input will contain a single integer 
�
T, denoting the number of test cases.
Each test case contains two space-separated integers 
�
X and 
�
Y — the numbers Chef and Chefina got on their respective dice.
Output Format
For each test case, output on a new line, YES, if the turn was good and NO otherwise.

Each character of the output may be printed in either uppercase or lowercase. That is, the strings NO, no, nO, and No will be treated as equivalent.

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
≤
6
1≤X,Y≤6
Sample 1:
Input
Output
4
1 4
3 4
4 2
2 6
NO
YES
NO
YES
Explanation:
Test case 
1
1: The sum of numbers on the dice is 
1
+
4
=
5
1+4=5 which is smaller than 
6
6. Thus, the turn is not good.

Test case 
2
2: The sum of numbers on the dice is 
3
+
4
=
7
3+4=7 which is greater than 
6
6. Thus, the turn is good.

Test case 
3
3: The sum of numbers on the dice is 
4
+
2
=
6
4+2=6 which is equal to 
6
6. Thus, the turn is not good.

Test case 
4
4: The sum of numbers on the dice is 
2
+
6
=
8
2+6=8 which is greater than 
6
6. Thus, the turn is good.      */

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
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    if(x+y<=6)
		        System.out.println("NO");
		    else 
		        System.out.println("YES");
		}
	}
}
