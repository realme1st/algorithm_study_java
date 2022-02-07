package day0204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SWEA_D3_2805_농작물수확하기 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int t = Integer.parseInt(br.readLine());
		
		
		
		for(int tc =1; tc<=t;tc++) {
			StringBuilder sb = new StringBuilder();
			int sum=0;
			int n = Integer.parseInt(br.readLine()); // 농장 크기
			int map[][] = new int[n][n];
			for(int i=0;i<n;i++) {
				String price=br.readLine();
				for(int j=0;j<n;j++) {
					map[i][j]=price.charAt(j)-'0';
				}
			}// 땅 농작물 정리
			
			int half=n/2; //중앙
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					int diff = Math.abs(half-i)+Math.abs(half-j);
					if(diff <=half) {
						sum+=map[i][j];
					}
				}
			}
			
			sb.append("#").append(tc+" ").append(sum);
			System.out.println(sb);
		}
		
	}

}
