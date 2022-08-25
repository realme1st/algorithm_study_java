package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 백준_B3_2576_홀수 {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int arr[]=new int[7];
		int sum=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<7;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			
			if(arr[i]%2!=0) {
				sum+=arr[i];
				min=Math.min(min, arr[i]);
			}
			
			
		}
		
		if(sum==0) {
			bw.write(-1+"\n");
			br.close();
			bw.close();
		}else {
		
		
		
		bw.write(sum+"\n"+min);
		br.close();
		bw.close();
		}
	}

}
