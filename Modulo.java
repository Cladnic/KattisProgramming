import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        Set<Integer> distinctNumbers = new HashSet<>();
        int count = 0;

        while(scannerInput.hasNext()){
            distinctNumbers.add(scannerInput.nextInt()%42);
            if(count == 9){
                break;
            }
            count++;
        }
        System.out.println(distinctNumbers.size());
    }
}
