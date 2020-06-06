/* 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수
* try-catch문 사용해서 오류나면 바로 false 반환
* NumberFormatException : String -> int로 변환 시 오류
*/

class Solution {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6) {
            try{
              int num = Integer.parseInt(s);
              return true;
          } catch(NumberFormatException e){
              return false;
          }
        }
        return false; //boolean 형이라 마지막에 return false 빼면 오류발생.
    }
}
