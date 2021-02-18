import java.util.*;
public class sumofdigits {
    public static void main(String[] args) {
        System.out.println("Sum of digits of a number.");
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rem=0;
        int sum=0;
        int counter=1;
        for(int i=0;i<counter;i++){
            int temp=a;
            a=a/10;
            rem=temp%10;
            sum=sum+rem;
            if(a!=0){
                counter++;
            }
        }
        System.out.println("The sum of the digits in the given number is " +sum);
        sc.close();
    }
    
}
