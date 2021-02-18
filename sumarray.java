import java.util.*;
public class sumarray {
    public static void main(String[] args) {
        System.out.println("Sum of elements in an array.");
        System.out.println("Enter the number of elements required:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        int n[]=new int[a];
        System.out.println("Enter the elements:");
        for(int i=0;i<a;i++){
            n[i]=sc.nextInt();
            sum=sum+n[i];
        }
        System.out.println("The sum of the elements in the array is " +sum);
        sc.close();
    }
}
