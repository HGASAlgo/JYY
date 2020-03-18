//입력받은 각 테스트케이스마다 평균을 넘은 비율을 반올림하여 소수점 셋째자리까지 출력

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int test = Integer.parseInt(br.readLine()); //테스트케이스 개수

		for(int i = 0; i < test; i++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()); //각 테스트케이스마다 학생 수 
			int [] arr = new int[n];
			int sum=0, avg=1;
			//하나의 테스트케이스 점수를 저장하는 부분 
			for(int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum+=arr[j];
			}
			avg = sum/n;
			
			double count=0;
			//평균을 넘는 점수의 개수를 카운트 하는 부분 
			for(int k = 0; k < arr.length; k++) {
				if(arr[k] > avg)
					count++;
			}
			System.out.printf("%.3f", count/n*100.0);
			System.out.println("%");
		}
		br.close();
	}
}
