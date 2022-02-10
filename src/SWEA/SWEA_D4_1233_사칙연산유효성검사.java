package day0210;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SWEA_D4_1233_사칙연산유효성검사 {
	static final int T=10;
	static int N;
	static char[] tree;
	static int cur;
	static int answer;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb;
		
		for(int tc=1;tc<=T;tc++) {
			sb=new StringBuilder();
			N=Integer.parseInt(br.readLine());
			tree= new char[N+1];
			answer= 1;
			
			for(int i=0;i<N;i++) {
				String str[] = br.readLine().split(" ");
				
				cur=Integer.parseInt(str[0]);
				tree[cur]=str[1].charAt(0);
				
				if(tree[cur]!='+' && tree[cur]!='-' &&tree[cur]!='*' && tree[cur]!='/') { //자기 위치가 숫자인경우
					if(tree[cur/2]!='+' && tree[cur/2]!='-' &&tree[cur/2]!='*' && tree[cur/2]!='/') { // 부모 숫자인지 판별
						answer=0; //숫자라서 계산이 안됨
					}
				}
				
			}
			sb.append("#"+tc+" "+answer+"\n");
			bw.write(sb.toString());
			
			
		}
		br.close();
		bw.close();
	}

}
