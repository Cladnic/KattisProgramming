import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        String firstLine = scannerInput.nextLine();
        String[] parameters = firstLine.split(" ");
        String[] content = new String[Integer.parseInt(parameters[0])];
        int counter = 0;

        while(scannerInput.hasNext()){
            content[counter] = scannerInput.nextLine();
            counter++;
            if(counter == Integer.parseInt(parameters[0])){
                break;
            }
        }

        counter = 0;
        String[] newContent = new String[Integer.parseInt(parameters[0])*Integer.parseInt(parameters[2])];
        for(String s : content){
            for(int i=0; i<Integer.parseInt(parameters[2]); i++) {
                newContent[counter] = s;
                counter++;
            }
        }
        content = newContent;
        counter = 0;
        for(String s : content) {
            StringBuilder newString = new StringBuilder();
            for(int i=0; i<s.length(); i++) {
                newString.append(String.valueOf(s.charAt(i)).repeat(Math.max(0, Integer.parseInt(parameters[3]))));
            }
            System.out.println(newString);
            content[counter] = newString.toString();
            counter++;
        }
    }
}
