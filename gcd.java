import java.util.*;
public class gcd {
    public static void main(String[] args) {
       System.out.println("LCM");
       System.out.println("Enter a number:");
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       System.out.println("Enter another number:");
       int b=sc.nextInt();
       int rem=1;
       while(rem!=0){
           rem=a%b;
           if(rem!=0){
               a=b;
               b=rem;
           }
       }
       System.out.println("The GCD of the given two numbers is " +b);
       sc.close();
    }
    
}
