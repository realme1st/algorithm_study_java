package ch03자료구조;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 백준_G4_1253_좋다 {
	static int N;
	static long arr[];
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		N=Integer.parseInt(br.readLine());
		
		int cnt=0;
		
		arr=new long[N];
		
		st=new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<N;i++) {
			arr[i]=Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		for(int i=0;i<N;i++) {
			long num=arr[i];
			int start=0;
			int end=N-1;
			
			while(start<end) {
				if(arr[start]+arr[end]==num) {
					if(start!=i && end !=i) {
						cnt++;
						break;
					}else if(start==i) {
						start++;
					}else if(end==i) {
						end--;
					}
				}else if(arr[start]+arr[end]<num) {
					start++;
				}else {
					end--;
				}
			}
		}
		bw.write(cnt+"\n");
		br.close();
		bw.close();
	}

}
