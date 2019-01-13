import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String str="";
		Scanner input = new Scanner(System.in);
		while(input.hasNextLine()) {
			str = input.nextLine();
			System.out.println(str);
		}
		input.close();
	}
}
