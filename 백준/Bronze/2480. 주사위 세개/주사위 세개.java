import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int Max = 0;
        int money = 0;
        
        if(a != c && b != c && a != b) {
        	if(a > b && a >c) {
        		Max = a;
        	}else if(b > a && b > c) {
        		Max = b;
        	}else { 
        		Max = c;
        	}
        	money = Max*100;
        	
        }else if(a !=c || a!=b || c !=a) {
        	if(a==b) {
        		money = 1000+a*100;
        	}else if(a==c) {
        		money = 1000+c*100;
        	}else 
        		money = 1000+b*100;
        }else
        	money = 10000+a*1000;
        
        System.out.println(money);
        
    }
}