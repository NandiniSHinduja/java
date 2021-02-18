import java.util.*;
public class positivenegative{
    public static void main(String[] args) {
        System.out.println("Positive or negative number");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        if(a>0){
            System.out.println("The given number is positive");
        }
        else if(a<0){
            System.out.println("The given number is negative");
        }
        else{
            System.out.println("The given number is zero.");
        }
        sc.close();
    }
}