import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      while(N-->0){
        int n=sc.nextInt();
        int sq=n*n;
        int temp=sq;
        int y=0;
          int j=10;
        int count=0;
        while(temp>0){
          temp=temp/10;
          count++;
        }
        while(count-->0){
          int k=sq/j;
          int l=sq-k*j;
          j=j*10;
          if(k+l==n){
            y=1;
            System.out.println("1");
            break;
          }
        }
        if(y==0)
          System.out.println("0");
      }
    }
}