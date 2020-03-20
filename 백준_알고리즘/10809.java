/*소문자 a부터 z까지 입력받은 문자열 내 첫번째 위치 반환 
*사용되지 않은 소문자 위치는 -1 반환.
*문자열.indexOf("찾을 문자열") : 일치하는 문자열의 첫번째 위치 반환
*/

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String word = br.readLine();
		
		for(int i='a'; i<='z'; i++)
            		sb.append(word.indexOf(i)).append(" "); 
		System.out.println(sb);
        	br.close();
	}
}

