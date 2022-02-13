package exam2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 백준_S3_N과M1 {
	static int N,M;
	static int[] input,numbers;
	static boolean isSelected[];
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder str = new StringBuilder();
	public static void main(String[] args) throws IOException{
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		input=new int[N];
		isSelected=new boolean[N];
		numbers = new int[M];
		
		
		permutation(0);
		System.out.println(str);

	}
	public static void permutation(int cnt) {
		if(cnt==M) {
			for(int a : numbers) {
				str.append(a + " ");
			}
			str.append("\n");
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(!isSelected[i]) {
				numbers[cnt]=i+1;
				isSelected[i]=true;
				permutation(cnt+1);
				isSelected[i]=false;
			}
			
			
		}
	}

}
