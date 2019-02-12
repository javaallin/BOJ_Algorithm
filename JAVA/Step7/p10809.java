import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
  public static void main(String[] args) throws NumberFormatException, IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String word = br.readLine();
    int[] position = new int[26];
    for(int i = 0 ; i < position.length;i++){
      position[i]=-1;
    }
    for(int i = 0 ;i<word.length();i++){
      int index = (int)word.charAt(i)-97;

      if(position[index]==-1)
        position[index] = i;
    }
    for(int i = 0 ; i < position.length;i++){
        bw.write(position[i]+" ");
    }
    bw.close();
  }
}
