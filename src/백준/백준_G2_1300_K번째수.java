package ch05탐색;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.io.IOException;

public class 백준_G2_1300_K번째수 {
	static int N,K;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		N=Integer.parseInt(br.readLine());
		K=Integer.parseInt(br.readLine());
		long ans=0;
		long start=1,end=K;
		while(start<=end) {
			long middle=(start+end)/2;
			long cnt=0;
			
			for(int i=1;i<=N;i++) {
				cnt+=Math.min(middle/i, N);
			}
			if (cnt<K) {
				start=middle+1;
			}else {
				ans=middle;
				end=middle-1;
			}
		}
		bw.write(ans+"\n");
		br.close();
		bw.close();
	}

}
