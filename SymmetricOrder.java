import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stringListSc = new Scanner(System.in);
        ArrayList<String[]> lists = new ArrayList<>();
        int setNr = 1;

        while(stringListSc.hasNext()){
            String readLine = stringListSc.nextLine();

            if(Character.isDigit(readLine.charAt(0))) {
                if(Integer.parseInt(readLine) == 0) {
                    break;
                }
                String[] list = new String[Integer.parseInt(readLine)];
                int countEven = 0;
                int countOdd = 0;
                for (int i=0; i<Integer.parseInt(readLine); i++) {
                    if(i%2 == 0){
                        list[countEven] = stringListSc.nextLine();
                        countEven++;
                    }else {
                        list[list.length-1-countOdd] = stringListSc.nextLine();
                        countOdd++;
                    }
                }
                lists.add(list);
            }
        }

        for (String[] sL : lists) {
            System.out.println("SET " + setNr);
            for(String s : sL) {
                System.out.println(s);
            }
            setNr++;
        }
    }
}
