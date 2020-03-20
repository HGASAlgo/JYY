/*테스트케이스 개수를 입력받고, 각 문자를 반복할 횟수와 반복할 문자 입력받음.
*StringTokeizer와 split() 함수를 사용하여 문자를 반복할 횟수와 반복할 문자를 따로 저장.
*/

import java.util.*;
import java.io.*;
public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine()); //테스트케이스 개수 
		int r; //각 문자를 반복할 횟수 
		String word[] = {};
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			r = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			word = s.split("");

			for(int j = 0; j < word.length; j++) 
				for(int k = 0; k < r; k++) 
					sb.append(word[j]);
			sb.append("\n");
		}
		
		System.out.print(sb);
		br.close();
	}
}
