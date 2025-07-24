import java.util.Scanner;

public class Calculator {
	public static double performOperation(double num1, double num2, char operator) {
		
		double result = 0.0;
		
		switch = {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				if(num != 0) {
					result = num1 / num2;
				}
				else {
					System.out.println("0으로 나눌 수 없습니다.");
				}
				break;
			default;
				System.out.println("올바른 연산자를 입력하세요.");
				
		}
		return result;
	}
	
	public static void main(String[] args) {
		
	}
}