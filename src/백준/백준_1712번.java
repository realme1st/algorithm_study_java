package 백준;

import java.util.*;
import java.io.*;
public class 백준_1712번 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a=Integer.parseInt(st.nextToken());
		int b =Integer.parseInt(st.nextToken());
		int c =Integer.parseInt(st.nextToken());
		
		if(b>=c) {
			bw.write("-1");
		}else {
			bw.write((a/(c-b))+1+"\n");
		}
		
		
		
		br.close();
		bw.flush();
		bw.close();
	}

}
