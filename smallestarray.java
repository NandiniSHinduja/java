import java.util.*;
public class smallestarray{
    public static void main(String[] args) {
        System.out.println("Smallest element in an array.");
        System.out.println("Enter the number of elements required for your array:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n[]=new int [a];
        System.out.println("Enter the array elements");
        for(int i=0;i<a;i++){
            n[i]=sc.nextInt();
        }
        int smallest=n[0];
        for(int i=0;i<a;i++){
            if(n[i]<smallest){
                smallest=n[i];
            }
        }
        System.out.println("The smallest element in the array is " +smallest);
        sc.close();

    }
}