import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        String firstLine = scannerInput.nextLine();
        String[] parameters = firstLine.split(" ");
        int count = 0;
        double maxLength = Math.sqrt(Math.pow(Integer.parseInt(parameters[1]),2)+Math.pow(Integer.parseInt(parameters[2]),2));

        while(scannerInput.hasNext()) {
            if(Integer.parseInt(scannerInput.nextLine())<=maxLength){
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }

            if(count == Integer.parseInt(parameters[0])){
                break;
            }
            count++;
        }
    }
}
