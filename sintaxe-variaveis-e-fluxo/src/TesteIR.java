
public class TesteIR {

	public static void main(String[] args) {

		double salario = 4444.0;

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("Pode deduzir de IR at� 7.5%");
			System.out.println("valor de R$ 142,00");

		} else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("Pode deduzir de IR at� 15%");
			System.out.println("valor de R$ 350,00");

		} else if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("Pode deduzir de IR at� 22.5%");
			System.out.println("valor de R$ 636,00");
		}
	}
}
