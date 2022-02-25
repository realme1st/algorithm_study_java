package for_im;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_B1_2669번_직사각형네게의합집합면적구하기 {
	static int[][] map;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int cnt=0;
		map=new int[100][100];
		for(int i=0;i<4;i++) {
			st=new StringTokenizer(br.readLine()," ");
			int left_x=Integer.parseInt(st.nextToken());
			int left_y=Integer.parseInt(st.nextToken());
			int right_x=Integer.parseInt(st.nextToken());
			int right_y=Integer.parseInt(st.nextToken());
			
			int width=right_x-left_x;
			int height=right_y-left_y;
			
			for(int r=left_x;r<left_x+width;r++) {
				for(int c=left_y;c<left_y+height;c++) {
					map[r][c]=1;
				}
			}
		}
		
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(map[i][j]==1)
					cnt++;
			}
		}
		bw.write(cnt+"\n");
		br.close();
		bw.close();
	}

}
