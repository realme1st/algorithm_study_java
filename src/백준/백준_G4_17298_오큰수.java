package ch03자료구조;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class 백준_G4_17298_오큰수 {
	static int N;
	static int[] arr;
	static int[] answer;
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		N=Integer.parseInt(br.readLine());
		arr=new int[N];
		answer=new int[N];
		st=new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		Stack<Integer> stack =new Stack<>();
		
		stack.push(0);
		
		for(int i=1;i<N;i++) {
			
			while(!stack.isEmpty() && arr[stack.peek()]<arr[i]) {
				answer[stack.pop()]=arr[i];
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			answer[stack.pop()]=-1;
		}
		
		for(int i=0;i<N;i++) {
			bw.write(answer[i]+" ");
		}
		br.close();
		bw.close();
		
		

	}

}
