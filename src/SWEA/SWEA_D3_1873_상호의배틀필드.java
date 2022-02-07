package day0204;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SWEA_D3_1873_상호의배틀필드{

	static char[][] map;
	static int[] dy= {0,0,-1,1};
	static int [] dx={-1,1,0,0};
	static int x=0;
	static int y=0;
	static int h=0;
	static int w=0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		
		int t = Integer.parseInt(br.readLine());
		for(int tc=1;tc<=t;tc++) {
			
			
			
			st = new StringTokenizer(br.readLine()," ");
			h= Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			map = new char[h][w];
			
			for(int r=0;r<h;r++) { //map 등록
				String mapview=br.readLine();
				for(int c=0;c<w;c++) {
					map[r][c]=mapview.charAt(c);
					if(map[r][c]=='>' || map[r][c]=='<'||map[r][c]=='^'||map[r][c]=='v') { // 현재 위치 찾기
						x=r;
						y=c;
					}
				}
			}
			int n=Integer.parseInt(br.readLine());
			String command=br.readLine();
			for(int i=0;i<n;i++) { // 명령키에 대한 코드
				switch(command.charAt(i)) {
				case 'U':
					map[x][y]='^'; // 방향 돌리기
					if(x-1>=0 && map[x-1][y]=='.') { // 갈 수 있는 길인경우
						map[x][y]='.';
						map[--x][y]='^';
					}
					break;
				case 'D':
					map[x][y]='v';
					if(x+1<h && map[x+1][y]=='.') {
						map[x][y]='.';
						map[++x][y]='v';
					}
					break;
				case 'L':
					map[x][y]='<';
					if(y-1>=0 && map[x][y-1]=='.') {
						map[x][y]='.';
						map[x][--y]='<';
					}
					break;
				case 'R':
					map[x][y]='>';
					if(y+1<w &&map[x][y+1]=='.') {
						map[x][y]='.';
						map[x][++y]='>';
					}
					break;
				case 'S':
					shot(x,y);
					break;
				default:
					break;
				}
			}
			System.out.print("#"+tc+" ");
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
		}
	}
	public static void shot(int x,int y) {
		int nx=x;
		int ny=y;
		while(true) {
			if(map[x][y]=='^') { // 전차방향
				nx=nx+dx[0];
				ny=ny+dy[0];
			}else if(map[x][y]=='v') {
				nx=nx+dx[1];
				ny=ny+dy[1];
			}else if(map[x][y]=='<') {
				nx=nx+dx[2];
				ny=ny+dy[2];
			}else if(map[x][y]=='>') {
				
				nx=nx+dx[3];
				ny=ny+dy[3];
				
			}
			if(nx>=h || nx<0 || ny>=w ||ny<0) {
				break;
			}
			if(map[nx][ny]=='#') { //강철이면 아무것도 안하고 끝
				break;
			}else if(map[nx][ny]=='*') { //벽돌이면 평지로 만들고 끝
				map[nx][ny]='.';	
				break;
			}
		}
	}
}
