import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        int[] rightAmount = {1,1,2,2,2,8};
        StringBuilder correctionAmount = new StringBuilder();

        for(int i=0; i<6; i++){
            correctionAmount.append(rightAmount[i]-scannerInput.nextInt() + " ");
        }
        System.out.println(correctionAmount);
    }
}
