import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        int data = scannerInput.nextInt();
        int months = scannerInput.nextInt();
        int availableData = 0;

        for(int i=0; i<months; i++){
            availableData = availableData+data-scannerInput.nextInt();
        }
        System.out.println(availableData+data);
    }
}
