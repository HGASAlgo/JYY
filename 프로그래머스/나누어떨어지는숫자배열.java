/*ArrayList가 그냥 배열보다 추가하고 삭제하기 편하다. 
* 그냥 배열로 코드 짰을 때 배열 선언시 크기 지정에서 문제.
*ArrayList.add() : 추가, ArrayList.get() : 추출
*/

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {       
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                arrL.add(arr[i]);
            }
        }
        if(arrL.size() == 0) { //나누어 떨어지는 숫자가 없다면 answer에 -1 담아 바로 반환
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[arrL.size()]; //배열 크기 지정 문제 해결
        for(int j = 0; j < arrL.size(); j++) {
            answer[j] = arrL.get(j);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}
