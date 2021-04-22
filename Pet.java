import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        int pointsMax = 0;
        int pointsNew = 0;
        int contestant = 0;

        for(int i=0; i<5; i++){
            pointsNew=0;
            for(int j=0; j<4; j++){
                pointsNew += scannerInput.nextInt();
            }
            if(pointsNew>pointsMax){
                pointsMax=pointsNew;
                contestant=i+1;
            }
        }
        System.out.println(contestant + " " + pointsMax);
    }
}
