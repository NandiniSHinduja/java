import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        System.out.println("Odd or even");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("The given number is an even number");
        }
        else if(n%2!=0){
            System.out.println("The given number is an odd number");
        }
        sc.close();
    }
    
}
