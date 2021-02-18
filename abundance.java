import java.util.*;
public class abundance {
    public static void main(String[] args) {
        System.out.println("Abundance Number");
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                sum=sum+i;
            }
        }
        if(a<sum){
            System.out.println("Abundant number.");
        }
        else{
            System.out.println("Not abundant number.");
        }
        sc.close();
    }
    
}
