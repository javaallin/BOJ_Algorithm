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
		int c = Integer.parseInt(bufferedReader.readLine());
		for(int i = 0 ; i < c ; i++ ) {
			String numberString = bufferedReader.readLine();
			StringTokenizer stringTokenizer = new StringTokenizer(numberString, " ");
			int n = Integer.parseInt(stringTokenizer.nextToken());
			float avg=0;
			int total=0;
			int count=0;
			int scoreArray[] = new int[n];

			while(stringTokenizer.hasMoreTokens()) {
				scoreArray[count]=Integer.parseInt(stringTokenizer.nextToken());
				total+=scoreArray[count++];
			}

			avg = (float)total/n;
			count=0;

			for(int j = 0 ; j < scoreArray.length;j++) {
				if(avg<scoreArray[j]) {
					count++;
				}
			}
			bufferedWriter.write(String.format("%.3f",(float)count/n*100)+"%\n");
		}
		bufferedWriter.close();
	}
}
