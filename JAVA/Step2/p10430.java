import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner input = new Scanner(System.in);
		num1 = input.nextInt();
		num2 = input.nextInt();
    num3 = input.nextInt();

		System.out.println((num1+num2)%num3);
		System.out.println((num1%num3 + num2%num3)%num3);
		System.out.println((num1*num2)%num3);
		System.out.println((num1%num3 * num2%num3)%num3);
	}
}
