import java.util.*;
public class sumofn{
    public static void main(String[] args) {
        System.out.println("Sum of N natural numbers");
        System.out.println("Enter the value of N:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=0;
        for(int i=1;i<=n;i++){
            result=result+i;
        }
        System.out.println("The sum of " +n+ " natural numbers is " +result);
        sc.close();
    }
}