import java.util.*;
public class greatest3 {
    public static void main(String[] args) {
        System.out.println("Greatest of three numbers");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("Enter the third number:");
        int c=sc.nextInt();
        int greatest=0;
        if(a>b){
            if(a>c){
                greatest=a;
            }
            else{
                greatest=c;
            }
        }
        else if(b>a){
            if(b>c){
                greatest=b;
            }
            else{
                greatest=c;
            }
        }
        System.out.println("The greatest number is " +greatest);
        sc.close();

    }
    
}
