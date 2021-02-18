import java.util.*;
public class toggle {
    public static void main(String[] args) {
        System.out.println("Toggle.");
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s2="";
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            boolean b=Character.isUpperCase(a);
            if(b==true){
                a=Character.toLowerCase(a);
            }
            else{
                a=Character.toUpperCase(a);
            }
            s2=s2+a;  
        }
        System.out.println(s2);
        sc.close();
    }    
}
