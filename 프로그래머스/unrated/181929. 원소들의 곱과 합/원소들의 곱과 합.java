class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int multipli = 1;
        
        for(int i=0; i<num_list.length; i++){
            multipli *= num_list[i];
            sum += num_list[i];
        }
        
        sum = sum*sum;
        
       return answer = multipli < sum ? 1 : 0;
        
    }
}