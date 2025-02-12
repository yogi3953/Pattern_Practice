import java.util.Scanner;
class LowerRightTriangularNum{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(int k=0;k <= 2* (n-i);k++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}