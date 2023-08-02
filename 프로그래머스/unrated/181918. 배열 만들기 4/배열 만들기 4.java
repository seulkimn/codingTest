import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> tmp= new ArrayList();
        
        int i=0;
        while(i<arr.length){
            
            if(tmp.size()==0){
                tmp.add(arr[i]);
                i=i+1;
            }
            else{
                int last=tmp.get(tmp.size()-1);
                if(tmp.size()!=0 && last<arr[i]){
                tmp.add(arr[i]);
                i=i+1;
                }
                else if(tmp.size()!=0 && last>=arr[i]){
                    tmp.remove(tmp.size()-1);
                }
            }
            
        }
        
       int[] stk = tmp.stream().mapToInt(j -> j).toArray();
        
        return stk;
    }
}