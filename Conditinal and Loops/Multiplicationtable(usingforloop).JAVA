import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int a,b,i,c;
    a=sc.nextInt();
    b=sc.nextInt();
    for(i=1;i<=b;i++)
    {
     c=a*i;
      System.out.println(c);
    }
    
  }
}