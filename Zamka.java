import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lowerLimit = sc.nextInt();
        int upperLimit = sc.nextInt();
        int targetDigitSum = sc.nextInt();

        for(int i=lowerLimit; i<=upperLimit; i++){
            if(digitSum(i)==targetDigitSum){
                System.out.println(i);
                break;
            }
        }
        for(int i=upperLimit; i>=lowerLimit; i--){
            if(digitSum(i)==targetDigitSum){
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
    public static int digitSum(int nr){
        int sum = 0;
        while(nr>0){
            sum+=nr%10;
            nr/=10;
        }
        return sum;
    }
}
