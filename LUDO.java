/* PROBLEM

Chef is playing Ludo. According to the rules of Ludo, a player can enter a new token into the play only when he rolls a 
6
6 on the die.

In the current turn, Chef rolled the number 
�
X on the die. Determine if Chef can enter a new token into the play in the current turn or not.

Input Format
The first line contains a single integer 
�
T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains one integer 
�
X — the number rolled by the Chef on the die.
Output Format
For each test case, output YES if the Chef can enter a new token in the game. Otherwise, output NO.

You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical).

Constraints
1
≤
�
≤
6
1≤T≤6
1
≤
�
≤
6
1≤X≤6
Sample 1:
Input
Output
3
1
6
3
NO
YES
NO
Explanation:
Test Case 1: Since Chef did not roll a 
6
6, he can not enter a new token in the play.

Test Case 2: Since Chef rolled a 
6
6, he can enter a new token in the play.            */

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
		    if(x==6){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
