import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
  public static void main(String[] args) throws NumberFormatException, IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String twoNum = br.readLine();
    int[] num = new int[2];
    num[0]=Integer.parseInt(twoNum.split(" ")[0]);
    num[1]=Integer.parseInt(twoNum.split(" ")[1]);
    int num1 = num[0]%10*100+num[0]/10%10*10+num[0]/100;
    int num2 = num[1]%10*100+num[1]/10%10*10+num[1]/100;
    bw.write(num1>num2?num1+"":num2+"");
    bw.close();
  }
}
