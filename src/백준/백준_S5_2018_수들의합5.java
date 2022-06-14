package ch03자료구조;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 백준_S5_2018_수들의합5 {
	static int N;
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		N=Integer.parseInt(br.readLine());
		
		int count=1;
		int start_index=1;
		int end_index=1;
		int sum=1;
		
		while(end_index !=N) {
			if(sum==N) {
				count++;
				end_index++;
				sum=sum+end_index;
			}else if(sum>N) {
				sum=sum-start_index;
				start_index++;
			}else {
				end_index++;
				sum=sum+end_index;
			}
		}
		bw.write(count+"\n");
		br.close();
		bw.close();
	}

}
