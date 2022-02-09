package day0209;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_G5_16927_배열돌리기2 {

	static int N,M,R;
	static int map[][];
	static int dx[]= {0,1,0,-1};
	static int dy[]= {1,0,-1,0};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()," ");
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		R=Integer.parseInt(st.nextToken());
		
		map= new int [N][M];
		
		for(int r=0;r<N;r++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int c=0;c<M;c++) {
				map[r][c]=Integer.parseInt(st.nextToken());
			}
		}// 입력 끝
		
		int rot_cnt= Math.min(N, M)/2;
		
		for(int i=0;i<rot_cnt;i++) {
			int nR=R%((N-i*2)*2+(M-i*2)*2-4);
			
			while(nR--!=0) {
				int x=i;
				int y=i;
				
				int cnt=0;
				int temp=map[x][y];
				
				while(cnt<4) {
					int nx=x+dx[cnt];
					int ny=y+dy[cnt];
					
					if(nx>=i && ny>=i && nx<N-i && ny <M-i) {
						map[x][y]=map[nx][ny];
						x=nx;
						y=ny;
					}else {
						cnt++; //방향전환
					}
				}
				map[i+1][i]=temp;
			}
			
		}
		for(int r=0;r<N;r++) {
			for(int c=0;c<M;c++) {
				sb.append(map[r][c]+" ");
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		
		br.close();
		bw.close();
	}
}
