import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
  public static void main(String[] args) throws NumberFormatException, IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int sum=0;
    for(int i = 0 ; i < 5 ; i++){
      sum+=Integer.parseInt(br.readLine());
    }
    bw.write(sum/5+"");
    bw.close();
  }
}
