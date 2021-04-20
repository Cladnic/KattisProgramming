import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner greetingSc = new Scanner(System.in);
        StringBuilder greeting = new StringBuilder(greetingSc.nextLine());
        StringBuilder reply = new StringBuilder();
        int eLetters = 0;
        for (int i=0; i<greeting.length(); i++) {
            if(greeting.charAt(i) == 'e') {
               eLetters++;
            }
        }
        eLetters = eLetters*2;
        for(int i=0; i<eLetters; i++){
            if(i==0) {
                reply.append("he");
            }else if(i>0 && i<eLetters-1) {
                reply.append("e");
            }else{
                reply.append("ey");
            }
        }
        System.out.println(reply);
    }
}
