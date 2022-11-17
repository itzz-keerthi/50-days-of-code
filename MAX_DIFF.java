/* TASK
Chef prepared two dishes yesterday. Chef had assigned the \textbf{tastiness}tastiness T_1T 
1
​
  and T_2T 
2
​
  to the first and to the second dish respectively. The tastiness of the dishes can be any \textbf{integer}integer between 00 and NN (both inclusive).

Unfortunately, Chef has forgotten the values of T_1T 
1
​
  and T_2T 
2
​
  that he had assigned to the dishes. However, he remembers the sum of the tastiness of both the dishes - denoted by SS.

Chef wonders, what can be the maximum possible absolute difference between the tastiness of the two dishes. Can you help the Chef in finding the maximum absolute difference?

It is guaranteed that at least one pair \{T_1, T_2\}{T 
1
​
 ,T 
2
​
 } exist such that T_1 + T_2 = S, 0 \leq T_1, T_2 \leq NT 
1
​
 +T 
2
​
 =S,0≤T 
1
​
 ,T 
2
​
 ≤N.

Input Format
The first line of input contains a single integer TT, denoting the number of testcases. The description of the TT testcases follows.
The first and only line of each test case contains two space-separated integers NN, SS, denoting the maximum tastiness and the sum of tastiness of the two dishes, respectively.
Output Format
For each testcase, output a single line containing the maximum absolute difference between the tastiness of the two dishes.

Constraints
1 \leq T \leq 10^31≤T≤10 
3
 
1 \leq N \leq 10^51≤N≤10 
5
 
1 \leq S \leq 2 \cdot 10^51≤S≤2⋅10 
5
 
Sample 1:
Input
Output
3
3 1
4 4
2 3
1
4
1
Explanation:
Test Case 11: The possible pairs of \{T_1, T_2\}{T 
1
​
 ,T 
2
​
 } are \{0, 1\}{0,1} and \{1, 0\}{1,0}. Difference in both the cases is 11, hence the maximum possible absolute difference is 11.

Test Case 22: The possible pairs of \{T_1, T_2\}{T 
1
​
 ,T 
2
​
 } are \{0, 4\}{0,4}, \{1, 3\}{1,3}, \{2, 2\}{2,2}, \{3, 1\}{3,1} and \{4, 0\}{4,0}. The maximum possible absolute difference is 44.

Test Case 33: The possible pairs of \{T_1, T_2\}{T 
1
​
 ,T 
2
​
 } are \{1, 2\}{1,2} and \{2, 1\}{2,1}. Difference in both the cases is 11, and hence the maximum possible absolute difference is 11.  */



import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++){
		    int n=scan.nextInt();
		    int s=scan.nextInt();
		    if(s<=n){
		        System.out.println(s);
		    }
		    else{
		        System.out.println(n-(s-n));
		    }
		}
	}
}
