/* arr[0]을 무조건 추가한 뒤, 앞뒤로 비교하기 위해 for문에서 i=1로 정의함. 
* i=0, arr[i] != arr[i+1] 이라고 코드를 작성했더니 arrayIndexOf 에러 발생.
*/

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(arr[0]); //arr의 0번은 무조건 반환
        for(int i = 1; i < arr.length; i++) {
            if(arr[i-1] != arr[i]) //arr 앞뒤로 비교. 
                arrL.add(arr[i]); 
        }
        int[] answer = new int[arrL.size()];
        for(int j = 0; j < answer.length; j++)
            answer[j] = arrL.get(j);

        return answer;
    }
}
