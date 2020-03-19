//입력받은 값을 아스키코드로 출력하는 함수 System.in.read() 사용

import java.util.*;
import java.io.*;
public class main {
	public static void main(String[] args) throws IOException {
		//System.in.read() 함수 : 콘솔창에 입력 되는 값은 모두 아스키코드 값으로 입력받음. 
		int asc = System.in.read();
		System.out.println(asc);
	}
}
