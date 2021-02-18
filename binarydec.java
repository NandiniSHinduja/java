import java.util.*;
public class binarydec {
    public static void main(String[] args) {
        System.out.println("Binary to decimal");
        System.out.println("Enter a binary number");
        int temp=0;
        Scanner sc=new Scanner(System.in);
        int binary=sc.nextInt();
        int n=0;
        double ans=0;
        while(binary>0){
            temp=binary%10;
            ans=ans+temp*Math.pow(2,n);
            n++;
            binary=binary/10;
        }
        System.out.println("The converted decimal equivalent is:" +ans);
        sc.close();
    }
    
}
