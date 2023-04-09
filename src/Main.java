import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number(N)");
        int N= sc.nextInt();
        for(int i=1;i<=N;i++)
        {
            System.out.println(N+" X "+i+" = "+i*N);
        }
    }
}