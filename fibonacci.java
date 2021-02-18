import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci series upto nth term");
        System.out.println("Enter the value of n:");
        int a1=0;
        int a2=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(a1);
        System.out.println(a2);
        int r=n-3;
        for(int i=1;i<=r;i++){
            a1=a1+a2;
            a2=a1+a2;
            System.out.println(a1);
            System.out.println(a2);
        }
        sc.close();
    }
    
}
