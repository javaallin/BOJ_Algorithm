import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		int n = Integer.parseInt(bufferedReader.readLine());
		for(int i = 1 ; i <= n ; i++) {
			if(isHansoo(i)) {
				count++;
			}
		}
		bufferedWriter.write(count+"");
		bufferedWriter.close();
	}

	public static boolean isHansoo(int number) {
		ArrayList<Integer> arrNumber = new ArrayList();
		int miner =0;
		int temp=0;
		if(number<100) {
			return true;
		}else {
			for(int i = number; i >0;i/=10) {
				arrNumber.add(i%10);
			}
		}
		for(int i = 1; i < arrNumber.size(); i++) {
			temp = arrNumber.get(i-1)-arrNumber.get(i);
			if(i != 1) {
				if(temp != miner) {
					return false;
				}
			}else {
				miner = temp;
			}
		}
		return true;
	}
}
