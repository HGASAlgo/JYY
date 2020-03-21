//1부터 10000까지 숫자 중 셀프넘버를 출력

import java.util.*;
import java.io.*;
public class main {
	
	static int[] selfNum = new int[10001]; //셀프넘버와 생성자가 있는 숫자를 구분하기 위한 배열 
	
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= 10000; i++) {
			dn(i);
			
			if(selfNum[i] != 1) //셀프넘버이면 
				sb.append(i).append("\n");
		}
		System.out.print(sb);
	}
  
	//n의 각 자리수를 더해 생성자를 구하는 함수 
	public static void dn(int n) {
		int dn = n;
		//n의 생성자 수열을 만들기 위한 반복문 
		 while(n > 0) {
			 dn += n % 10;
	         n /= 10;
	     }
		 if(dn <= 10000)
			 selfNum[dn] = 1; //dn은 생성자. 생성자인 숫자는 배열에 1로 저장. 
	}
}
