import java.util.*;
public class ascii {
    public static void main(String[] args) {
        System.out.println("ASCII value");
        System.out.println("Enter a character:");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        int i=c;
        System.out.println("The ASCII value of the given character is: " +i);
        sc.close();
    }
}
