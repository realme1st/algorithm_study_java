package day0209;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SWEA_D3_3499_퍼펙트셔플 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder sb;
	static int T;
	static int N;
	static Queue<String> queue=new LinkedList<String>();
	static Queue<String> queue2=new LinkedList<String>();
	
	static String ans[];
	public static void main(String[] args) throws IOException{
		T=Integer.parseInt(br.readLine());
		
		
		for(int tc=1;tc<=T;tc++) {
			sb=new StringBuilder();
			N=Integer.parseInt(br.readLine());
			ans = new String[N];
			st = new StringTokenizer(br.readLine()," ");
			
			for(int i=0;i<N;i++) {
				if(N%2==0) {
					if(i<N/2) {
						queue.offer(st.nextToken());
					}else {
						queue2.offer(st.nextToken());
					}
				}else {
					if(i<N/2+1) {
						queue.offer(st.nextToken());
					}else {
						queue2.offer(st.nextToken());
					}
				}
			}
			for(int i=0;i<N;i++) {
				if(i%2==0 ) {
					ans[i]=queue.poll();
				}else if(i%2!=0 ){
					ans[i]=queue2.poll();
				}
			}
			
			sb.append("#"+tc+" ");
			for(int i=0;i<N;i++) {
				sb.append(ans[i]).append(" ");
			}
			sb.append("\n");
			
			bw.write(sb.toString());
			
			
		}//테케
		br.close();
		bw.close();
	}

}
