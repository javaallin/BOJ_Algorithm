import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		String number = bufferedReader.readLine();
		if(Integer.parseInt(number)<10) {
			number = "0"+number;
		}
		String newNumber=number;

		int addedNumber=0;
		int cycleLength=0;
		do {
			String numbers[] = newNumber.split("");
			addedNumber = Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]);
			newNumber = Integer.parseInt(numbers[1])+""+addedNumber%10;
			cycleLength++;
		}while(!number.equals(newNumber));
		bufferedWriter.write(cycleLength+"");
		bufferedWriter.close();
	}
}
