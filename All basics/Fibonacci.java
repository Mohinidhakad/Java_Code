import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a no.");
        int n=s.nextInt();
        int a=0;
        int b=1;
        int sum;
        System.out.print(a+" "+b);
        for(int i=2;i<=n;i++){
            sum=a+b;
            System.out.print(" "+sum);
            a=b;
            b=sum;

        }
        
              }
          }
