/* 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴
* split 함수를 사용해서 문자열을 배열로 만들어주고, Arrays.sort 함수를 사용해서 정렬.
* 따로 역순으로 변경하는 처리 X.
* 반복문 사용해서 배열 끝 부터 새로운 문자열에 추가해줌.
*/

import java.util.*; //Array.sort() 쓰려면 필수

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        
        Arrays.sort(str);

        for(int i=s.length()-1; i>=0; i--) //s.length()-1 배열 마지막 원소 생각해주기
            answer += str[i];
        return answer;
    }
}
