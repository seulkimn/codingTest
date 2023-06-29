class Solution {
    public int[] solution(int[] num_list) {
        int[] num_list2 = new int[num_list.length +1];
        int a = 0;
        int b = 0;
        int c = 0;
        
        a = num_list[num_list.length-1];
        b = num_list[num_list.length-2];
        
        c = a > b ? a-b : a*2;
        
        for(int i=0; i<num_list.length; i++) {
        	num_list2[i] = num_list[i];
        }
        
        num_list2[num_list.length] = c;
        
        
        return num_list2;
    }
}