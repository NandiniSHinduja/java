import java.util.*;
public class reversestr {
    public static void main(String[] args) {
        System.out.println("Reverse of a string.");
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String a=new String();
        a=sc.nextLine();
        String s="";
        int n=a.length();
        for(int i=n-1;i>=0;i--){
            char b=a.charAt(i);
            s=s+b;
        }
        System.out.println(s);
        sc.close();
    }
}
