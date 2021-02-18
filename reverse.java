import java.util.*;
public class reverse {
    public static void main(String[] args) {
        System.out.println("Reverse of a number");
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String s="";
        int rem=0;
        while(a!=0){
            rem=a%10;
            s=s+Integer.toString(rem);
            a=a/10;
        }
        
        System.out.println(s);
        sc.close();
    }
    
}
