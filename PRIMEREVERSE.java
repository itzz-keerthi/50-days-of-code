/* TASK
You are given two binary strings AA and BB, each of length NN. You can perform the following operation on string AA any number of times:

Select a prime number XX.
Choose any substring of string AA having length XX and reverse the substring.
Determine whether you can make the string AA equal to BB using any (possibly zero) number of operations.

A substring is obtained by deleting some (possibly zero) elements from the beginning and some (possibly zero) elements from the end of the string.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains an integer NN — the length of the strings AA and BB.
The second line contains the binary string AA.
The third line contains the binary string BB.
Output Format
For each test case, output on a new line, YES, if you can make the string AA equal to BB using any number of operations and NO otherwise.

You can print each character in uppercase or lowercase. For example, YES, yes, Yes, and yES are all identical.

Constraints
1 \leq T \leq 1001≤T≤100
1 \leq N \leq 10^51≤N≤10 
5
 
A_iA 
i
​
  and B_iB 
i
​
  contain 00 and 11 only.
The sum of NN over all test cases won't exceed 10^510 
5
 .
Sample 1:
Input
Output
4
2
00
00
4
1001
0111
5
11000
10010
5
11000
11010
YES
NO
YES
NO
Explanation:
Test case 11: Both the strings are equal. Thus, we do not need any operations.

Test case 22: It can be shown that we cannot make the string AA equal to BB using any number of operations.

Test case 33: Choose X = 3X=3 and reverse the substring A[2,4] = 100A[2,4]=100. Thus, the string AA becomes 1001010010 which is equal to BB.

Test case 44: It can be shown that we cannot make the string AA equal to BB using any number of operations.                 */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    String a=sc.next();
		    String b=sc.next();
		    int a_count=0;
		    int b_count=0;
		    for(int i=0;i<n;i++){
		        if(a.charAt(i)=='1'){
		            a_count++;
		        }
		        if(b.charAt(i)=='1'){
		            b_count++;
		        }
		    }
		    if(a_count==b_count){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
