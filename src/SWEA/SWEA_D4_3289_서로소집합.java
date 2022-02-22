package day0222;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SWEA_D4_3289_서로소집합 {
	static int T,n,m;
	static int[] parents;
	static StringBuilder sb;
	public static void makeSet() {
		parents=new int[n+1];
		
		//자신의 부모노드를 자신 값으로 세팅
		for(int i=1;i<=n;i++) {
			parents[i]=i;
		}
	}
	
	public static int findSet(int a) {
		if(a ==parents[a]) 
			return a;
		return parents[a]=findSet(parents[a]);
	}
	//집합 합치기
	public static boolean union(int a,int b) {
		int aRoot=findSet(a);
		int bRoot=findSet(b);
		if( aRoot==bRoot)
			return false;
		parents[bRoot]=aRoot;
		
		return true;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		T=Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=T;tc++) {
			sb =new StringBuilder();
			st=new StringTokenizer(br.readLine()," ");
			n=Integer.parseInt(st.nextToken());
			m=Integer.parseInt(st.nextToken());
			
			makeSet();
			
			for(int i=0;i<m;i++) {
				st=new StringTokenizer(br.readLine()," ");
				int command=Integer.parseInt(st.nextToken());
				int a =Integer.parseInt(st.nextToken());
				int b= Integer.parseInt(st.nextToken());
				
				if(command ==0) {
					union(a,b);
				}else if(command==1) {
					if(findSet(a)==findSet(b)) {
						sb.append(1);
					}else {
						sb.append(0);
					}	
				}
			}
			bw.write("#"+tc+" "+sb.toString()+"\n");
			
			
		}//테케
		br.close();
		bw.close();
	}

}
