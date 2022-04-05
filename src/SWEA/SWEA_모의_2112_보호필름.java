package day0405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_모의_2112_보호필름 {
	static int D,W,K,film[][],min;
	static final int A=0,B=1;
	static int[] drugA,drugB; //약품을 열 단위가 아니라 막 단위(가로) 부분배열
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int TC=Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int tc=1;tc<=TC;tc++) {
			st=new StringTokenizer(br.readLine()," ");
			D=Integer.parseInt(st.nextToken());//막 두께
			W=Integer.parseInt(st.nextToken());// 막 너비
			K=Integer.parseInt(st.nextToken()); // 합격 기준 연속 셀의 개수
			
			film = new int[D][W];
			drugA=new int[W];
			drugB=new int[W];
			min=Integer.MAX_VALUE;
			
			for(int i=0;i<D;i++) {
				st=new StringTokenizer(br.readLine()," ");
				for(int j=0;j<W;j++) {
					film[i][j]=Integer.parseInt(st.nextToken());
				}
			}//입력처리
			
			Arrays.fill(drugA, A); //int [] 기본 초기화가 0이므로 생략가능
			Arrays.fill(drugB, B);
			
			process(0,0);
			System.out.println("#"+tc+" "+min);
		}
	}
	
	private static boolean check() { //막의 보호필름 성능검사
		
		// 열고정 행탐색 연속된 셀의 같은 특성이 K개 이상인지 검사
		
		for(int c=0;c<W;c++) { // 열고정
			int count=1;
			int before =film[0][c]; //수직의 첫번째
			for(int r=1;r<D;r++) {
				int current= film[r][c];
				if(before ==current) {
					if(++count ==K) break; //옆에 열도 봐야되니까 
				}else {
					before=current;
					count=1;
				}
					
				
			}//하나의 열을 고정해서 수직 검사
			if(count <K) return false;
			
		}
		return true;
	}
	
	private static boolean process(int row,int useCnt) { //각 막에 부분집합으로 약품 비투여,약품 A 투여, 약품 B 투여 uscCnt:약품 수
		
		if(row==D) {
			if(check()) {
				min=Math.min(min, useCnt);
				return min==0; //약품을 하나도 사용하지 않으면 true,사용했으면 false
			}

			return false; //  무조건 성능조건 안되면 false
		}
		
		if(useCnt>=min) {
			return false; //기존 임시 최적해의 최소 약품수보다 현재까지 사용한 약품수가 같거나 크면 의미 없으므로 리턴
		}
		
		int [] backup =film[row]; //현재 막의 상태 배열 기억
		//약품 비투여
		if(process(row+1,useCnt))
			return true;
		//약품 A투여
		film[row]=drugA;
		process(row+1,useCnt+1);
			
		//약품 B 투여
		film[row]=drugB;
		process(row+1,useCnt+1);
		
		film[row]=backup; //기존 막의 상태로 다시 바꿔놓기
		return false;
	}

}
