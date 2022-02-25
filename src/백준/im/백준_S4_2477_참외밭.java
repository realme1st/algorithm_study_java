package for_im;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 백준_S4_2477_참외밭 {
	static int K;
	static int map[][];
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		K=Integer.parseInt(br.readLine());
		
		map=new int[6][2];
		
		int width=0;
		int height=0;
		
		int width_idx=0;
		int height_idx=0;
		
		int width_max=0;
		int height_max=0;
		
		for(int i=0;i<6;i++) {
			st= new StringTokenizer(br.readLine()," ");
			
			int dir= Integer.parseInt(st.nextToken());
			int dist=Integer.parseInt(st.nextToken());
			
			map[i][0] = dir; // 방향
			map[i][1]= dist; //길이
			
			
		}
		
		for(int i=0;i<6;i++) {
			if(map[i][0]==1 || map[i][0]==2) {
				if(width_max<map[i][1]) {
					width_max=map[i][1];
					width_idx=i;
				}
			}
			
			else if(map[i][0]==3 || map[i][0]==4) {
				if(height_max<map[i][1]) {
					height_max=map[i][1];
					height_idx=i;
				}
			}
		}
		int W=0;
		int H=0;
		
		if(width_idx==0) {
			W=Math.abs(map[5][1]-map[width_idx+1][1]);
		}else if(width_idx ==5) {
			W=Math.abs(map[width_idx-1][1]-map[0][1]);
			
		}else {
			W=Math.abs(map[width_idx-1][1]-map[width_idx+1][1]);
		}
		
		if(height_idx==0) {
			H=Math.abs(map[5][1]-map[height_idx+1][1]);
		}else if(height_idx ==5) {
			H=Math.abs(map[height_idx-1][1]-map[0][1]);
			
		}else {
			H=Math.abs(map[height_idx-1][1]-map[height_idx+1][1]);
		}
		
		int subSquare = H*W;
		
		int ans = ((width_max*height_max)-subSquare) * K;
		
		bw.write(ans+"\n");
		br.close();
		bw.close();
	}
	
	
}
