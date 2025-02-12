import java.util.Scanner;
class UpperRightTriangularNum{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=0;i--)
        {
            for(int k=0;k <= 2* (n-i);k++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                    System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}