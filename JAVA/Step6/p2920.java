import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
  public static void main(String[] args) throws NumberFormatException, IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String scale = br.readLine();
    String[] arrScale = scale.split(" ");
    int gap = 0;
    int checkValue=0;
    for(int i = 1 ; i < arrScale.length; i++){
        gap = Integer.parseInt(arrScale[i])-Integer.parseInt(arrScale[i-1]);

        if(gap != -1 && gap != 1){
          bw.write("mixed");
          bw.close();
          return;
        }
    }
    if(gap==1){
        bw.write("ascending");
    }else{
        bw.write("descending");
    }
      bw.close();
  }
}
