package array_linkedlist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_B5_10807_개수세기 {

	static int N;
	static int[] arr;
	static int v;
	static int ans=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		N=Integer.parseInt(br.readLine());
		arr=new int[N];
		
		st=new StringTokenizer(br.readLine()," ");
		v=Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			if(arr[i]==v) {
				ans++;
			}
		}
		bw.write(ans+"\n");
		
		br.close();
		bw.close();
		
		
		
	}

}
