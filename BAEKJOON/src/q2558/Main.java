package q2558;

import java.util.Scanner;

//문제 : 	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//입력 : 	첫째 줄에 A, 둘째 줄에 B가 주어진다. (0 < A, B < 10)
//출력 : 	첫째 줄에 A+B를 출력한다.
public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println(s.nextInt() +s.nextInt());
		s.close();
	}
}
