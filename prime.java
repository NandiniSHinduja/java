import java.util.*;
public class prime {
    public static void main(String[] args) {
        System.out.println("Prime number");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int counter=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                counter++;
            }
        }
        if(counter>2){
            System.out.println("The given number is not a prime number.");
        }
        else{
            System.out.println("The given number is a prime number.");
        }
        sc.close();
    }
    
}
