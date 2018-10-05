package q11718;

import java.util.Scanner;

//문제 : 	입력 받은 대로 출력하는 프로그램을 작성하시오.
//입력 : 	입력이 주어진다. 
//		입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 
//		각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 
//		또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
//출력 : 	입력받은 그대로 출력한다.
public class Main {
	public static void main(String[] args){
		// 다 입력받은 후에 EOF입력하여 한번에 출력.
//		Scanner sc = new Scanner(System.in);
//		String rs = "";
//		while(sc.hasNextLine()){
//			rs += (sc.nextLine() + "\n");
//		}
//		System.out.println(rs);
//		sc.close();

		// 엔터를 누를때마다 한 줄씩 바로 출력.
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){ //입력된 token이 있으면 true.
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}
