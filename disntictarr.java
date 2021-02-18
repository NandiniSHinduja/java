import java.util.*;
public class disntictarr {
    public static void main(String[] args) {
        System.out.println("Distinct elements in an array.");
        System.out.println("Enter the number of elements");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n[]=new int[a];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<a;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("The distinct elements in the given array are:");
        for(int i=0;i<a;i++){
            int counter=0;
            for(int j=0;j<a;j++){
                if(n[i]==n[j]){
                    counter++;
                }
            }
            if(counter==1){
                System.out.println(n[i]);
            }
        }
        sc.close();
        
    }
    
}
