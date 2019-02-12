import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine().toUpperCase();
		char r = 0;
		int[] t = new int[26];
		int m = 0;
		for (int i = 0; i < s.length(); i++) {
			int a = ++t[s.charAt(i) - 65];
			if (a == m)
				r = 63;
			else if (a > m) {
				m = a;
				r = s.charAt(i);
			}
		}
		bw.write(r);;
		bw.close();
	}
}
