package array_linkedlist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 백준_S5_1475_방번호 {

	static String N;
	static int ans=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));

		N=br.readLine();
		int[] arr =new int[10];
		
		for(int i=0;i<N.length();i++) {
			int num=N.charAt(i)-'0';
			
			if(num==9) {
				num=6;
			}
			
			arr[num]++;
		}
		
		arr[6] =(arr[6]/2)+(arr[6]%2);
		
		Arrays.sort(arr);
		
		bw.write(arr[9]+"\n");
		
		br.close();
		bw.close();
	}

}
