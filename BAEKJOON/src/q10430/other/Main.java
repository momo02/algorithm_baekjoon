package q10430.other;

import java.util.Scanner;

//문제 : 	(A+B)%C는 (A%C + B%C)%C 와 같을까?
//		(A×B)%C는 (A%C × B%C)%C 와 같을까?
// 		세 수 A, B, C가 주어졌을 때, 위의 네가지 값을 구하는 프로그램을 작성하시오.
//입력 : 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000
//출력 : 첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.
public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
		//System.out.printf("%d\n%d\n%d\n%d\n",(a+b)%c,((a%c)+(b%c))%c,(a*b)%c,(a%c)*(b%c)%c);
		
		// (A+B)%C는 (A%C + B%C)%C 와 같고 
		// (A×B)%C는 (A%C × B%C)%C 와 같음..
		// printf에서 1$는 첫 번째 매개변수를, 2$는  두번째 매개변수를 의미
		System.out.printf("%d\n%1$d\n%d\n%2$d", (a + b) % c, a * b % c);
		
	}
}
