package day0208;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SWEA_D3_9229_한빈이와SpotMart {
	
	static int T;
	static int N,M; // 과자 개수와 무게 합 제한
	static int snack[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb;
		T = Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=T;tc++) {
			sb = new StringBuilder();
			st= new StringTokenizer(br.readLine()," ");
			N=Integer.parseInt(st.nextToken());
			M=Integer.parseInt(st.nextToken());
			
			st=new StringTokenizer(br.readLine()," ");
			snack=new int[N];
			
			for(int i=0;i<N;i++) {
				snack[i]=Integer.parseInt(st.nextToken());
			}
			
			int max=0;
			for(int i=0;i<N;i++) {
				for(int j=i+1;j<N;j++) {
					if(snack[i]+snack[j]<=M) {
						max=Math.max(max,snack[i]+snack[j]);
					}
				}
			}
			if(max==0) {
				sb.append("#"+tc+" ").append(-1+"\n");
			}else {
			sb.append("#"+tc+" ");
			sb.append(max+"\n");
			
			}
			bw.write(sb.toString());
		}
		br.close();
		bw.close();
	}

}
