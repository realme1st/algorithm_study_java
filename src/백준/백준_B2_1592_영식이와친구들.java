package for_im;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_B2_1592_영식이와친구들 {
	static int N,M,L;
	static int people[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		L=Integer.parseInt(st.nextToken());
		
		
		people =new int[N+1];
		people[1]=1; //1번사람 공받고 시작
		int idx=1;
		int cnt=0;
		while(true) {
			if(people[idx]==M) {
				break;
			}
			
			if(people[idx]%2!=0) { //홀수라면 시계방향
				if(idx+L<=N) {
					idx+=L;
					people[idx]++;
				}else {
					idx+=L;
					idx%=N;
					people[idx]++;
				}
			}else {
				if(idx-L<=0) {
					idx+=N;
					idx-=L;
					people[idx]++;
				}else {
					idx-=L;
					people[idx]++;
				}
			}
			cnt++;
			
			
		}
		
		bw.write(cnt+"\n");
		br.close();
		bw.close();
	}

}
