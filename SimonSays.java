import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        int amount = Integer.parseInt(scannerInput.nextLine());
        String readline;

        for(int i=0; i<amount; i++){
            readline = scannerInput.nextLine();
            if(readline.contains("Simon says")){
                System.out.println(readline.substring(11));
            }
        }
    }
}
