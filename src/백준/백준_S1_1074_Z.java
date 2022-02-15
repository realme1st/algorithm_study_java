package day0215;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_S1_1074_Z {
	static int N,r,c;
	static int size;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		
		N=Integer.parseInt(st.nextToken());
		r=Integer.parseInt(st.nextToken());
		c=Integer.parseInt(st.nextToken());
		
		size = (int) Math.pow(2,N); //가로 세로 길이
		int ans= calc(0,0,size);
		
		bw.write(ans+"\n");
		
		
		br.close();
		bw.close();
		
	}
	
	public static int calc(int nr,int nc,int size) {
		if(size==1) {
			return 0;
		}
		
		if(r<nr+size/2 && c< nc+size/2) { 
			return calc(nr,nc,size/2);	// 2사분면 위치인경우
		}else if(r<nr+size/2 && c<nc+size) {
			return calc(nr,nc+size/2,size/2)+(int) Math.pow(size/2, 2)*1; //1사분면인경우
		}else if(r<nr+size && c <nc+size/2) {
			return calc(nr+size/2,nc,size/2)+(int)Math.pow(size/2, 2)*2; //3사분면
		}else {
			return calc(nr+size/2,nc+size/2,size/2)+(int)Math.pow(size/2, 2)*3;//4사분면
		}
	}
}