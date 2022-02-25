package for_im;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준_B1_14696_딱지놀이 {
	static int N;
	static int a, b;
	static int a_card[], b_card[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < N; tc++) {
			a_card = new int[5];
			b_card = new int[5];

			st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			for (int i = 0; i < a; i++) {
				a_card[Integer.parseInt(st.nextToken()) - 1]++;
			}
			st = new StringTokenizer(br.readLine(), " ");
			b = Integer.parseInt(st.nextToken());

			for (int i = 0; i < b; i++) {
				b_card[Integer.parseInt(st.nextToken()) - 1]++;
			}

			for (int i = 3; i >= 0; i--) {
				if (a_card[i] > b_card[i]) {
					bw.write('A' + "\n");
					break;
				} else if (a_card[i] < b_card[i]) {
					bw.write('B' + "\n");
					break;
				} else if (i == 0 && a_card[i] == b_card[i]) {
					bw.write('D' + "\n");
					break;
				} else {
					continue;
				}
			}
		}
		br.close();
		bw.close();
	}

}
