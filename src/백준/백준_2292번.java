package 백준;
import java.util.*;
import java.io.*;
public class 백준_2292번 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int count=1;
		int range=2;
		
		if(n==1) {
			bw.write(1+"\n");
		}else {
			while(range<=n) {
				range=range+(6*count);
				count++;
			}
			bw.write(count+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
