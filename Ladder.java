import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println((int)Math.ceil((scannerInput.nextInt()/Math.sin(Math.toRadians(scannerInput.nextInt())))));
    }
}
