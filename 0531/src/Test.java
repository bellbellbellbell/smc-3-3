import java.util.Scanner;
public class Test {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정부와 연산자를 입력하시오>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		char operator = scanner.next().charAt(0);
		switch (operator) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a+b);
			break;
		case '*':
			System.out.println(a+b);
			break;
		}
	}
}
