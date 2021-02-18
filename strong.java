import java.util.*;
public  class strong {
    public static void main(String[] args) {
        System.out.println("Strong Number.");
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rem=0;
        int result=0;
        int temp=a;
        while(a!=0){
            rem=a%10;
            int fact=1;
            for(int i=rem;i>=1;i--){
                fact=i*fact;
            }
            result=fact+result;
            a=a/10;
        }
        if(result==temp){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not a strong number");
        }
        sc.close();
    }
    
}
