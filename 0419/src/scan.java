import java.util.Scanner;
public class scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("1000������ �ڿ��� �Է�");
		int a = scan.nextInt();
		int sum = 0;
		for(int i=1; i<=a; i++) {
			if(i%4==0) {
				System.out.print(i);
				sum+=i;
			}
		}
		System.out.println("4�� ��� ��: " + sum + "�Դϴ�.");
	}

}
