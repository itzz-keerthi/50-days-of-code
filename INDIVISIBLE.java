/* PROBLEM
Alice thinks Bob has very weak math skills.
Alice gave Bob three numbers A, B,A,B, and CC and challenged him to find any positive integer KK strictly less than 100100 such that none of the three numbers are divisible by KK.

Help Bob find one such integer KK.

Under the given constraints, a valid KK will always exist.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
The first and only line of each test case contains three space-separated integers A, B,A,B, and CC.
Output Format
For each test case, output on a new line any positive integer KK less than 100100 that does not divide any of A, B,A,B, or CC.

Constraints
1 \leq T \leq 10001≤T≤1000
2 \leq A , B , C \leq 1002≤A,B,C≤100
Sample 1:
Input
Output
3
2 3 4
5 7 10
3 6 9
5
4
10
Explanation:
Test case 11: None of 2, 3,2,3, or 44 are divisible by 55.

Test case 22: None of 5, 7,5,7, or 1010 are divisible by 44.

Test case 33: None of 3, 6,3,6, or 99 are divisible by 1010.   */

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
		    int c=sc.nextInt();
		    for(int i=1;i<100;i++){
		        if(((a%i)!=0) && ((b%i)!=0) && ((c%i)!=0)){
		            System.out.println(i);
		            break;
		        }
		    }
		}
	}
}
