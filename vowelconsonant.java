import java.util.*;
public class vowelconsonant {
    public static void main(String[] args) {
        System.out.println("Vowels and consonants.");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        String a=sc.nextLine();
        if(a.equals("a")){
            System.out.println("vowel");
        }
        else if(a.equals("e")){
            System.out.println("vowel");
        }
        else if(a.equals("i")){
            System.out.println("vowel");
        }
        else if(a.equals("o")){
            System.out.println("vowel");
        }
        else if(a.equals("u")){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonant");
        }
        sc.close();
    }
    
}
