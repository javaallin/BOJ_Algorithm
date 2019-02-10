import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main{
  public static void main(String[] args) throws NumberFormatException, IOException{
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    String words = bufferedReader.readLine().trim();
    if(words.equals("")) {
    	bufferedWriter.write("0");

    }else {
    String[] arrWord = words.split(" ");
    bufferedWriter.write(arrWord.length+"");
    }
    bufferedWriter.close();
  }
}
