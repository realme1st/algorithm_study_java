package day0211;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SWEA_D4_1861_정사각형방 {
	
	static int T;
	static int N;
	static int map[][];
	static int dx[]= {-1,1,0,0};
	static int dy[]= {0,0,-1,1};
	static boolean[][]visited;
	static int ans,idx;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		T = Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=T;tc++) {
			N=Integer.parseInt(br.readLine());
			map = new int[N][N];
			visited = new boolean[N][N];
			ans=0;
			idx=0;
			for(int r=0;r<N;r++) {
				st = new StringTokenizer(br.readLine()," ");
				for(int c=0;c<N;c++) {
					map[r][c]=Integer.parseInt(st.nextToken());
				}
			}// 맵 마무리
			
			for(int r=0;r<N;r++) {
				for(int c=0;c<N;c++) {
					dfs(r,c,1,map[r][c]);
				}
			}
			bw.write("#"+tc+" "+idx+" "+ans+"\n");
		}
		br.close();
		bw.close();

	}
	public static void dfs(int x,int y,int cnt,int start) {
		visited[x][y]=true;
		
		for(int i=0;i<4;i++) {
			int nx = x+dx[i];
			int ny= y+dy[i];
			
			if(0<=nx && 0<=ny && nx<N && ny<N ) {
				if(!visited[nx][ny] && (map[nx][ny]==map[x][y]+1)) {
					dfs(nx,ny,cnt+1,start);
				}
			}
		}// 이동에 관한 함수
		
		if(cnt>ans) {
			ans = cnt;
			idx=start; // 시작위치 방 업데이트
		}
		if(cnt==ans) {
			idx=Math.min(idx, start); //cnt 값 같으면 방 번호가 작은 거로 입력
		}
		visited[x][y]=false;
		
	}

	
}
