class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //n이 홀수면 n이하의 모든 홀수의 합 구하기.
        
        if(n%2!=0) {
        for(int i=0; i<=n; i++) { // n이하의 홀수의 합
        	if(i%2!=0) 
        		answer +=i; 
        	
        	}
        }else if (n%2==0 ) {
        for(int i=0; i<=n; i++) {	// n이하의 짝수의 합
        	if(i%2 == 0) 
        		answer += (int)Math.pow(i, 2);
        	}
        }
        return answer;
    }
}