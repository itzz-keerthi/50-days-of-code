/* PROBLEM
Chef categorises an instagram account as spam, if, the following count of the account is more than 1010 times the count of followers.

Given the following and follower count of an account as XX and YY respectively, find whether it is a spam account.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of two space-separated integers XX and YY — the following and follower count of an account, respectively.
Output Format
For each test case, output on a new line, YES, if the account is spam and NO otherwise.

You may print each character of the string in uppercase or lowercase. For example, the strings YES, yes, Yes and yES are identical.

Constraints
1 \leq T \leq 1001≤T≤100
1 \leq X, Y \leq 1001≤X,Y≤100
Sample 1:
Input
Output
4
1 10
10 1
11 1
97 7
NO
NO
YES
YES
Explanation:
Test case 11: The following count is 11 while the follower count is 1010. Since the following count is not more than 1010 times the follower count, the account is not spam.

Test case 22: The following count is 1010 while the follower count is 11. Since the following count is not more than 1010 times the follower count, the account is not spam.

Test case 33: The following count is 1111 while the follower count is 11. Since the following count is more than 1010 times the follower count, the account is spam.

Test case 44: The following count is 9797 while the follower count is 77. Since the following count is more than 1010 times the follower count, the account is spam.  */

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
		  if(x>(10*y)){
		      System.out.println("YES");
		  }
		  else{
		      System.out.println("NO");
		  }
		}
	}
}

