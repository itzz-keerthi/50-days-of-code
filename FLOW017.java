/* TASk
Three numbers A, B and C are the inputs. Write a program to find second largest among them.

Input Format
The first line contains an integer T, the total number of testcases. Then T lines follow, each line contains three integers A, B and C.

Output Format
For each test case, display the second largest among A, B and C, in a new line.

Constraints
1 ≤ T ≤ 1000
1 ≤ A,B,C ≤ 1000000
Sample 1:
Input
Output
3 
120 11 400
10213 312 10
10 3 450
120
312
10     */

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
	        ArrayList<Integer> list=new ArrayList<Integer>();
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int c=sc.nextInt();
	        list.add(a);list.add(b);list.add(c);
	        Collections.sort(list);
	        Collections.reverse(list);
	        System.out.println(list.get(1));
	        
	    }
	}
}
