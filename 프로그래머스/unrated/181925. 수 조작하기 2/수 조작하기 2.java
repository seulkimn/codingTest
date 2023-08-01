class Solution {
    public String solution(int[] numLog) {
        String Log = "";
        for(int i = 1; i < numLog.length; i++){
            if(numLog[i] - numLog[i - 1] == 1)
                Log += 'w';
            else if(numLog[i] - numLog[i - 1] == -1)
                Log += 's';
            else if (numLog[i] - numLog[i - 1] == 10)
                Log += 'd';
            else
                Log += 'a';
        }
        return Log;
    }
}