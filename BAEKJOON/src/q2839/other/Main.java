package q2839.other;

import java.util.Scanner;

class Main {
	public static void main(String[] t) {
		int a = new Scanner(System.in).nextInt(), b = a % 5;
		System.out.print(a == 4 || a == 7 ? -1 : b == 0 ? a / 5 : b == 1 || b == 3 ? a / 5 + 1 : a / 5 + 2);
	}
}