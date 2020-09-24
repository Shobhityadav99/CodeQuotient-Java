import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
   int  b=(int)(0.1f*a);
   int c=(int)(0.2f*a);
    int d=(int)(a+b+c);
    System.out.println(d);
  }
}