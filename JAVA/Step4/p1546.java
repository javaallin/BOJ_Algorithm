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
		int n = Integer.parseInt(bufferedReader.readLine());
		String numberString = bufferedReader.readLine();
		StringTokenizer stringTokenizer = new StringTokenizer(numberString, " ");
		int scoreArray[] = new int[n];
		int max=0;
		int i=0;
		float total=0;
		while(stringTokenizer.hasMoreTokens()) {
			scoreArray[i]=Integer.parseInt(stringTokenizer.nextToken());
			if(scoreArray[i]>max) {
				max=scoreArray[i];
			}
			i++;
		}
		for (int score : scoreArray){
			total += (float)score/max*100;
		}
		bufferedWriter.write(total/n+"");
		bufferedWriter.close();
	}
}
