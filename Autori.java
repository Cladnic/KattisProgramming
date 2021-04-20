import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner KmpSc = new Scanner(System.in);
        String KmpName = KmpSc.nextLine();
        StringBuilder RsaName = new StringBuilder();
        RsaName.append(KmpName.charAt(0));
        for(int i = 0; i < KmpName.length(); i++) {
            if(KmpName.charAt(i) == '-') {
                RsaName.append(KmpName.charAt(i+1));
            }
        }
        System.out.println(RsaName);
    }
}
