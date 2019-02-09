import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		int number =1;
		boolean isNotSelfNumber[]=new boolean[10001];
		while (number <10000) {
			int createdNumber=number;
			for(int i = number++;i>0;i/=10) {
				createdNumber+=i%10;
			}
			if(createdNumber<=10000) {
				isNotSelfNumber[createdNumber]=true;
			}
		}
		for(int i = 1 ; i < isNotSelfNumber.length;i++) {
			if(isNotSelfNumber[i]==false)
				bufferedWriter.write(i+"\n");
		}
		bufferedWriter.flush();
	}
}
