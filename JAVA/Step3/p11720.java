import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    input.nextLine();
    String num=input.nextLine();
    int total=0;
    for(int i = 0 ; i < n ; i ++) {
    	total+=num.charAt(i)-'0';
//    	Character.getNumericValue(num.charAt(i));
    }
    System.out.println(total);

  }
}
