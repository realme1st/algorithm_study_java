package for_im;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 백준_B2_2309_일곱난쟁이 {
	static int N=9;
	static int[] people;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb =new StringBuilder();
		
		people = new int[N];
		int sum=0;
		for(int i=0;i<N;i++) {
			people[i]=Integer.parseInt(br.readLine());
			sum+=people[i];
		}
		Arrays.sort(people);
		
		outer: for(int i=0;i<N;i++) {
			for(int j=i;j<N;j++) {
				if(sum-people[i]-people[j]==100) {
					for(int k=0;k<N;k++) {
						if(i==k || j==k) {
							continue;
						}
						sb.append(people[k]+"\n");
						
					}
					break outer;
				}
				
			}
		}
		bw.write(sb.toString());
		br.close();
		bw.close();
	}
	

}
