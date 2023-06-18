class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab = a + "" + b;
        int eab = 2 * a * b;
        
        int ab1 = Integer.parseInt(ab);
        
        if(ab1 > eab){
            answer = ab1;
        }else if ( eab > ab1){
            answer = eab;
        }else if (ab1 == eab){
            answer = ab1;
        }
        
        return answer;
    }
}