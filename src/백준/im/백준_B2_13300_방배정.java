package for_im;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_B2_13300_방배정 {
	static int N,K;
	static int student[][];
	public static void main(String[] args)  throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		
		student = new int [7][2]; // 학년과 성별
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			
			int s=Integer.parseInt(st.nextToken());
			
			if(s==0){ // 성별 여자라면 
				student[Integer.parseInt(st.nextToken())][0]++; //관련학년 여자 수 증가
			}else {
				student[Integer.parseInt(st.nextToken())][1]++; //관련학년 남자 수 증가
			}
			
			
		}//학생정보 끝
		
		int cnt=0;
		
		//여학생부터
		for(int i=1;i<7;i++) { //학년 탐색
			if(student[i][0]==0) { //아무도 없다면
				continue;
			}
			
			if(student[i][0]<K) {
				cnt++;
			}else if(student[i][0]>=K && student[i][0]%K==0) {
				cnt+=student[i][0]/K;
			}else if(student[i][0] >=K&& student[i][0]%K !=0) {
				cnt+=student[i][0]/K +1;
			}
		}
		//남학생
		for(int i=1;i<7;i++) { //학년 탐색
			if(student[i][1]==0) { //아무도 없다면
				continue;
			}
			
			if(student[i][1]<K) {
				cnt++;
			}else if(student[i][1]>=K && student[i][1]%K==0) {
				cnt+=student[i][1]/K;
			}else if(student[i][1] >=K&& student[i][1]%K !=0) {
				cnt+=student[i][1]/K +1;
			}
		}
		bw.write(cnt+"\n");
		br.close();
		bw.close();
	}

}
