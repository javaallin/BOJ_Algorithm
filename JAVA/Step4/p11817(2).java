import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		String numString = bufferedReader.readLine();
		String numStringArray[]=new String[3];
		int secondOfValue = -1;
		int numbers[] = new int[3];
		numStringArray = numString.split(" ");
		numbers[0]= Integer.parseInt(numStringArray[0]);
		numbers[1]= Integer.parseInt(numStringArray[1]);
		numbers[2]= Integer.parseInt(numStringArray[2]);

		if(numbers[0] <= numbers[1] && numbers[0] <= numbers[2]) {
			if(numbers[1]<numbers[2]) {
				 secondOfValue= numbers[1];
			}else {
				secondOfValue= numbers[2];
			}
		}else if(numbers[1] <= numbers[0] && numbers[1] <= numbers[2]) {
			if(numbers[0]<numbers[2]) {
				 secondOfValue= numbers[0];
			}else {
				secondOfValue= numbers[2];
			}
		}else if(numbers[2] <= numbers[1] && numbers[2] <= numbers[0]) {
			if(numbers[0]<numbers[1]) {
				 secondOfValue= numbers[0];
			}else {
				secondOfValue= numbers[1];
			}
		}

		bufferedWriter.write(secondOfValue+"");

		bufferedWriter.close();
	}
}
