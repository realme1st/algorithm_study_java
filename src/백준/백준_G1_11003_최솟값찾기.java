package ch03자료구조;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class 백준_G1_11003_최솟값찾기 {
	static int N,L;
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");

		N=Integer.parseInt(st.nextToken());
		L=Integer.parseInt(st.nextToken());
		
		Deque<int[]> q=new ArrayDeque<>();
		st =new StringTokenizer(br.readLine()," ");
		for(int i=0;i<N;i++) {
			int num=Integer.parseInt(st.nextToken());
			while(!q.isEmpty() && q.peekLast()[0]> num) {
				q.pollLast();
			}
			q.offer(new int[] {num,i});
			if(q.peek()[1] < i-(L-1)) {
				q.poll();
			}
			bw.write(q.peek()[0]+" ");
		}
		br.close();
		bw.close();
		
	}
}
