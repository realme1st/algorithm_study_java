package day0204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_D3_1208_Flatten {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		
		for(int t=1;t<=10;t++) {
			StringBuilder sb = new StringBuilder();
			int dump =Integer.parseInt(br.readLine());
			st=new StringTokenizer(br.readLine()," ");
			
			int block[] = new int[100];
			for(int i=0;i<100;i++) { // 모든 block 입력
				block[i]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(block); // 정렬
			
			for(int i=0;i<dump;i++) { // 벽돌 옮기기
				block[0]++; // 제일 낮은 값 +
				block[99]--; // 제일 높은 값에서 하나 빼기
				Arrays.sort(block);// 층 변화 생겼으니 다시 정렬
			}
			
			sb.append("#").append(t+" ").append(block[99]-block[0]);
			System.out.println(sb);
			
		}
	}

}
