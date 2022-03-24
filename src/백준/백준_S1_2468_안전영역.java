import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class 백준_S1_2468_안전영역 {
	static int N;
	static int[][] map;
	static boolean[][] check;
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	static int cnt=0;
	//static int ans=1;
	static int Max_ans=Integer.MIN_VALUE;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		N=Integer.parseInt(br.readLine());
		map=new int[N][N];
		
		for(int r=0;r<N;r++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int c=0;c<N;c++) {
				map[r][c]=Integer.parseInt(st.nextToken());
			}
		}// 맵
		
		while(true) {
			check=new boolean[N][N];
			cnt++;
			int ans=0;
			for(int r=0;r<N;r++) {
				for(int c=0;c<N;c++) {
					if(map[r][c]>cnt && !check[r][c]) {
						dfs(r,c);
						ans++;
					}
				}
			}
			Max_ans=Math.max(Max_ans, ans);
			if(cnt==100) {
				break;
			}
		}
		
		if(Max_ans==0) {
			System.out.println(1);
		}else {
			System.out.println(Max_ans);
		}
	}
	public static void dfs(int x, int y) {
		check[x][y]=true;
		
		for(int i=0;i<4;i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(nx>=0 && ny>=0 && nx<N &&ny<N) {
				if(map[nx][ny]>cnt && !check[nx][ny]) {
					dfs(nx,ny);
				}
			}
		}
	}

}
