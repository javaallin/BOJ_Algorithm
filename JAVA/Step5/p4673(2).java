import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 1 ; i <= 10000;i++) {
			if(isSelfNumber(i)){
				bufferedWriter.write(i+"\n");
			}
		}
		bufferedWriter.flush();
	}

	public static boolean isSelfNumber(int number) {
		for(int i = 0 ; i < number; i ++) {
			if(number==creatNumber(i)) {
				return false;
			}
		}
		return true;
	}

	public static int creatNumber(int number) {
		int createdNumber=number;
		for(int i = createdNumber;i>0;i/=10) {
			createdNumber+=i%10;
		}
		return createdNumber;
	}
}
