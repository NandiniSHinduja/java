import java.util.*;
public class areacircle {
    public static void main(String[] args) {
        System.out.println("Area of a circle.");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        int r=sc.nextInt();
        double area=3.14*r*r;
        System.out.println("The area of the circle with the given radius is " +area);
        sc.close();
    }
    
}
