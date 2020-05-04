class Solution {
    public String solution(String s) {
        String answer = ""; 
        String[] word = s.split(""); //단어 s를 배열로 만들기
        
        int mid = word.length/2; //단어의 가운데를 찾기 위한 변수 
        if(word.length % 2 != 0) //만약 단어의 길이가 홀수이면 하나만 반환
            answer = word[mid];
        else //단어의 길이가 짝수이면 가운데 2글자 반환
            answer = word[mid-1] + word[mid];
        return answer;
    }
}
