import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        int pressed = scannerInput.nextInt();
        int startTime = 0;
        int stopTime = 0;
        int time = 0;

        if(pressed%2 == 0){
            for(int i=0; i<pressed/2; i++){
                startTime = scannerInput.nextInt();
                stopTime = scannerInput.nextInt();
                time += stopTime-startTime;
            }
            System.out.println(time);
        }else {
            System.out.println("still running");
        }
    }
}
