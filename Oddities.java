import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        int amount = scannerInput.nextInt();
        int nr = 0;

        for(int i=0; i<amount; i++){
            nr = scannerInput.nextInt();
            if(nr%2==0){
                System.out.println(nr + " is even");
            }else{
                System.out.println(nr + " is odd");
            }
        }
    }
}
