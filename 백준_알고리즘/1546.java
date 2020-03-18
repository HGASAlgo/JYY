//점수 조작해서 새로운 평균 구하기 

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); //입력받을 점수 개수 
		double[] score = new double[n];
		double max = 0, sum=0; 

		String[] split = br.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			score[i] = Double.parseDouble(split[i]);
		}
		Arrays.sort(score); //가장 큰 점수 값을 찾기 위해 정렬 
		max = score[n-1];
		
		for(int i = 0; i < score.length; i++) {
			sum+= (score[i]/max)*100; //새로운 점수 = 점수/Max*100의 식을 통하여 구한다. 
		}
		System.out.println(sum/n);
		br.close();	
	}
}
