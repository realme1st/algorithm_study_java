package for_im;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;



public class 백준_2578_S5_빙고 {
	static int map[][];
	static int ans = 0;
	static int bingo = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		map = new int[5][5];

		for (int r = 0; r < 5; r++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int c = 0; c < 5; c++) {
				map[r][c] = Integer.parseInt(st.nextToken());
				//map[r][c]=sc.nextInt();
			}
		} // 빙고판 완성

		// 사회자가 부르는거

		outer:for(int i=0;i<5;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<5;j++) {
				int num=Integer.parseInt(st.nextToken());
				
				for(int r=0;r<5;r++) {
					for(int c=0;c<5;c++) {
						if(map[r][c]==num) {
							map[r][c]=0;
							ans++;
						}
					}
				}
				
				bingoX();
				bingoY();
				cross1();
				cross2();
				
				if(bingo>=3) {
					bw.write(ans+"\n");
					br.close();
					bw.close();
					break outer;
				}
				bingo=0;
			}
		}
	}
		

	public static void bingoX() {
		
		for (int r = 0; r < 5; r++) {
			int cnt=0;
			for (int c = 0; c < 5; c++) {
				if(map[r][c]==0) {
					cnt++;
				}
			}
			
			if (cnt == 5) {
				bingo++;
				
			}
			
		}

	}

	public static void bingoY() {
		
		for (int c = 0; c < 5; c++) {
			int cnt=0;
			for (int r = 0; r < 5; r++) {
				if(map[r][c]==0) {
					cnt++;
				}
			}
			if(cnt==5) {
				bingo++;
			}
			
			
		}

		
	}

	public static void cross1() {
		int cnt=0;
		for (int r = 0; r < 5; r++) {
			if(map[r][r]==0) {
				cnt++;
			}
			if(cnt==5) {
				bingo++;
			}
		}

	
	}

	public static void cross2() {
		int cnt=0;
		for (int r = 0; r < 5; r++) {
			if(map[r][4-r]==0) {
				cnt++;
			}
			if(cnt==5) {
				bingo++;
			}
		}

		
	}
}
