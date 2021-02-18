import java.util.*;
public class eveoddarr {
    public static void main(String[] args) {
        System.out.println("Number of even and odd elements in an array");
        System.out.println("Enter the number of elements");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int a[]=new int[x];
        int even=0;
        int odd=0;
        for(int i=0;i<x;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("The number of even elements in the array is " +even);
        System.out.println("The number of odd elements in the array is " +odd);
        sc.close();
    }
    
}
