package for_im;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_B1_10163_색종이 {
	static int N;
	static int map[][];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		
		N=Integer.parseInt(br.readLine());
		map=new int [1001][1001];
		int count[]= new int[N];
		for(int tc=1;tc<=N;tc++) {
			st=new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			int width=Integer.parseInt(st.nextToken());
			int height=Integer.parseInt(st.nextToken());
			
			for(int i=x;i<x+width;i++) {
				for(int j=y;j<y+height;j++) {
					map[i][j]=tc;
				}
			}
			
		}
		
		for(int i=0;i<1001;i++) {
			for(int j=0;j<1001;j++) {
				if(map[i][j]!=0) {
					count[map[i][j]-1]++;
				}
			}
		}
		for(int i=0;i<N;i++) {
			bw.write(count[i]+"\n");
		}
		
		
		br.close();
		bw.close();
	}

}
