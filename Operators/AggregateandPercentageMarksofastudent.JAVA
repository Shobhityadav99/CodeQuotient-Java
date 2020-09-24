import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
    int a,b,c,d,e,tot;
    a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextInt();
     d=sc.nextInt();
     e=sc.nextInt();
    tot=a+b+c+d+e;
    int agg=(int)(tot/5);
    System.out.print(tot +" "+agg);
  }
}