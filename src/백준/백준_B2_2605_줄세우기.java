package for_im;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 백준_B2_2605_줄세우기 {
	
	static int N;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		N=Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine()," ");
		LinkedList<Integer> list = new LinkedList<>();
		
		for(int i=1;i<=N;i++) {
			list.add(Integer.parseInt(st.nextToken()),i);
		}
		
		while(!list.isEmpty()) {
			sb.append(list.pollLast()+" ");
		}
		
		bw.write(sb.toString());
		br.close();
		bw.close();
	}

}
