import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iterationSc = new Scanner(System.in);
        int row = 2;
        int iterations = Integer.parseInt(iterationSc.nextLine());
        for(int i=0; i<iterations; i++){
            row = row*2-1;
        }
        int points = (int)Math.pow(row,2);
        System.out.println(points);
    }
}
