import java.util.*;
public class length {
    public static void main(String[] args) {
        System.out.println("Length of a string.");
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=s.length();
        System.out.println("The length of the given string is " +a);
        sc.close();
    }
    
}
