package day0208;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class SWEA_D3_1228_암호문1 {
	
	static int N;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int tc=1;tc<=10;tc++) {
			LinkedList<Integer> list = new LinkedList<>();
			N = Integer.parseInt(br.readLine());
			st=new StringTokenizer(br.readLine()," ");
			for(int i=0;i<N;i++) {
				list.add(Integer.parseInt(st.nextToken()));
			} // 원본 암호문
			
			int command = Integer.parseInt(br.readLine()); // 암호문 개수
			st= new StringTokenizer(br.readLine()," ");
			
			for(int i=0;i<command;i++) {
				String str = st.nextToken();
				int x=Integer.parseInt(st.nextToken());
				int y =Integer.parseInt(st.nextToken());
				
				for(int j=0;j<y;j++) {
					list.add(x,Integer.parseInt(st.nextToken()));
					x+=1;
				}
				
			}
			
			sb.append("#"+tc+" ");
			for(int i=0;i<10;i++) {
				sb.append(list.poll()+" ");
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		br.close();
		bw.close();
	}

}
