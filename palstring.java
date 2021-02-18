import java.util.*;
public class palstring {
    public static void main(String[] args) {
        System.out.println("Palindrome String");
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String a=new String();
        a=sc.nextLine();
        int n=a.length();
        int count=0;
        for(int i=0;i<n;i++){
            char b=a.charAt(i);
            char c=a.charAt(n-1-i);
            if(b==c){
                count++;
            }
        }
        if(count==n){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        sc.close();
    }
    
    
}
