import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        int amount = scannerInput.nextInt();
        if(amount%2 == 0){
            System.out.println("Bob");
        }else{
            System.out.println("Alice");
        }
    }
}
