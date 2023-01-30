/* PROBLEM

Chef has an array 
�
A of length 
�
N.

In one operation, Chef can choose any two distinct indices 
�
,
�
i,j 
(
1
≤
�
,
�
≤
�
,
�
≠
�
)
(1≤i,j≤N,i=j) and either change 
�
�
A 
i
​
  to 
�
�
A 
j
​
  or change 
�
�
A 
j
​
  to 
�
�
A 
i
​
 .

Find the minimum number of operations required to make all the elements of the array equal.

Input Format
First line will contain 
�
T, number of test cases. Then the test cases follow.
First line of each test case consists of an integer 
�
N - denoting the size of array 
�
A.
Second line of each test case consists of 
�
N space-separated integers 
�
1
,
�
2
,
…
,
�
�
A 
1
​
 ,A 
2
​
 ,…,A 
N
​
  - denoting the array 
�
A.
Output Format
For each test case, output the minimum number of operations required to make all the elements equal.

Constraints
1
≤
�
≤
100
1≤T≤100
2
≤
�
≤
1000
2≤N≤1000
1
≤
�
�
≤
1000
1≤A 
i
​
 ≤1000
Sample 1:
Input
Output
4
3
1 2 3
4
5 5 5 5
4
2 2 1 1
3
1 1 2
2
0
2
1
Explanation:
Test Case 
1
1: You can make all the elements equal in 
2
2 operations. In the first operation, you can choose indices 
1
,
2
1,2 and convert 
�
1
A 
1
​
  to 
�
2
A 
2
​
 . So the array becomes 
[
2
,
2
,
3
]
[2,2,3]. Now you can choose indices 
1
,
3
1,3 and convert 
�
3
A 
3
​
  to 
�
1
A 
1
​
 , so the final array becomes 
[
2
,
2
,
2
]
[2,2,2].

Test Case 
2
2: Since all the elements are already equal there is no need to perform any operation.

Test Case 
3
3: You can make all the elements equal in 
2
2 operations. In the first operation, you can choose indices 
1
,
3
1,3 and convert 
�
1
A 
1
​
  to 
�
3
A 
3
​
 . So the array becomes 
[
1
,
2
,
1
,
1
]
[1,2,1,1]. Now you can choose indices 
1
,
2
1,2 and convert 
�
2
A 
2
​
  to 
�
1
A 
1
​
 , so the final array becomes 
[
1
,
1
,
1
,
1
]
[1,1,1,1].

Test Case 
4
4: You can make all the elements equal in 
1
1 operation. You can pick indices 
2
,
3
2,3 and convert 
�
3
A 
3
​
  to 
�
2
A 
2
​
  after which the array becomes 
[
1
,
1
,
1
]
[1,1,1].              */

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
		    int n=sc.nextInt();
		    int count=0;
		    int arr[]=new int[n];
		    int freq[]=new int[1001];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		        freq[arr[i]]++;
		    }
		    Arrays.sort(freq);
			System.out.println(n-freq[1000]);
		}
	}
}
