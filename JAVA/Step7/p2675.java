import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
  public static void main(String[] args) throws NumberFormatException, IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    for(int i = 0 ; i< n ; i++){
      String text = br.readLine();
      String[] arrText = text.split(" ");
      int r = Integer.parseInt(arrText[0]);
      for(int j = 0; j < arrText[1].length() ; j++){
        for(int k = 0 ; k < r ; k++){
          bw.write(arrText[1].charAt(j)+"");
        }
      }
      bw.write("\n");
    }
    bw.close();
  }
}
