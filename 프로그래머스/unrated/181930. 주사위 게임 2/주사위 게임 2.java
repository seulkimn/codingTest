class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        double d = 0;
        
        if(a==b&&b==c) {
        	d = (a+b+c)*(Math.pow(a,2)+Math.pow(b, 2)+Math.pow(c, 2))*(Math.pow(a,3)+Math.pow(b, 3)+Math.pow(c, 3));
        } else if(a==b||a==c||b==c) {
        	d = (a+b+c)*(Math.pow(a,2)+Math.pow(b, 2)+Math.pow(c, 2));
        }else
        	d = a+b+c;
        
        answer = (int)d;
        
        return answer;
    }
}