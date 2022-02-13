package for_im;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 백준_S1_11729_하노이탑이동순서 {
	static int N;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		N=Integer.parseInt(br.readLine());
		
		hanoi(N,1,2,3);
		bw.write(ans+"\n");
		bw.write(sb.toString());
		
		br.close();
		bw.close();
		
	}
	static int ans=0;
	public static void hanoi(int cnt,int start,int temp,int to) {
		
		if(cnt==0) return;
		
		hanoi(cnt-1,start,to,temp);
		ans++;
		sb.append(start+" "+to+"\n");
		hanoi(cnt-1,temp,start,to);
		
	}
	

}
