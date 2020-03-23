//그룹 단어 체크 (문자열단계엣 제일 어려웠다.)

import java.util.*;
import java.io.*;
public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int count = num; //그룹단어가 몇 개 존재하는지 카운트 할 변수. 일단 입력받을 문자열의 수로 초기화 한 후, 문자열이 그룹단어가 아닐 시 -1을 해준다. 
		
		for(int i = 0; i < num; i++) {
			String word = br.readLine();
			
			int[] check = new int[26]; //한 번 나온 알파벳을 체크하기 위한 배열  
			check[word.charAt(0)-'a'] = -1; //-1은 한 번 나온 값을 의미.
			
			//입력받은 문자의 길이만큼 검사한다. 
			for(int j = 1; j < word.length(); j++) {
				if(word.charAt(j) != word.charAt(j-1)) { //바로 직전 문자와 다른 경우
					if(check[word.charAt(j)-'a'] == -1 ) { //직전 문자와 다르고, 이미 나온적이 있는 경우 
						count--; //그룹단어가 아니므로 그룹단어 카운트에서 -1을 해준다.
						break; //더 이상 확인할 필요가 없으니 break. 
					}
					else//직전 문자와 다르고, 이미 나온 적 없는 알파벳일 경우 체크 배열에 -1로 저장한다. 나중에 이 알파벳이 나왔을 경우를 판별하기 위한 과정. 
						check[word.charAt(j)-'a'] = -1; 
				}
			}
		}
		System.out.println(count);
		br.close();
	}
}
