import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter (new OutputStreamWriter(System.out));
    int n = Integer.parseInt(bufferedReader.readLine());
    String num;
    for(int i = 0 ; i < n ; i++) {
    	num = bufferedReader.readLine();
    	int blank = num.indexOf(" ");
    	int num1 = Integer.parseInt(num.substring(0, blank));
    	int num2 = Integer.parseInt(num.substring(blank+1));
    	bufferedWriter.write(num1+num2+"\n");
    }
    bufferedWriter.flush();
  }
}
