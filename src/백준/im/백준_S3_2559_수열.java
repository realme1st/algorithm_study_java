package for_im;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_S3_2559_수열 {
	static int N,K;
	static int arr[];
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		
		st=new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		arr=new int[N];
		st=new StringTokenizer(br.readLine()," ");

		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<=N-K;i++) {
			int sum=0;
			for(int j=i;j<K+i;j++) {
				sum+=arr[j];
			}
			max=Math.max(max, sum);
		}
		
	
		bw.write(max+"\n");
		br.close();
		bw.close();
	}

}
