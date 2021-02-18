import java.util.*;
public class noofdigits {
    public static void main(String[] args) {
        System.out.println("No of digits in an integer.");
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        while(a!=0){
            a=a/10;
            count++;
        }
        System.out.println("The number of digits in the given integer are " +count);
        sc.close();
    }
    
}
