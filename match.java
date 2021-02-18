import java.util.*;
public class match {
    public static void main(String[] args) {
        System.out.println("Checking if two strings match.");
        System.out.println("Enter the first string:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println("Enter the second string:");
        String b=sc.nextLine();
        int count=0;
        if(a.length()!=b.length()){
            System.out.println("Not matching.");
        }
        else{
            for(int i=0;i<a.length();i++){
                char s1=a.charAt(i);
                char s2=b.charAt(i);
                if(s1==s2){
                    count++;
                }
            }
            if(count==a.length()){
                System.out.println("Matching");
            }
            else{
                System.out.println("Not Matching");
            }
        }
        sc.close();
    }
}
