import java.util.*;
public class nonrepeating {
    public static void main(String[] args) {
        System.out.println("Non repeating elements in the array.");
        System.out.println("Enter the number of elements required:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n[]=new int[a];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<a;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("The non repeating elements are:");
        for(int i=0;i<a;i++){
            int count=0;
            for(int j=0;j<a;j++){
                if(n[i]==n[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(n[i]);
            }
        }
        sc.close();

    }
}
