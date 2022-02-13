package exam2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_S2_1182_부분수열의합 {
	
	static int N,S;
	static int[] numbers;
	static boolean[] isSelected;
	static int ans=0;
	static int sum=Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		S=Integer.parseInt(st.nextToken());
		st=new StringTokenizer(br.readLine()," ");
		
		numbers=new int[N];
		
		for(int i=0;i<N;i++) {
			numbers[i]=Integer.parseInt(st.nextToken());
		}
		isSelected=new boolean[N];
		
		System.out.println(ans);
	}
	
	public static void Subset(int cnt) {
		if(sum==S) {
			ans++;
			return;
		}
		
		isSelected[cnt]=true;
		sum+=numbers[cnt];
		Subset(cnt+1);
		isSelected[cnt]=false;
		
		Subset(cnt+1);
	}

}
