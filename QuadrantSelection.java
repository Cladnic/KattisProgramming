import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner coordinateSc = new Scanner(System.in);
        int x = Integer.parseInt(coordinateSc.nextLine());
        int y = Integer.parseInt(coordinateSc.nextLine());
        if(x>=0 && y>0 || x>0 && y>=0) {
            System.out.println(1);
        }
        else if(x<=0 && y>0 || x<0 && y>=0) {
            System.out.println(2);
        }
        else if(x<=0 && y<0 || x<0 && y<=0) {
            System.out.println(3);
        }
        else if(x>=0 && y<0 || x>0 && y<=0) {
            System.out.println(4);
        }else {
            System.out.println("none");
        }
    }
}
