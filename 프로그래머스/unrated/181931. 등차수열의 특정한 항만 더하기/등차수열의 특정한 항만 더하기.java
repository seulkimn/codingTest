class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        boolean val = (1<=a && a<=100 && 1<=d && d <= 100 && 1 <= included.length && included.length <= 100);
        
        if(val) {
        	for(int i=0; i< included.length; i++) {
        		if(included[i])
        			answer += a+(d*i);
        	}
        }
        
        return answer;
        
    }
}