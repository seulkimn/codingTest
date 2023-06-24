class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        
        for(int i=0; i<control.length(); i++) {
        	String a = control.substring(i, i+1);
        	
        	if(a.equals("w"))
        		n++;
        	else if(a.equals("s"))
        		n--;
        	else if(a.equals("d"))
        		n+=10;
        	else 
        		n-=10;
        }
        return answer = n;
    }
}