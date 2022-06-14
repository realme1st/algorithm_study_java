package ch03자료구조;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 백준_S4_1940_주몽 {
	static int N,M;
	static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		N= Integer.parseInt(br.readLine());
		M= Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine()," ");
		
		arr= new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int cnt=0;
		int start=0;
		int end=N-1;
		
		while(start<end) {
			if(arr[start]+arr[end] <M) {
				start++;
			}else if(arr[start]+arr[end]>M) {
				end--;
			}else {
				cnt++;
				start++;
			}
		}
		
		bw.write(cnt+"\n");
		br.close();
		bw.close();
	}

}
