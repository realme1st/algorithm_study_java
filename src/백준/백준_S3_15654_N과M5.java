package exam2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 백준_S3_15654_N과M5 {
	static int N,M;
	static int[] input,numbers;
	static boolean[] isSelected;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st= new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		input = new int[N];
		numbers=new int[M];
		isSelected=new boolean[N];
		
		st= new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++) {
			input[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(input);
		permutation(0);
		
		bw.write(sb.toString());
		br.close();
		bw.close();
	}
	
	public static void permutation(int cnt) {
		if(cnt==M) {
			for(int i : numbers) {
				sb.append(i+" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=0;i<N;i++) {
			if(!isSelected[i]) {
				numbers[cnt]=input[i];
				isSelected[i]=true;
				permutation(cnt+1);
				isSelected[i]=false;
			}
		}
		
	}

}
