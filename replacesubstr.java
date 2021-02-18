import java.util.*;
public class replacesubstr {
    public static void main(String[] args) {
        System.out.println("Replacing a substring within a string.");
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Enter the substring to be replaced:");
        String old=sc.nextLine();
        System.out.println("Enter the new substring:");
        String new1=sc.nextLine();
        String newstr=s.replace(old,new1);
        System.out.println("The new string is: ");
        System.out.println(newstr);
        sc.close();
    }
}
