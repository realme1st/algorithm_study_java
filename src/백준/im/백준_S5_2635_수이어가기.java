package for_im;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class 백준_S5_2635_수이어가기 {
	static int N;
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N=Integer.parseInt(br.readLine());
		
		ArrayList<Integer>list = new ArrayList<>();
		
		ArrayList<Integer> result = new ArrayList<>();
		int max=0;
		list.add(N);
		for(int i=N;i>0;i--) {
			list.add(i);
			int index=2;
			while(true) {
				int temp=list.get(index-2)-list.get(index++-1);
				if( temp<0)
					break;
				list.add(temp);
			}
		
		
			if(list.size()>max) {
				max=list.size();
				result=new ArrayList<>(list);
			}
		
			list.clear();
			list.add(N);
		}

		sb.append(max).append("\n");
		for(int n :result) {
			sb.append(n +" ");
		}
		System.out.println(sb);
	}
}
