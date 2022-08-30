package array_linkedlist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class 백준_S2_1406_에디터 {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		String str = br.readLine();
		int M=Integer.parseInt(br.readLine());
		
		Stack<Character> leftSt =new Stack<Character>();
		Stack<Character> rightSt =new Stack<Character>();
		
		for(int i=0;i<str.length();i++) {
			leftSt.push(str.charAt(i));
		}
		
		while(M-- >0) {
			st=new StringTokenizer(br.readLine()," ");
			
			String command=st.nextToken();
			if(command.equals("L")) {
				if(!leftSt.empty()) {
					rightSt.push(leftSt.pop());
				}
			}else if(command.equals("D")) {
				if(!rightSt.empty()) {
					leftSt.push(rightSt.pop());
				}
			}else if(command.equals("B")) {
				if(!leftSt.empty()) {
					leftSt.pop();
				}
			}else if(command.equals("P")) {
				String ch =st.nextToken();
				leftSt.push(ch.charAt(0));
			}
		}
		
		StringBuilder sb =new StringBuilder();
		
		while(!leftSt.isEmpty()) {
			rightSt.push(leftSt.pop());
		}
		
		while(!rightSt.isEmpty()) {
			sb.append(rightSt.pop());
		}
		
		bw.write(sb.toString());
		br.close();
		bw.close();
		

	}

}
