import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int month = input.nextInt();
    int days = input.nextInt();
    int maxOfDays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
    String daysOfTheweek[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    for(int i=0;i<month-1;i++) {
    	days+=maxOfDays[i];
    }
    System.out.println(daysOfTheweek[days%7]);
  }
}
