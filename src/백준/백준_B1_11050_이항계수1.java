package exam2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_B1_11050_이항계수1 {
	static int N,K;
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		
		comb(0,0);
		
		bw.write(ans+"");
		br.close();
		bw.close();

	}
	static int ans=0;
	public static void comb(int cnt,int start) {
		
		if(cnt==K) {
			ans++;
			return;
		}
		
		for(int i=start;i<N;i++) {
			comb(cnt+1,i+1);
		}
	}

}
