import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    	
    	int array[] = new int[9];
    	int Max = array[0];
    	int index = 0;
        
    	for(int i=0; i<array.length; i++) {
    		array[i] = sc.nextInt();
    		if(Max < array[i]) {
    			Max = array[i];
    			index = i + 1;
    		}
    	}
    	
    	System.out.println(Max);
    	System.out.println(index);
    }
}