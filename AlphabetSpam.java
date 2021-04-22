import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        String input = scannerInput.nextLine();
        double whitespace = 0;
        double lowerCaseLetter = 0;
        double upperCaseLetter = 0;
        double symbols = 0;
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == '_') {
                whitespace++;
            }else if(Character.isLowerCase(input.charAt(i))){
                lowerCaseLetter++;
            }else if(Character.isUpperCase(input.charAt(i))){
                upperCaseLetter++;
            }else{
                symbols++;
            }
        }
        whitespace = whitespace/input.length();
        lowerCaseLetter = lowerCaseLetter/input.length();
        upperCaseLetter = upperCaseLetter/input.length();
        symbols = symbols/input.length();

        System.out.format("%.15f\n%.15f\n%.15f\n%.15f", whitespace, lowerCaseLetter, upperCaseLetter, symbols);
    }
}
