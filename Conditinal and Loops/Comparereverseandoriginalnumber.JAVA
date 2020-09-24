import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        int n=sc.nextInt();
        int count=0;
        int s=n;
        while(n>0){
          count++;
          n=n/10;
        }
        int reverse=0;
        int original=s;
        while(count-->0){
          int k=s%10;
          reverse=reverse*10+k;
          s=s/10;
        }
        if(reverse==original)
        System.out.println("Equal");
        else
          System.out.println("Not Equal");
      }
    }
}