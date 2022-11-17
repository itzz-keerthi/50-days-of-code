/* TASK
Chef has been searching for a good motivational movie that he can watch during his exam time. His hard disk has XX GB of space remaining. His friend has NN movies represented with (S_i, R_i)(S 
i
​
 ,R 
i
​
 ) representing (space required, IMDB rating). Help Chef choose the single best movie (highest IMDB rating) that can fit in his hard disk.

Input
The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
The first line of each test case contains two space-separated integers NN and XX.
NN lines follow. For each valid ii, the ii-th of these lines contains two space-separated integers S_iS 
i
​
  and R_iR 
i
​
 .
Output
For each test case, print a single line containing one integer - the highest rating of an IMDB movie which Chef can store in his hard disk.

Constraints
1 \leq T \leq 101≤T≤10
1 \leq N \leq 5 \cdot 10^41≤N≤5⋅10 
4
 
1 \leq X \leq 10^91≤X≤10 
9
 
1 \leq S_i, R_i \leq 10^91≤S 
i
​
 ,R 
i
​
 ≤10 
9
  for each valid ii
X \ge S_iX≥S 
i
​
  for atleast one valid ii
Subtasks
Subtask #1 (100 points): original constraints

Sample 1:
Input
Output
3
1 1
1 1
2 2
1 50
2 100
3 2
1 51
3 100
2 50
1
100 
51
Explanation:
Example case 1: Since there is only 11 movie available and requires space equivalent to the empty space in the hard disk, Chef can only obtain maximum IMDB rating of 11.

Example case 2: Since out of the 22 available movies, both can fit in the free memory, we only care to take the one with higher rating, i.e, rating of max(50, 100) = 100max(50,100)=100.

Example case 3: Since out of the 33 available movies, only the first and the last movies fit in the free memory, we only care to take the one with higher rating amongst these 22, i.e, rating of \max(51, 50) = 51max(51,50)=51.  */

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
	    for(int i=0;i<t;i++){
	        ArrayList<Integer> list=new ArrayList<Integer>();
	        int n=sc.nextInt();
	        int x=sc.nextInt();
	        for(int j=0;j<n;j++){
	            int s=sc.nextInt();
	            int r=sc.nextInt();
	            if(s<=x){
	                list.add(r);
	            }
	        }
	        int max=list.get(0);
	        for(int k=0;k<list.size();k++){
	            if(list.get(k)>max){
	                max=list.get(k);
	            }
	        }
	        System.out.println(max);
	    }
	}
}
