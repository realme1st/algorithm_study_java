package ch03자료구조;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 백준_B2_11720_숫자의합구하기 {
	static int N;
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		N=Integer.parseInt(br.readLine());
		
		String sNum=br.readLine();
		
		char[] cNum=sNum.toCharArray();
		
		int sum=0;
		
		for(int i=0;i<cNum.length;i++) {
			sum+=cNum[i]-'0';
		}
		
		bw.write(sum+"\n");
		br.close();
		bw.close();
	}

}
