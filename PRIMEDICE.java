/* TASK
Hackerman wants to know who is the better player between Bob and Alice with the help of a game.

The game proceeds as follows:

First, Alice throws a die and gets the number AA
Then, Bob throws a die and gets the number BB
Alice wins the game if the sum on the dice is a prime number; and Bob wins otherwise.
Given AA and BB, determine who wins the game.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
The first and only line of each test case contains two space-separated integers AA and BB.
Output Format
For each test case, output on a new line the winner of the game: Alice or Bob.

Each letter of the output may be printed in either uppercase or lowercase, i.e, Alice, ALICE, AlIce and aLIcE will all be considered equivalent.

Constraints
1 \leq T \leq 361≤T≤36
1 \leq A \leq 61≤A≤6
1 \leq B \leq 61≤B≤6
Sample 1:
Input
Output
3
2 1
1 1
2 2
Alice
Alice
Bob
Explanation:
Test case 11: A = 2A=2 and B = 1B=1. Their sum is 2+1 = 32+1=3 which is a prime number, so Alice wins.

Test case 22: A = 1A=1 and B = 1B=1. Their sum is 1+1 = 21+1=2 which is a prime number, so Alice wins.

Test case 33: A = 2A=2 and B = 2B=2. Their sum is 2 + 2 = 42+2=4 which is not a prime number, so Bob wins.  */

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
		    int sum=a+b;
		    int p=0;
		    for(int i=2;i<sum;i++){
		        if(sum%i==0){
		            p=1;
		        }
		    }
		    if(p==1){
		        System.out.println("Bob");
		    }
		    else{
		        System.out.println("Alice");
		    }
		}
	}
}
