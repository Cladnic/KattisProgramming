import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        int width = scannerInput.nextInt();
        int pieces = scannerInput.nextInt();
        int area = 0;

        for(int i=0; i<pieces; i++){
            area += scannerInput.nextInt()*scannerInput.nextInt();
        }
        System.out.println(area/width);
    }
}
