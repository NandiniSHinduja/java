import java.util.*;
public class friendlypair {
    public static void main(String[] args) {
        System.out.println("Friendly Pair.");
        System.out.println("Enter a number.");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter another number.");
        int b=sc.nextInt();
        int sum=0;
        int sum2=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                sum=sum+i;
            }
        }
        for(int j=1;j<b;j++){
            if(b%j==0){
                sum2=sum2+j;
            }
        }
        if(sum==b && sum2==a){
            System.out.println("Friendly Pair.");
        }
        else{
            System.out.println("Not a Friendly Pair.");
        }
        sc.close();
    }
    
}
