/* 정렬
* 반복문 내에 array[i++] 를 쓰면 반복문이 실행 될 때 인덱스 자동 증가 
*/

import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int x = 0; // answer 배열의 인덱스 값
        for(int a = 0; a < commands.length; a++) { // commands의 개수만큼 반복 
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];
            
            int[] n_array = new int[j-i+1]; //array에서 해당하는 값을 뽑아 저장할 새로운 배열 
            
            int y = 0; // n_array 배열의 인덱스 값 
            for(int b = i-1; b < j; b++) {
                n_array[y++] = array[b]; // n_array에 array 배열 중 i번째 순서부터 j순서까지 해당하는 값을 저장 
            }
            
            Arrays.sort(n_array); 
            answer[x++] = n_array[k-1]; //answer 배열에 k번째 수 저장
        }
        return answer;
    }
}
