package day0211;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_16935_S1_배열돌리기3 {
	
	static int N,M,R;
	static int map[][];
	static int select;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb;
		st = new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		R=Integer.parseInt(st.nextToken());
		map=new int[N][M];
		
		for(int r=0;r<N;r++) {
			st= new StringTokenizer(br.readLine()," ");
			for(int c=0;c<M;c++) {
				map[r][c]=Integer.parseInt(st.nextToken());
			}
		}// 맵 완성
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<R;i++) {
			
			select=Integer.parseInt(st.nextToken());
			
			switch(select) {
			case 1: // 상하 반전
				upDown();
				break;
			
			case 2:// 좌우반전
				leftRight();
				break;
			case 3: //오른쪽으로 90도 회전
				rightRotate();
				break;
			case 4://왼쪽으로 90도 회전
				leftRotate();
				break;
			case 5: // 1 -2-3-4 사분면 순으로 돌리기
				move1();
				break;
			case 6: // 4 -3 -2 -1 사분면 순으로 돌리기
				move2();
				break;
			}
		} // 회전하고 싶은 방식 정리
		
		for(int r=0;r<N;r++) {
			sb=new StringBuilder();
			for(int c=0;c<M;c++) {
				sb.append(map[r][c]+" ");
			}
			sb.append("\n");
			bw.write(sb.toString());
		}
		
		br.close();
		bw.close();
	}
	public static void upDown() {
		int [][] changeMap=new int[N][M];
		
		for(int r=0;r<N;r++) {
			for(int c=0;c<M;c++) {
				changeMap[N-r-1][c]=map[r][c];
			}
		}
		map=changeMap;
	}
	
	public static void leftRight() {
		int [][] changeMap= new int[N][M];
		for(int r=0;r<N;r++) {
			for(int c=0;c<M;c++) {
				changeMap[r][M-c-1]=map[r][c];
			}
		}
		map=changeMap;
	}
	
	public static void rightRotate() {
		int [][] changeMap = new int[M][N];
		for(int r=0;r<M;r++) {
			for(int c=0;c<N;c++) {
				changeMap[r][N-1-c]=map[c][r];
			}
		}
		int temp=M;
		M=N;
		N=temp;
		
		map=changeMap;
		
	}
	
	public static void leftRotate() {
		int [][] changeMap = new int[M][N];
		for(int r=0;r<M;r++) {
			for(int c=0;c<N;c++) {
				changeMap[M-1-r][c]=map[c][r];
			}
		}
		int temp=M;
		M=N;
		N=temp;
		
		map=changeMap;
	}
	
	public static void move1() {
		int [][] changeMap = new int[N][M];
		for(int r=0;r<N/2;r++) { //1->2
			for(int c=0;c<M/2;c++) {
				changeMap[r][c+M/2]=map[r][c];
			}
		}
		for(int r=0;r<N/2;r++) { //2->3
			for(int c=M/2;c<M;c++) {
				changeMap[r+N/2][c]=map[r][c];
			}
		}
		
		for(int r=N/2;r<N;r++) { //3->4
			for(int c=M/2;c<M;c++) {
				changeMap[r][c-M/2]=map[r][c];
			}
		}
		
		for(int r=N/2;r<N;r++) { //4->1
			for(int c=0;c<M/2;c++) {
				changeMap[r-N/2][c]=map[r][c];
			}
		}
		map=changeMap;
	}
	
	public static void move2() {
		int[][] changeMap = new int[N][M];
		for(int r=0;r<N/2;r++) { //1->4
			for(int c=0;c<M/2;c++) {
				changeMap[r+N/2][c]=map[r][c];
			}
		}
		for(int r=N/2;r<N;r++) { //4->3
			for(int c=0;c<M/2;c++) {
				changeMap[r][c+M/2]=map[r][c];
			}
		}
		for(int r=N/2;r<N;r++) { //3->2
			for(int c=M/2;c<M;c++) {
				changeMap[r-N/2][c]=map[r][c];
			}
		}
		
		for(int r=0;r<N/2;r++) {
			for(int c=M/2;c<M;c++) {
				changeMap[r][c-M/2]=map[r][c];
			}
		}
		map=changeMap;
	}
	
}
