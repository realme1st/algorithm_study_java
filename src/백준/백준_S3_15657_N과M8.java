package exam2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 백준_S3_15657_N과M8 {
	static int N,M;
	static int[] input,numbers;
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		input=new int[N];
		numbers =new int[M];
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++) {
			input[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(input);
		dupcomb(0,0);
		bw.write(sb.toString());
		br.close();
		bw.close();

	}
	public static void dupcomb(int cnt,int start) {
		if(cnt==M) {
			for(int i: numbers) {
				sb.append(i+" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=start;i<N;i++) {
			numbers[cnt]=input[i];
			dupcomb(cnt+1,i);
		}
	}

}
