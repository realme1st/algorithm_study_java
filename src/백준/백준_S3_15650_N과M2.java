package exam2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_S3_15650_N과M2 {
	static int N,M;
	static int[] numbers;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb =new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		numbers = new int[M];
		
		combination(0,0);
		bw.write(sb.toString());
		br.close();
		bw.close();
	}
	public static void combination(int cnt,int start) {
		
		if(cnt==M) {
			for(int i : numbers) {
				sb.append(i+" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=start;i<N;i++) {
			
			numbers[cnt]=i+1;
			combination(cnt+1,i+1);
		}
	}

}
