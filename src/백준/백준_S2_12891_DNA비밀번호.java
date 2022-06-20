package ch03자료구조;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_S2_12891_DNA비밀번호 {
	
	static int P,S;
	static int myArr[];
	static int checkArr[];
	static int checkSecret;
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine()," ");
		
		S=Integer.parseInt(st.nextToken());
		P=Integer.parseInt(st.nextToken());
		
		int result=0;
		
		char A[]=new char[S];
		
		myArr=new int[4];
		checkArr=new int[4];
		
		checkSecret=0;
		
		A=br.readLine().toCharArray();
		st=new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<4;i++) {
			checkArr[i]=Integer.parseInt(st.nextToken());
			
			if(checkArr[i]==0) {
				checkSecret++;
			}
		}
		
		for(int i=0;i<P;i++) {
			Add(A[i]);
		}
		
		if(checkSecret==4) {
			result++;
		}
		
		for(int i=P;i<S;i++) {
			int j=i-P;
			Add(A[i]);
			Remove(A[j]);
			if(checkSecret==4) {
				result++;
			}
		}
		
		bw.write(result+"\n");
		br.close();
		bw.close();
	}
	
	public static void Add(char c) {
		switch(c) {
		case 'A':
			myArr[0]++;
			if(myArr[0]==checkArr[0])
				checkSecret++;
			break;
		case 'C':
			myArr[1]++;
			if(myArr[1]==checkArr[1]) {
				checkSecret++;
			}
			break;
		case 'G':
			myArr[2]++;
			if(myArr[2]==checkArr[2]) {
				checkSecret++;
			}
			break;
		case 'T':
			myArr[3]++;
			if(myArr[3]==checkArr[3]) {
				checkSecret++;
			}
			break;
		}
	}
	
	public static void Remove(char c) {
		switch(c) {
		case 'A' :
			if(myArr[0]==checkArr[0]) {
				checkSecret--;
			}
			myArr[0]--;
			break;
		case 'C' :
			if(myArr[1]==checkArr[1]) {
				checkSecret--;
			}
			myArr[1]--;
			break;
		case 'G' :
			if(myArr[2]==checkArr[2]) {
				checkSecret--;
			}
			myArr[2]--;
			break;
		case 'T' :
			if(myArr[3]==checkArr[3]) {
				checkSecret--;
			}
			myArr[3]--;
			break;
		}
	}

}