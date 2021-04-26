import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        String moves = scannerInput.nextLine();
        int position = 1;

        for(char c : moves.toCharArray()){
            if(c == 'A'){
                if(position == 1){
                    position = 2;
                }else if(position == 2){
                    position = 1;
                }
            }else if(c == 'B'){
                if(position == 2){
                    position = 3;
                }else if(position == 3){
                    position = 2;
                }
            }else if(c == 'C'){
                if(position == 1){
                    position = 3;
                }else if(position == 3){
                    position = 1;
                }
            }
        }
        System.out.println(position);
    }
}
