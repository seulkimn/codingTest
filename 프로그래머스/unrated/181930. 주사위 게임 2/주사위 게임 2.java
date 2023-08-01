class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;

        int count = 1;
    
        // 세 숫자 중 어느 두 숫자는 같고 나머지 숫자는 다르다면
        if(a == b || a == c || b == c) {
            count++;
        }
        System.out.println("두 숫자만 같을 때 = " + count);

       // 세 수가 모두 같다면
        if(a == b && b == c) {
            count++;
        }
        System.out.println("세 수가 모두 같을 때 = " + count);
        
        for(int i = 1; i <= count; i++) {
            answer *= (Math.pow(a,i)+Math.pow(b,i)+Math.pow(c,i));
        }

        return answer;
    }

}