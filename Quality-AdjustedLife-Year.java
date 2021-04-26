import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        int amount = Integer.parseInt(scannerInput.nextLine());
        String[] input;
        double qaly = 0;

        for(int i=0; i<amount; i++){
            input = scannerInput.nextLine().split(" ");
            qaly += Double.parseDouble(input[0])*Double.parseDouble(input[1]);
        }
        System.out.println(qaly);
    }
}
