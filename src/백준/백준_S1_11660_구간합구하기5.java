package ch03자료구조;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_S1_11660_구간합구하기5 {
	static int N,M;
	static int map[][];
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st =new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		map=new int[N+1][N+1];
		
		for(int r=1;r<=N;r++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int c=1;c<=N;c++) {
				map[r][c]=Integer.parseInt(st.nextToken());
			}
		} //기존 2차원 배열
		int[][] Smap=new int[N+1][N+1];
		
		for(int r=1;r<=N;r++) {
			for(int c=1;c<=N;c++) {
				Smap[r][c]=Smap[r][c-1]+Smap[r-1][c]-Smap[r-1][c-1]+map[r][c];
			}
		}
		
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine()," ");
			int x1=Integer.parseInt(st.nextToken());
			int y1=Integer.parseInt(st.nextToken());
			
			int x2=Integer.parseInt(st.nextToken());
			int y2=Integer.parseInt(st.nextToken());
			
			int ans=Smap[x2][y2]-Smap[x1-1][y2]-Smap[x2][y1-1]+Smap[x1-1][y1-1];
			bw.write(ans+"\n");
		}
		br.close();
		bw.close();
	}

}
