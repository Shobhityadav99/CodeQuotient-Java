import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
     int a,i,sum=0;
      a=sc.nextInt();
      for(i=1;i<=a;i++)
      {
        sum=sum+i;
      }
      System.out.println(sum);
    }
}