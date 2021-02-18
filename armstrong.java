import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        System.out.println("Armstrong number");
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rem=0;
        int pow=0;
        int result=0;
        int temp=a;
        while(a!=0){
            rem=a%10;
            pow=rem*rem*rem;
            result=result+pow;
            a=a/10;
        }
        if(result==temp){
            System.out.println("The given number is an Armstrong number");
        }
        else{
            System.out.println("The given number is not an Armstrong number.");
        }
        sc.close();
    }
    
}
