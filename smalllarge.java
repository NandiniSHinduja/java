import java.util.*;
public class smalllarge {
    public static void main(String[] args) {
        System.out.println("Smallest and Largest element in an array.");
        System.out.println("Enter the number of elements in an array.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int smallest=a[0];
        int largest=a[0];
        for(int i=0;i<n;i++){
            if(a[i]<smallest){
                smallest=a[i];
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        System.out.println("The largest element in the array is " +largest);
        System.out.println("The smallest element in the array is " +smallest);
        sc.close();
    }
    
}
