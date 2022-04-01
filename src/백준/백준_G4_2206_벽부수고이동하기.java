package ssafy2차알고;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Node{
	int x;
	int y;
	int dist;
	int boom;
	public Node(int x, int y, int dist, int boom) {
		super();
		this.x = x;
		this.y = y;
		this.dist = dist;
		this.boom = boom;
	}
	
	
}

public class 백준_G4_2206_벽부수고이동하기 {
	static int N,M;
	static int[][]map;
	static boolean visit[][][];
	static int ans;
	static int [] dx= {-1,1,0,0};
	static int [] dy= {0,0,-1,1};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		map=new int [N][M];
		visit=new boolean[N][M][2];
		ans=-1;
		
		for(int r=0;r<N;r++) {
			String s = br.readLine();
			for(int c=0;c<M;c++) {
				map[r][c]=s.charAt(c)-'0';
			}
		}
		
		bfs();
		
		bw.write(ans+"\n");
		br.close();
		bw.close();
	}
	public static void bfs() {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(0,0,1,0));
		visit[0][0][0]=true;
		
		while(!q.isEmpty()) {
			Node now =q.poll();
			int x =now.x;
			int y=now.y;
			
			if(x==N-1 && y==M-1) {
				ans=now.dist;
				return;
			}
			
			for(int i=0;i<4;i++) {
				int nx=x+dx[i];
				int ny=y+dy[i];
				
				if(nx<0 || nx>=N || ny<0 || ny>=M) {
					continue;
				}
				
				if(map[nx][ny]==0 && !visit[nx][ny][now.boom]) {
					visit[nx][ny][now.boom]=true;
					q.add(new Node(nx,ny,now.dist+1,now.boom));
				}else {
					if(now.boom==0 && !visit[nx][ny][now.boom+1]) {
						visit[nx][ny][now.boom+1]=true;
						q.add(new Node(nx,ny,now.dist+1,now.boom+1));
					}
				}
			}
		}
	}
	
}
