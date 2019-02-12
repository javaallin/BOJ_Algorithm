import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int result = 0;
		String s = br.readLine().trim();
		String[] cro = {"c=","c-","dz=","d-","lj","nj","s=","z="};

		for(String a : cro) {
			if(s.contains(a)) {
				s = s.replaceAll(a, "*");
			}
		}
		result = s.length();
		bw.write(result+"");
		bw.close();
	}
}
