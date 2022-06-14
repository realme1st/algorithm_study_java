package ch03자료구조;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_G3_10986_나머지합 {
	static int N,M;
	static long arr[];
	static long Sarr[];
	static long C[];
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		arr=new long[N+1];
		Sarr=new long[N+1];
		C=new long[M];
		st=new StringTokenizer(br.readLine()," ");
		for(int i=1;i<=N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			Sarr[i]=Sarr[i-1]+arr[i];
		}
		long ans=0;
		for(int i=1;i<=N;i++) {
			Sarr[i]=Sarr[i]%M;
			
			if(Sarr[i]==0) {
				ans++;
			}
			
			C[(int) Sarr[i]]++;
		}
		
		for(int i=0;i<M;i++) {
			if(C[i]>1) {
				ans+=(C[i]*(C[i]-1)/2);
			}
		}
		
		bw.write(ans+"\n");
		
		br.close();
		bw.close();
		
		
		
		
	}

}
