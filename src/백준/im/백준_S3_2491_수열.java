package for_im;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import java.util.StringTokenizer;

public class 백준_S3_2491_수열 {
	static int N;
	static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		
		N=Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine()," ");
		
		arr=new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		
		int max=1;
		
		int upcnt=1;
		for(int i=0;i<N-1;i++) {
			if(arr[i]<=arr[i+1]) {
				upcnt++;
			}else {
				upcnt=1;
			}
			max=Math.max(upcnt, max);
		}
		
		int downcnt=1;
		for(int i=0;i<N-1;i++) {
			if(arr[i]>=arr[i+1]) {
				downcnt++;
			}else {
				downcnt=1;
			}
			max=Math.max(downcnt, max);
		}
		
		
		bw.write(max+"\n");
		br.close();
		bw.close();
		
	}

}
