import java.util.*;
public class primeinrange {
    public static void main(String[] args) {
        System.out.println("Prime number in the given range");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower bound:");
        int a=sc.nextInt();
        System.out.println("Enter the upper bound:");
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            int counter=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    counter++;
                }
            }
            if(counter>2){
                System.out.println(i+ " is not a prime number.");
            }
            else{
                System.out.println(i+ " is a prime number.");
            }
        }
        sc.close();
    }
    
}
