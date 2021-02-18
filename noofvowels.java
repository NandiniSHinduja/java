import java.util.*;
public class noofvowels {
    public static void main(String[] args) {
        System.out.println("Number of vowels.");
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='a'){
                count++;
            }
            if(a=='e'){
                count++;
            }
            if(a=='i'){
                count++;
            }
            if(a=='o'){
                count++;
            }
            if(a=='u'){
                count++;
            }
        }
        System.out.println("The number of vowels in the given string are " +count);
        sc.close();
    }
    
}
