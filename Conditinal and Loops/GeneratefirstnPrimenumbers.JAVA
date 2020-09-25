import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      for(int i=2;i<=n;i++)
      {
        int t=0;
        for(int j=2;j<=n;j++)
        {
          if(i%j==0 && i!=j)
            t=t+1;
        }
        if(t==0)
        {
          if(k>0)
          {
            System.out.println(i);
            k--;
          }
        }
      }
    }
}