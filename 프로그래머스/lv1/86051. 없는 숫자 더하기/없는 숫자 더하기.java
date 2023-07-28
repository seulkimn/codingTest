class Solution {
        public int solution(int[] numbers) {
        int answer = 0;
        int sum = 0;
        
        for(int i=0; i<numbers.length; i++) {
        	sum += numbers[i];
        }
        
        return answer = 45-sum;
    }
}