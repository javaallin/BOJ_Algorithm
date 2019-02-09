import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main{
	static String[][] map;
	static int n ;
  // 3x2의10승 X 3x2의10승x2 - 1
  public static void main(String[] args) throws NumberFormatException, IOException{
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    n = Integer.parseInt(bufferedReader.readLine());
    init();
    drawStar(n,n-1,0);
    printStar();
  }

  public static void drawStar(int n, int x, int y){
    if(n==3){
      map[y][x]="*";
      map[y+1][x-1]="*";
      map[y+1][x+1]="*";
      map[y+2][x-2]="*";
      map[y+2][x-1]="*";
      map[y+2][x]="*";
      map[y+2][x+1]="*";
      map[y+2][x+2]="*";
      return;
    }else{
      drawStar(n/2,x,y);
      drawStar(n/2,x-n/2,y+n/2);
      drawStar(n/2,x+n/2,y+n/2);
    }
  }

  public static void printStar() throws IOException{
	BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    for(int i = 0; i < map.length ; i ++){
      for(int j = 0 ; j < map[i].length;j++){
        bufferedWriter.write(map[i][j]);
      }
      bufferedWriter.write("\n");
    }
    bufferedWriter.close();
  }

  public static void init() {
	  map = new String[n][2*n-1];
	  for(int i = 0; i < map.length ; i ++){
	      for(int j = 0 ; j <map[i].length;j++){
	        map[i][j]=" ";
	      }
	    }
  }
}
