package day0209;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_S2_16926_배열돌리기1 {

	static int N,M,R;
	static int map[][];
	static int dx[]= {0,1,0,-1};
	static int dy[]= {1,0,-1,0};
	public static void main(String[] args)  throws IOException{
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
		
		int rot_cnt = Math.min(N, M) /2; 
		
		for(int i=0;i<R;i++) {
			for(int j=0;j<rot_cnt;j++) { // 회전하는 것들 개수
				int x=j;
				int y=j;
				
				int cnt=0;
				int temp=map[x][y];
				
				while(cnt<4) {
					int nx=x+dx[cnt];
					int ny=y+dy[cnt];
					
					if(nx>=j && ny>=j && nx<N-j && ny <M-j) {
						map[x][y]=map[nx][ny];
						x=nx;
						y=ny;
					}else {
						cnt++; //방향전환
					}
				}
				map[j+1][j]=temp;
				
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
