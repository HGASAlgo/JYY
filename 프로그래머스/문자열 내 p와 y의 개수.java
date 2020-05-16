/* 대소문자 구분 없다고 하면 toLowerCase()나 toUpperCase()로 변경 후 비교
* 문자열 비교를 위해 배열로 변경 후 equals 메소드를 사용하여 비교
*/

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0, countY = 0; //p, y 의 개수 저장하는 변수

        s = s.toLowerCase();
        String[] str = s.split("");

        for(int i = 0; i < str.length; i++) {
            if(str[i].equals("p"))
                countP++;
            if(str[i].equals("y"))
                countY++;
        }

        if(countP != countY)
            answer = false;
        return answer;
    }
}
