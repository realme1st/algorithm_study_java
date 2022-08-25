package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_B3_2490_윷놀이 {
	static int cnt;
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		int arr[];
		for(int i=0;i<3;i++) {
			cnt=0;
			arr=new int[4];
			
			st=new StringTokenizer(br.readLine()," ");
			
			for(int j=0;j<4;j++) {
				arr[j]=Integer.parseInt(st.nextToken());
				
				if(arr[j]==0) {
					cnt++;
				}
			}
			
			if(cnt==0) {
				bw.write("E"+"\n");
			}else if(cnt ==1) {
				bw.write("A"+"\n");
			}else if(cnt==2) {
				bw.write("B"+"\n");
			}else if(cnt==3) {
				bw.write("C"+"\n");
			}else {
				bw.write("D"+"\n");
			}
			
			
		}
		br.close();
		bw.close();
	}

}
