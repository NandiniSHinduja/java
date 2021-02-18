import java.util.*;
public class armstrongrange {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers in a range");
        System.out.println("Enter the lower bound");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter the upper bound");
        int b=sc.nextInt();
        System.out.println("The Armstrong numbers within the given range are:");
        for(int i=a;i<=b;i++){
            int temp=i;
            int pow=0;
            int rem=0;
            int result=0;
            while(temp!=0){
                rem=temp%10;
                pow=rem*rem*rem;
                result=pow+result;
                temp=temp/10;
            }
            if(result==i){
                System.out.println(i);
                continue;
            }
        }
        sc.close();
    }
    
}
