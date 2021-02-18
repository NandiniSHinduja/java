import java.util.*;
public class suminrange {
    public static void main(String[] args) {
        System.out.println("Sum of numbers in a given range.");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower bound:");
        int a=sc.nextInt();
        System.out.println("Enter the upper bound:");
        int b=sc.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++){
            sum=sum+i;
        }
        System.out.println("The sum of the numbers in the given range is: " +sum);
        sc.close();
    }
    
}
