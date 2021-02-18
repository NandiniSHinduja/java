import java.util.*;
public class factorial {
    public static void main(String[] args) {
        System.out.println("Factorial.");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        int fact=1;
        for(int i=a;i>0;i--){
            fact=i*fact;
        }
        System.out.println("The factorial of " +a+ " is " +fact);
        sc.close();
    }
    
}
