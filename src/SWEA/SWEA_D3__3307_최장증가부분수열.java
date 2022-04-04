package day0404;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SWEA_D3__3307_최장증가부분수열 {
	static int T,N;
	static int[] arr;
	static int[] LIS;
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		T=Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=T;tc++) {
			N=Integer.parseInt(br.readLine());
			st=new StringTokenizer(br.readLine()," ");
			arr=new int[N];
			LIS=new int[N];
			
			for(int i=0;i<N;i++) {
				arr[i]=Integer.parseInt(st.nextToken());
			}
			
			int max=0;
			
			for(int i=0;i<N;i++) {
				LIS[i]=1;
				for(int j=0;j<i;j++) {
					if(arr[j]<arr[i] && LIS[i]<LIS[j]+1) {
						LIS[i]=LIS[j]+1;
					}
				}
				if(max<LIS[i]) {
					max=LIS[i];
				}
			}
			bw.write("#"+tc+" "+max+"\n");
		}
		br.close();
		bw.close();
		
	}

}
