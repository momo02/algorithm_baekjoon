package q1001;

import java.util.Scanner;

//문제 : 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
//입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//출력 : 첫째 줄에 A-B를 출력한다.
public class Main {
	public static void main(String[] args){
		//문자 입력을 인자로 Scanner 생성
		Scanner sc = new Scanner(System.in);
		//nextInt는 정수값을 받아온다 
		System.out.print(sc.nextInt()-sc.nextInt());
		sc.close();
	}
}
