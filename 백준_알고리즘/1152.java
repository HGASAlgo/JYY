//입력받은 문자열에서 단어 개수 세기

import java.util.*;
import java.io.*;
public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().trim(); //입력받은 문자열 앞뒤 공백 제거 
		if(!s.isEmpty())
			System.out.println(s.split(" ").length); //띄어쓰기로 단어 개수 카운트 
		else //문자열이 입력되지 않고 공백만 입력되었을 경우 
			System.out.println(0);
	}
}
