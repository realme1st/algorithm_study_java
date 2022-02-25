package for_im;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class 백준_S2_1914_하노이탑{
	static int N;
	static StringBuilder sb = new StringBuilder();
	static BigInteger res = new BigInteger("1");
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		N=Integer.parseInt(br.readLine());
		if(N<=20) {
		hanoi(N,1,2,3);
		bw.write(ans+"\n");
		bw.write(sb.toString());
		}else {
			for(int i=0; i<N; ++i) {
                res = res.multiply(new BigInteger("2")); // 2의 N 제곱
            }
            res = res.subtract(new BigInteger("1")); // 빼기 1
			bw.write(res+"\n");
		}
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
