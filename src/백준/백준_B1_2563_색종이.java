package for_im;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_B1_2563_색종이 {
	static int N;
	static int map[][];
	static int count;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb =new StringBuilder();
		
		
		N=Integer.parseInt(br.readLine());
		map=new int[100][100];
		count=0;
		for(int i=0;i<N;i++) {
			
			
			st=new StringTokenizer(br.readLine()," ");
			int x=Integer.parseInt(st.nextToken());
			int y= Integer.parseInt(st.nextToken());
			
			for(int j=x;j<x+10;j++) {
				for(int k=y;k<y+10;k++) {
					map[j][k]=1;
				}
			}

		}
		for(int j=0;j<100;j++) {
			for(int k=0;k<100;k++) {
				if(map[j][k]==1) {
					count++;
				}
			}
			
		}
		sb.append(count);
		
		bw.write(sb.toString());
		br.close();
		bw.close();
		
	}

}
