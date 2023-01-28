/* PROBLEM

No play and eating all day makes your belly fat. This happened to Chef during the lockdown. His weight before the lockdown was 
�
1
w 
1
​
  kg (measured on the most accurate hospital machine) and after 
�
M months of lockdown, when he measured his weight at home (on a regular scale, which can be inaccurate), he got the result that his weight was 
�
2
w 
2
​
  kg (
�
2
>
�
1
w 
2
​
 >w 
1
​
 ).

Scientific research in all growing kids shows that their weights increase by a value between 
�
1
x 
1
​
  and 
�
2
x 
2
​
  kg (inclusive) per month, but not necessarily the same value each month. Chef assumes that he is a growing kid. Tell him whether his home scale could be giving correct results.

Input
The first line of the input contains a single integer 
�
T denoting the number of test cases. The description of 
�
T test cases follows.
The first and only line of each test case contains five space-separated integers 
�
1
w 
1
​
 , 
�
2
w 
2
​
 , 
�
1
x 
1
​
 , 
�
2
x 
2
​
  and 
�
M.
Output
For each test case, print a single line containing the integer 
1
1 if the result shown by the scale can be correct or 
0
0 if it cannot.

Constraints
1
≤
�
≤
1
0
5
1≤T≤10 
5
 
1
≤
�
1
<
�
2
≤
100
1≤w 
1
​
 <w 
2
​
 ≤100
0
≤
�
1
≤
�
2
≤
10
0≤x 
1
​
 ≤x 
2
​
 ≤10
1
≤
�
≤
10
1≤M≤10
Sample 1:
Input
Output
5
1 2 1 2 2
2 4 1 2 2
4 8 1 2 2
5 8 1 2 2
1 100 1 2 2
0
1
1
1
0
Explanation:
Example case 1: Since the increase in Chef's weight is 
2
−
1
=
1
2−1=1 kg and that is less than the minimum possible increase 
1
⋅
2
=
2
1⋅2=2 kg, the scale must be faulty.

Example case 2: Since the increase in Chef's weight is 
4
−
2
=
2
4−2=2 kg, which is equal to the minimum possible increase 
1
⋅
2
=
2
1⋅2=2 kg, the scale is showing correct results.

Example case 3: Since the increase in Chef's weight is 
8
−
4
=
4
8−4=4 kg, which is equal to the maximum possible increase 
2
⋅
2
=
4
2⋅2=4 kg, the scale is showing correct results.

Example case 4: Since the increase in Chef's weight 
8
−
5
=
3
8−5=3 kg lies in the interval 
[
1
⋅
2
,
2
⋅
2
]
[1⋅2,2⋅2] kg, the scale is showing correct results.

Example case 5: Since the increase in Chef's weight is 
100
−
1
=
99
100−1=99 kg and that is more than the maximum possible increase 
2
⋅
2
=
4
2⋅2=4 kg, the weight balance must be faulty.              */

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
		    int w1=sc.nextInt();
		    int w2=sc.nextInt();
		    int x1=sc.nextInt();
		    int x2=sc.nextInt();
		    int m=sc.nextInt();
		    if((w2-w1)>(x2)*m)
		        System.out.println(0);
		    else if((w2-w1)<(x1)*m)
		        System.out.println(0);
		    else
		        System.out.println(1);
		}
	}
}
