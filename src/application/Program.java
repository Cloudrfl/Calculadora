package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, n, r;

		System.out.println("Digite o tipo de opera��o: ");
		System.out.println("1 - Adi��o");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Multiplica��o");
		System.out.println("4 - Divis�o");
		n = sc.nextInt();

		System.out.println("Digite dois valores: ");
		x = sc.nextInt();
		y = sc.nextInt();

		switch (n) {

		case 1:

			r = x + y;
			System.out.println("Resultado: " + r);
			break;

		case 2:

			r = x - y;
			System.out.println("Resultado: " + r);
			break;

		case 3:

			r = x * y;
			System.out.println("Resultado: " + r);
			break;

		case 4:

			r = x / y;
			System.out.println("Resultado: " + r);
			break;
		}
		
		

	}

}
