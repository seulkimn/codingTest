import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        if( 45 <= M && M <= 59) {
        	M = M-45;
        }else if (M <45 ) {
        	H--;
        	M = (60-45) + M;
        	if (H < 0) {
        		H = 23;
        	}
        }
        System.out.println(H + " " + M);
    }
}