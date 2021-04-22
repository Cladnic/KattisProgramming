import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        int amount = Integer.parseInt(scannerInput.nextLine());
        String temp = scannerInput.nextLine();
        String[] temperatures = temp.split(" ");
        int count=0;
        for(int i=0; i<amount; i++){
            if(Integer.parseInt(temperatures[i])<0){
                count++;
            }
        }
        System.out.println(count);
    }
}
