import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(bufferedReader.readLine().split(" ")[1]);
		String numberString = bufferedReader.readLine();
		StringTokenizer stringTokenizer = new StringTokenizer(numberString, " ");
		while(stringTokenizer.hasMoreTokens()) {
			int num=Integer.parseInt(stringTokenizer.nextToken());
			bufferedWriter.write(x>num?num+" ":"");
		}
		bufferedWriter.close();
	}
}
