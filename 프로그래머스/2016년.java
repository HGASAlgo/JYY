// 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] month={31,29,31,30,31,30,31,31,30,31,30,31}; //1월부터 12월까지의 각 달의 일수를 저장하는 배열. 2016년 2월은 윤년이라 29일

        for (int i = 1; i < a; i++) {
            b+=month[i-1]; //b 일수에 a 전 달까지 일수를 저장. b는 결국 1월 1일 부터 a월 b일까지의 전체 일수가 된다.
        }
        switch(b%7){ 
            case 3:
                    answer="SUN";
                    break;
            case 4:
                    answer="MON";
                    break;
            case 5:
                    answer="TUE";
                    break;
            case 6:
                    answer="WED";
                    break;
            case 0:
                    answer="THU";
                    break;
            case 1: //2016.01.01은 금요일이므로 
                    answer="FRI";
                    break;
            case 2:
                    answer="SAT";
                    break;
        }
        
        return answer;
    }
}
