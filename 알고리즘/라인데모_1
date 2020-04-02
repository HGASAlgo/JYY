/*직사각형 만들기 위한 좌표구하기
* 입력 : [[1, 4], [3, 4], [3, 10]]
* 출력 : [1,10]
*/
class Solution {
    public int[] solution(int[][] v) {
        int result[] = new int[2];

        //x좌표
        if(v[0][0] != v[1][0]) {
            if(v[1][0] == v[2][0])
                result[0] = v[0][0];
            else
                result[0] = v[1][0];
        }
        else {
            result[0] = v[2][0];
        }
        
        //y좌표
        if(v[0][1] != v[1][1]) {
            if(v[1][1] == v[2][1])
                result[1] = v[0][1];
            else
                result[1] = v[1][1];    
        }
        else {
            result[1] = v[2][1];
        }

        return result;
    }
}
