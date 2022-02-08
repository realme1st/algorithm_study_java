package day0208;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SWEA_D3_1225_암호생성기 {
	static int n;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		
		for(int tc=1;tc<=10;tc++) {
			n=Integer.parseInt(br.readLine());
			Queue<Integer> queue = new LinkedList<Integer>();
			st = new StringTokenizer(br.readLine()," ");
			for(int i=0;i<8;i++) {
				queue.offer(Integer.parseInt(st.nextToken()));
				
			}
			int val=1;
			while(val!=0) {
				for(int i=1;i<6;i++) {
					val=queue.poll();
					val-=i;
					if(val<=0) {
						val=0;
					}
					queue.offer(val);
					if(val==0) {
						break;
					}
				}
			}
			sb.append("#"+tc+" ");
			for(int i=0;i<8;i++) {
				sb.append(queue.poll()+" ");
			}
			sb.append("\n");
			
		}//tc

		bw.write(sb+"\n");
		
		br.close();
		bw.close();
	}
	

}
