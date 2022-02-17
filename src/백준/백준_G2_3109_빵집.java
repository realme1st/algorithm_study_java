package day0217;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_G2_3109_빵집 {
	static int R,C;
	static char map[][];
	static int ans=0;
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		R= Integer.parseInt(st.nextToken());
		C= Integer.parseInt(st.nextToken());
		
		map = new char[R][C];
		
		for(int r=0;r<R;r++) {
			String str =br.readLine();
			for(int c=0;c<C;c++) {
				map[r][c]=str.charAt(c);
			}
		}// 맵 완료
		for(int r=0;r<R;r++) {
			if(checked(r,0)) {
				ans++;
			}
				
		}
		bw.write(ans+"\n");
		br.close();
		bw.close();
		
	}
	public static boolean checked(int r,int c) { //갈수 있냐 없냐
		map[r][c]='x'; // 간 곳 못가게 하려고
		
		if(c==C-1) { //원웅이 빵집 열
			return true;
		}
		if(r<R-1 && map[r+1][c+1]=='.') { //오른쪽 아래 이동
			if(checked(r+1,c+1)) {
				return true;
			}
		}
		
		if(r>0 &&map[r-1][c+1]=='.') { //오른쪽 위 이동
			if(checked(r-1,c+1)) {
				return true;
			}
		}
		
		if(map[r][c+1]=='.') { //오른쪽 이동
			if(checked(r,c+1)) {
				return true;
			}
		}
		return false;
	}//checked 함수

}
