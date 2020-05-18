/* (a>b) 조건을 거꾸로 하고 풀어서 살짝 헤맴
* a와 b는 -10,000,000 이상 10,000,000 이하인 정수라는 조건 때문에 answer을 int형으로 선언하면 에러 발생
*/

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a == b) // 두 수가 같을 경우는 둘 중 아무거나 반환
            return a;
        
        else if(a < b) {
            for(int i = a; i <= b; i++)
                answer += i;
        }
        else {
            for(int i = a; i >= b; i--)
                answer += i;
        }
        return answer;
    }
}
