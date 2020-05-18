/*문자열 비교할 때 
* == 연산자는 비교하는 대상의 주소값 비교.
* 문자열.equals("비교할 문자열") : 비교하는 대상 내용 자체 비교
*/

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        for(int i = 0 ; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }
        return answer;
    }
}
