import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	  String word;
    ArrayList<String> arrListString = new ArrayList<>();
    int n = Integer.parseInt(br.readLine());
    int cnt = n;
    for(int i = 0 ; i < n ; i++){

      word = br.readLine();
      String[] arrString = word.split("");
      for(int j = 0 ; j < arrString.length-1;j++){
        if(!arrListString.contains(arrString[j])){
          arrListString.add(arrString[j]);
        }
        if(!arrString[j].equals(arrString[j+1]) && arrListString.contains(arrString[j+1])){
          cnt--;
          break;
        }
      }
      arrListString.clear();

    }
    bw.write(cnt+"");
		bw.close();
	}
}
