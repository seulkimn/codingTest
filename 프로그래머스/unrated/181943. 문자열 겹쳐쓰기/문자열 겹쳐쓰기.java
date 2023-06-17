class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        //my_string의 문자열을 인덱스s 길이부터 잘라준 결과값을 담은 변수 
        String str1 = my_string.substring(0,s);
        
        String sum = str1 + overwrite_string;
        
        //a = my_string의 문자열 길이 - 새로운 문자열 길이
        int a =  my_string.length()- sum.length();
        
        //my_string문자열을 뒤에서부터 int a의 길이만큼 자른것. 
        String str2 = my_string.substring(my_string.length()-a);

        answer = sum + str2;
         
        return answer;
        
    }
}