public class primerange{
    public static void main(String[] args) {
        System.out.println("Prime nos from 1 to 100 are:");
        for(int i=1;i<=100;i++){
            int counter=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    counter++;
                }
            }
            if(counter==2){
                System.out.println(i);
            }
        }
    }
}