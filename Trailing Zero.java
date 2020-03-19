import java.util.Scanner;


class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int p;
       

       for(int i=0; i<n; i++)
       {
           p = sc.nextInt();
           long count = p/5 + p/25 + p/125 + p/625;
		   System.out.println(count);
         
       }
        
        
    }
}

//Input:
1
9
Output:
1//
