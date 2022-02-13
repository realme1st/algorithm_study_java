package exam2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 백준_S3_15656_N과M7 {
	static int N,M;
	static int[] numbers,input;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st=new StringTokenizer(br.readLine()," ");
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		numbers=new int[M];
		input=new int[N];
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++) {
			input[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(input);
		duppermutation(0);
		bw.write(sb.toString());
		br.close();
		bw.close();
	}

	public static void duppermutation(int cnt) {
		if(cnt==M) {
			for(int i : numbers) {
				sb.append(i+" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=0;i<N;i++) {
			numbers[cnt]=input[i];
			duppermutation(cnt+1);
		}
	}
}
