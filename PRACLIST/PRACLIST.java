/* PROBLEM

CodeChef recently revamped its practice page to make it easier for users to identify the next problems they should solve by introducing some new features:

Recent Contest Problems - contains only problems from the last 2 contests
Separate Un-Attempted, Attempted, and All tabs
Problem Difficulty Rating - the Recommended dropdown menu has various difficulty ranges so that you can attempt the problems most suited to your experience
Popular Topics and Tags
Our Chef is currently practicing on CodeChef and is a beginner. The count of ‘All Problems’ in the Beginner section is 
�
X. Our Chef has already ‘Attempted’ 
�
Y problems among them. How many problems are yet ‘Un-attempted’?

Input Format
The first and only line of input contains two space-separated integers 
�
X and 
�
Y — the count of 'All problems' in the Beginner's section and the count of Chef's 'Attempted' problems, respectively.
Output Format
Output a single integer in a single line — the number of problems that are yet 'Un-attempted'

Constraints
1
≤
�
≤
�
≤
1000
1≤Y≤X≤1000
Subtasks
Subtask 1 (100 points):
Original constraints.
Sample 1:
Input
Output
10 4
6
Sample 2:
Input
Output
10 10
0
Sample 3:
Input
Output
1000 990
10
Sample 4:
Input
Output
500 1
499
Explanation:
Test case 
1
1: There are 
10
10 problems in total in the Beginner's section, out of which 
4
4 have been attempted. Hence, there are 
6
6 Un-attempted problems.

Test case 
2
2: There are 
10
10 problems in total in the Beginner's section, out of which all have been attempted. Hence, there are 
0
0 Un-attempted problems.

Test case 
3
3: There are 
1000
1000 problems in total in the Beginner's section, out of which 
990
990 have been attempted. Hence, there are 
10
10 Un-attempted problems.

Test case 
4
4: There are 
500
500 problems in total in the Beginner's section, out of which only 
1
1 has been attempted. Hence, there are 
499
499 Un-attempted problems.        */

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
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(x-y);
	}
}
