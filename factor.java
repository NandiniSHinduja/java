import java.util.*;
public class factor {
    public static void main(String[] args) {
        System.out.println("Factors of a number");
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int counter=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i+ " is a factor of " +n);
                counter++;
            }
        }
        System.out.println(n+ " has " +counter+ " factors");
        sc.close();
    }
    
}
