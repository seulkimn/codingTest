class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab = a + "" + b;
        String ba = b + "" + a;
        
        
        int ab1 = Integer.parseInt(ab);
        int ba1 = Integer.parseInt(ba);
        
        
        if(ab1> ba1) 
        	answer = ab1;
        else 
        	answer = ba1;
        
        return answer;
    }
}