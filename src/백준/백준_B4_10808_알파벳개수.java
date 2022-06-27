import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 백준_B4_10808_알파벳개수 {
	
	static String str;
	static int arr[];
	static char[] ch;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		arr=new int[26];
		str= br.readLine();

		ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			arr[ch[i]-'a']++;
			
		}
		
		
		for(int i=0;i<26;i++) {
			bw.write(arr[i]+" ");
		}
		
		
		br.close();
		bw.close();
	}

}
