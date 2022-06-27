package ch05탐색;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 백준_G5_13023_ABCDE {

	static int N,M;
	static boolean visited[];
	static ArrayList<Integer>[] A;
	static boolean arrive;
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		arrive=false;
		st=new StringTokenizer(br.readLine()," ");
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		A=new ArrayList[N];
		visited =new boolean[N];
		
		for(int i=0;i<N;i++) {
			A[i]=new ArrayList<Integer>();
		}
		
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine()," ");
			int S=Integer.parseInt(st.nextToken());
			int E=Integer.parseInt(st.nextToken());
			
			A[S].add(E);
			A[E].add(S);
		}
		
		for(int i=0;i<N;i++) {
			DFS(i,1);
			
			if(arrive)
				break;
		}
		
		if(arrive) {
			bw.write("1"+"\n");
		}else {
			bw.write("0"+"\n");
		}
		br.close();
		bw.close();
	}
	public static void DFS(int now,int depth) {
		if(depth ==5 || arrive) {
			arrive=true;
			return;
		}
		
		visited[now]=true;
		
		for(int i: A[now]) {
			if(!visited[i]) {
				DFS(i,depth+1);
			}
		}
		visited[now]=false;
	}
	
	

}
