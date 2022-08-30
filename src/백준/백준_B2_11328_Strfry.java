package array_linkedlist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 백준_B2_11328_Strfry {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n =Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			String [] input =br.readLine().split(" ");
			String first = input[0];
			String second =input[1];
			
			int[] alphabet =new int[26];
			
			boolean isPossible=true;
			
			for(int j=0;j<first.length();j++) {
				alphabet[(int)first.charAt(j)-'a']+=1;
			}
			
			for(int j=0;j<second.length();j++) {
				alphabet[(int)second.charAt(j)-'a']-=1;
			}
			
			
			for(int item : alphabet) {
				if(item !=0) {
					isPossible =false;
					break;
				}
			}
			
			bw.write(isPossible ? "Possible" :"Impossible");
			
			bw.write("\n");
		}
		br.close();
		bw.close();
	}

}
