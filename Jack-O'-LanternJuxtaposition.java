import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner designSc = new Scanner(System.in);
        String designInput = designSc.nextLine();
        String[] designs = designInput.split(" ");

        int combinations = Integer.parseInt(designs[0])*Integer.parseInt(designs[1])*Integer.parseInt(designs[2]);
        System.out.println(combinations);
    }
}
