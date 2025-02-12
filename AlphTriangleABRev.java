import java.util.Scanner;
class AlphTriangleABRev{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=6;i>=1;i--)
        {
            for(int k=1;k <= n-i ;k++)
            {
                System.out.print(" ");
            }
            for(int j=0; j < i ;j++)
            {
                    System.out.print((char) ('A'+j));
            }
            for(int j=i-2; j >=0 ;j--)
            {
                    System.out.print((char) ('A'+j));
            }
            System.out.println();
        }
}
}