import java.util.Scanner;
class ButterflyPyramidSym{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=5;i>=1;i--)
        {
            for(int k=1;k <= (2 *n)-(2*i) ;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j < 2*i;j++)
            {
                    System.out.print("@");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++)
        {
            for(int k=1;k <= 2 * (n-i);k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j< 2*i;j++)
            {
                    System.out.print("@");
            }
            System.out.println();
        }
    }
}