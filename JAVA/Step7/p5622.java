import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
  public static void main(String[] args) throws NumberFormatException, IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[][] dial = {{"A","B","C"},{"D","E","F"},{"G","H","I"},{"J","K","L"},{"M","N","O"},{"P","Q","R","S"},{"T","U","V"},{"W","X","Y","Z"}};
    String word  = br.readLine();
    int time = 0;
    for(int i = 0 ; i<word.length();i++) {
    	for(int j = 0; j < dial.length;j++) {
    		for(int k = 0 ; k < dial[j].length;k++) {
    			if(dial[j][k].equals(word.charAt(i)+"")) {
    				time+=j+3;
    				break;
    			}
    		}
    	}
    }
    bw.write(time+"");
    bw.close();
  }
}
