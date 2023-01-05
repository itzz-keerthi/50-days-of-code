/* Problem
Alice is still not satisfied with Bob's math skills so she gave him a new challenge.

Given a positive integer NN, find any 33 distinct positive integers A, B, CA,B,C such that:

The product of any two of these 33 integers is a divisor of NN.
The product of all three integers is a multiple of NN.
If multiple solutions exist, you may print any of them.
Print -1−1 if no solution exists.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
The first and only line of each test case contains a single integer, NN.
Output Format
For each test case, output on a new line three space-separated integers satisfying the given condition.
Print -1−1 if the answer does not exist.

Constraints
1 \leq T \leq 1001≤T≤100
1 \leq N \leq 10^91≤N≤10 
9
 
Sample 1:
Input
Output
3
30
24
3
2 3 5
2 6 4
-1
Explanation:
Test case 11: We have A = 2, B = 3, C = 5A=2,B=3,C=5. They satisfy all the conditions:

AB = 6, AC = 10, BC = 15AB=6,AC=10,BC=15 are all divisors of N = 30N=30
ABC = 30ABC=30 is a multiple of N = 30N=30
Test case 22: We have A = 2, B = 6, C = 4A=2,B=6,C=4. They satisfy all the conditions:

AB = 12, AC = 8, BC = 24AB=12,AC=8,BC=24 are all divisors of N = 24N=24
ABC = 48ABC=48 is a multiple of N = 24N=24
Test case 33: It can be shown that no three positive integers A, B, CA,B,C satisfy the conditions.      */

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
		    int a=1;
		    int b=0;
		    int c=0;
		    for(int i=2;i*i<n;i++){
		        if(n%i==0){
		            b=i;
		            c=n/i;
		            break;
		        }
		    }
		    if(a==b || b==c || c==a){
		        System.out.println("-1");
		    }
		    else{
		        System.out.println(a+" "+b+" "+c);
		    }
		}
	}
}
