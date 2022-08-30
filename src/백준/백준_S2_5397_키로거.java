package array_linkedlist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class 백준_S2_5397_키로거 {

	static int L;
	static StringBuilder sb ;
	public static void main(String[] args) throws IOException{ 
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		L=Integer.parseInt(br.readLine());
		
		for(int i=0;i<L;i++) {
			sb=new StringBuilder();
			String s=br.readLine();
			Stack<Character> leftSt=new Stack<>();
			Stack<Character> rightSt=new Stack<>();
			
			for(int j=0;j<s.length();j++) {
				char c=s.charAt(j);
				
				if(c=='<') {
					if(!leftSt.isEmpty()) {
						rightSt.push(leftSt.pop());
					}
				}else if(c=='>') {
					if(!rightSt.isEmpty()) {
						leftSt.push(rightSt.pop());
					}
				}else if(c=='-') {
					if(!leftSt.isEmpty()) {
						leftSt.pop();
					}
				}else {
					leftSt.push(c);
				}
				
				
			
			}
			
			
			
			while(!leftSt.isEmpty()) {
				

				rightSt.push(leftSt.pop());
			}
			
			while(!rightSt.isEmpty()) {
				
				sb.append(rightSt.pop());
			}
			sb.append("\n");
			bw.write(sb.toString());
			
		}
		
		
		
		br.close();
		bw.close();
	}

}
