import java.util.*;
public class perfect {
    public static void main(String[] args) {
        System.out.println("Perfect Number.");
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        for(int i=1; i<a;i++){
            if(a%i==0){
                sum=sum+i;
            }
        }
        if(sum==a){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
        sc.close();
    }
    
}
