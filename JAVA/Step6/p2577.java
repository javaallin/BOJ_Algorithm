import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
  public static void main(String[] args) throws NumberFormatException, IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int num1,num2,num3;
    int[] count = new int[10];
    num1= Integer.parseInt(br.readLine());
    num2= Integer.parseInt(br.readLine());
    num3= Integer.parseInt(br.readLine());
    String[] multipleNumber=(num1*num2*num3+"").split("");
    for(int i = 0 ; i < multipleNumber.length;i++){
      count[Integer.parseInt(multipleNumber[i])]++;
    }
    for(int i = 0 ; i< count.length;i++){
      bw.write(count[i]+"\n");
    }
    bw.close();
  }
}
