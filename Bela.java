import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        String[] parameters = scannerInput.nextLine().split(" ");
        int score = 0;
        String readLine;
        Map<Character, Integer> dominantMap = new HashMap<>();
        dominantMap.put('A',11);
        dominantMap.put('K',4);
        dominantMap.put('Q',3);
        dominantMap.put('J',20);
        dominantMap.put('T',10);
        dominantMap.put('9',14);
        dominantMap.put('8',0);
        dominantMap.put('7',0);

        Map<Character, Integer> nonDominantMap = new HashMap<>();
        nonDominantMap.put('A',11);
        nonDominantMap.put('K',4);
        nonDominantMap.put('Q',3);
        nonDominantMap.put('J',2);
        nonDominantMap.put('T',10);
        nonDominantMap.put('9',0);
        nonDominantMap.put('8',0);
        nonDominantMap.put('7',0);

        for(int i=0; i<Integer.parseInt(parameters[0])*4; i++){
            readLine = scannerInput.nextLine();
            if(readLine.charAt(1) == parameters[1].toCharArray()[0]){
                score += dominantMap.get(readLine.charAt(0));
            }else{
                score += nonDominantMap.get(readLine.charAt(0));
            }
        }
        System.out.println(score);
    }
}
