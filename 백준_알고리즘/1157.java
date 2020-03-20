// 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램 (대소문자 구분 x, 결과 출력은 대문자로)

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = -1;
		int[] cnt = new int[26]; //A부터 Z까지 해당 문자열이 몇 번 사용되었는지 카운트 할 배열 
		char result = '?';
		
		String word = br.readLine().toUpperCase(); //대문자로 결과를 출력하기 위해 입력받은 문자 모두 대문자로 변환
		
		for(int i = 0; i < word.length(); i++) {
			cnt[word.charAt(i) - 'A']++; //입력받은 문자열 중 해당하는 알파벳 순서에 카운트++, A를 인덱스 0에 저장 
			if(max < cnt[word.charAt(i) - 'A']) {
				max = cnt[word.charAt(i) - 'A'];
				result = word.charAt(i);
			}
			//가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력 
			else if(max == cnt[word.charAt(i) - 'A'])
				result = '?';
		}
    System.out.println(result);
		br.close();
	}
}
