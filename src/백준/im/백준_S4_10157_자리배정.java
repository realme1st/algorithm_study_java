package for_im;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_S4_10157_자리배정 {
	static int C,R;
	static int[][] map;
	static int[] dr= {-1,0,1,0}; //상우하좌
	static int[] dc= {0,1,0,-1};
	static int nx,ny;
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st= new StringTokenizer(br.readLine()," ");
		
		C=Integer.parseInt(st.nextToken());
		R=Integer.parseInt(st.nextToken());
		int num=Integer.parseInt(br.readLine());
		
		map= new int [R][C];
		
		if(R*C <num) {
			bw.write(0+"\n");
			br.close();
			bw.close();
			System.exit(0);
		}
		
		int x=R-1;
		int y=0;
		int cnt=1;
		map[x][y]=1;
		int i=0;
		while(true) {
			
			if(cnt==num) {
				break;
			}
			nx=x+dr[i];
			ny=y+dc[i];
			
			
			if(nx>=0 && ny>=0 && nx<R && ny<C && map[nx][ny]==0) {
				map[nx][ny]=++cnt;
				x=nx;
				y=ny;
			}else {
				i++;
				if(i==4) {
					i=0;
				}
			}
			
				
		}
		bw.write(y+1+" "+(R-x)+"\n");
		br.close();
		bw.close();
		
	}
	
	

}
