import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int codPeca1, codPeca2, quantPeca1, quantPeca2;
		double valorPeca1, valorPeca2, valorPago;

		codPeca1 = sc.nextInt();
		quantPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();

		codPeca2 = sc.nextInt();
		quantPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();

		valorPago = quantPeca1 * valorPeca1 + quantPeca2 * valorPeca2;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPago);

		sc.close();
	}
}
