/*크로아티아 알파벳 개수 세기
* croatia 배열에 저장한 8개의 문자는 1개로 친다.
*/문자열.replaceAll(A, "B"); 문자열 치환 사용. 문자열에서 A를 찾아 B로 바꿔라.

import java.util.*;
import java.io.*;
public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i = 0; i < croatia.length; i++) {
			word = word.replaceAll(croatia[i], "1");
		}

		System.out.println(word.length());
		br.close();
	}
}
