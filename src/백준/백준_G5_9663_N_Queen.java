package 백트래킹;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 백준_G5_9663_N_Queen {
	static int N;
	static int map[];
	static int cnt=0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N=Integer.parseInt(br.readLine());
		map= new int[N+1];
		setQueen(1);
		
		bw.write(cnt+"\n");
		br.close();
		bw.close();
	}
	
	public static void setQueen(int rowNo) { // rowNo: 퀸을 두어야 하는 현재 행
		
		if(!isAvailable(rowNo-1)) { //직전까지 상황이 유망하지 않다면 리턴
			return;
		}
		
		//기본파트 : 퀸을 모두 놓았다면
		if(rowNo>N) {
			cnt++;
			return;
		}
		
		// 1열부터 n열까지 퀸을 놓는 시도
		for(int i=1;i<=N;i++) {
			map[rowNo]=i;
			setQueen(rowNo+1);
		}
	}
	
	public static boolean isAvailable(int rowNo) { //rowNo: 놓아진 마지막 퀸
		for(int i=1;i<rowNo;i++) {
			if(map[rowNo]==map[i] || rowNo-i ==Math.abs(map[rowNo]-map[i])) { 
				return false;
			}
			
		}
		return true;
	}

}
