package 백준;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

import java.io.IOException;
import java.util.StringTokenizer;

public class 백준_1316 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n= Integer.parseInt(br.readLine());
		int count =0;
		
		
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			boolean check[]=new boolean[26];
			boolean tmp = true;
			
			for(int j=0;j<s.length();j++) {
				if(check[s.charAt(j)-'a']) {
					if(s.charAt(j)!=s.charAt(j-1)) {
						tmp=false;
						break;
					}
				}else {
					check[s.charAt(j)-'a']=true;
				}
				
			}
			if(tmp)
				count++;
		}
		
		bw.write(count+"\n");
		
		br.close();
		bw.flush();
		bw.close();
		
		
	}
}