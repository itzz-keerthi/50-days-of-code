/*TASK
The purpose of this problem is to verify whether the method you are using to read input data is sufficiently fast to handle problems branded with the enormous Input/Output warning. You are expected to be able to process at least 2.5MB of input data per second at runtime.

Input
The input begins with two positive integers n k (n, k<=107). The next n lines of input contain one positive integer ti, not greater than 109, each.

Output
Write a single integer to output, denoting how many integers ti are divisible by k.

Sample 1:
Input
Output
7 3
1
51
966369
7
9
999996
11
4
Explanation:
The integers divisible by 33 are 51, 966369, 9,51,966369,9, and 999996999996. Thus, there are 44 integers in total.     */

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            int t=sc.nextInt();
            if(t%k==0){
                count++;
            }
        }
        System.out.println(count);
    }
}

