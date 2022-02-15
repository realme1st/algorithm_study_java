package day0215;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 백준_B1_2839_설탕배달 {
	static int N;
	static int cnt=0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N=Integer.parseInt(br.readLine());
		
		while(true) {
			if(N%5==0) {
				cnt+=N/5;
				break;
			}else {
				N-=3;
				cnt++;
			}
			if(N<0) {
				cnt=-1;
				break;
			}
			
		}
		bw.write(cnt+"\n");
		br.close();
		bw.close();
		
	}

}
