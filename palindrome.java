import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome.");
        System.out.println("Enter a number.");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rem=0;
        String s="";
        String b=Integer.toString(a);
        while(a!=0){
            rem=a%10;
            s=s+Integer.toString(rem);
            a=a/10;
        }
        if(s.equals(b)){
            System.out.println("The given number is a palindrome.");
        }
        else{
            System.out.println("The given number is not a palindrome.");
        }
        sc.close();

    }
    
}
