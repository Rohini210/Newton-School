/* 
You are given an array Arr of n integers. You can perform the following operations on the array any number of times. Operation 1: Add or Subtract 2 from any element of the array any number of times Operation 2: Remove a number from the array Your aim is to make all the elements of the array equal after performing the above operations any number of times. Report the maximum size of the array possible.
Input
The first line of input contains N, the size of the array
The second line of input contains N space-separated integers
Constraints
2 ≤ N ≤ 100000
1 ≤ Arr[i] ≤ 1000000000
Output
The output should contain only one integer, the maximum size of the array possible such that all elements of the array are equal.
*/



import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int c1=0, c2=0;

        for(int i =0; i<n; i++)
        {
            arr[i] = scan.nextInt();
        }

        for(int i=0; i<n; i++)
        {
            if(arr[i] % 2 ==0)
            {
                c1= c1 + 1;
            }
            else
            {
                c2= c2+1;
            }
        }
        if(c1>c2)
        {
            System.out.println(c1);
        }

        else
        {
            System.out.println(c2);
        }
    }
}



/*
Input
5
1 2 3 3 2

Output
3
*/
