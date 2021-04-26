import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        String[] parameters = scannerInput.nextLine().split(" ");

        for(int i=1; i<Integer.parseInt(parameters[2])+1; i++){
            if(i%Integer.parseInt(parameters[0])==0){
                if(i%Integer.parseInt(parameters[1])==0){
                    System.out.println("FizzBuzz");
                }else{
                    System.out.println("Fizz");
                }
            }else if(i%Integer.parseInt(parameters[1])==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
