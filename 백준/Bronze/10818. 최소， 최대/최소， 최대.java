import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] array = new int[N];
        
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        
        int Max= array[0];
        int Min = array[0];
        
        for(int i=1; i < array.length; i++){
            if(array[i]>Max){
                Max = array[i];
            }else if(array[i]<Min){
                Min = array[i];
            }
        }
        
        System.out.println(Min+" "+Max);
        
    }
}