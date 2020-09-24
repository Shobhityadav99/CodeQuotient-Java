import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
      int n,i,fact=1;
    n=a.nextInt();
      for(i=1;i<=n;i++)
      {
        fact=fact*i;
      }
      System.out.println(fact);
    }
}