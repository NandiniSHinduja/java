import java.util.*;
public class greatest2{
    public static void main(String[] args) {
        System.out.println("Greatest of two numbers:");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        if(a<b){
            System.out.println(b+ " is greater than " +a);
        }
        else if(b<a){
            System.out.println(a+ " is greater than " +b);
        }
        else{
            System.out.println("Both the given numbers are equal.");
        }
        sc.close();
    }
}