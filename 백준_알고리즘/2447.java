/* !!!이 문제 별표!!! (잘 모르겠어서 구글링함. 근데 아직도 모르겠어)
 * 분할정복 문제 
 * Arrays.fill(배열, '초기화할 문자') : 배열 전체를 초기화하는 메소드 
 */
 
import java.util.*;
import java.io.*;
public class Main {
	static char[][] board; //별을 찍기 위한 판?배열? 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); //3의 제곱수 
		board = new char[n][n]; // n*n 배열로 만들기 
		
		for(int i = 0; i < n; i++) {
			Arrays.fill(board[i], ' '); //배열 전체를초기화 
		}
		
		printStar(0, 0, n);
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sb.append(board[i][j]);
			}
			sb.append("\n");
			
		}
		System.out.print(sb);
		br.close();
	}
	private static void printStar(int x, int y, int n) {
		if(n==1) {
			board[x][y]='*';
			return;
		}
		
		int div = n/3; 
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i==1 && j == 1)
					;
				else
					printStar(x+(i*div), y+(j*div), div);
			}
		}
	}
}
