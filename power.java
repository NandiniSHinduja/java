import java.util.*;
public class power {
    public static void main(String[] args) {
        System.out.println("Power of a number.");
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter the power:");
        int b=sc.nextInt();
        int result=a;
        for(int i=1;i<b;i++){
            result=result*a;
        }
        System.out.println("The result of " +a+ " raised to the power " +b+ " is " +result);
        sc.close();
    }
    
}
