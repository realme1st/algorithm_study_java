package ch03자료구조;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_S3_11659_구간합구하기4 {
	static int N,M;
	static int arr[];
	static int Sarr[];
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		arr=new int[N+1];
		Sarr=new int[N+1];
		st=new StringTokenizer(br.readLine()," ");
		for(int i=1;i<=N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			Sarr[i]=Sarr[i-1]+arr[i];
		}
		
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			int ans=0;
			ans=Sarr[b]-Sarr[a-1];
			
			bw.write(ans+"\n");
		}
		
		br.close();
		bw.close();
		
		
	}

}
