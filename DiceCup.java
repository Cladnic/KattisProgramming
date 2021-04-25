import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        int die1 = scannerInput.nextInt();
        int die2 = scannerInput.nextInt();

        for(int i=Math.min(die1,die2); i<Math.max(die1,die2)+1; i++){
            System.out.println(i+1);
        }
    }
}
