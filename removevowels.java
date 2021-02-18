import java.util.*;
public class removevowels {
    public static void main(String[] args) {
        System.out.println("Remove Vowels.");
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s2="";
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            String s1=Character.toString(a);
            if(s1.equals("a")){
                s1="";
            }
            if(s1.equals("e")){
                s1="";
            }
            if(s1.equals("i")){
                s1="";
            }
            if(s1.equals("o")){
                s1="";
            }
            if(s1.equals("u")){
                s1="";
            }
            s2=s2+s1;
        }
        System.out.println(s2);
        sc.close();
    }
    
}
