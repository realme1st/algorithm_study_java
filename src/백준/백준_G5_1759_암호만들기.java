package day0221;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 백준_G5_1759_암호만들기 {
	static int L,C;
	static char arr[];
	static char ansarr[];
	static StringBuilder sb;
	public static void main(String[] args) throws IOException{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		sb=new StringBuilder();
		st= new StringTokenizer(br.readLine()," ");
		L= Integer.parseInt(st.nextToken());
		C=Integer.parseInt(st.nextToken());
		
		arr=new char[C];
		ansarr=new char[L];
		st= new StringTokenizer(br.readLine()," ");
		for(int i=0;i<C;i++) {
			arr[i]=st.nextToken().charAt(0);
		}
		
		Arrays.sort(arr); //사전순이라니까 정렬
		
		comb(0,0);
		bw.write(sb.toString());
		br.close();
		bw.close();
		
	}
	
	public static void comb(int cnt,int start) {
		
		if(cnt==L) { //기저조건을 자음모음으로 해야할듯?
			int vowel=0;
			int conso=0;
			
			for(char c : ansarr) {
				if(c=='a' || c=='e'|| c=='o'|| c=='u' ||c=='i') {
					vowel++;
				}else {
					conso++;
				}
			}
			if(vowel>=1 && conso>=2) {
				for(int i=0;i<L;i++) {
					sb.append(ansarr[i]);
				}
				sb.append("\n");
			}
			return;
		}
		
		
		
		for(int i=start;i<C;i++) {
			ansarr[cnt]=arr[i];
			comb(cnt+1,i+1);
		}
	}
	

}
