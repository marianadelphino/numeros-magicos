package br.com.b2w.algoritmo;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
public class AlgoritmoNumerosMagicos {

	@SuppressWarnings("finally")
	public static void main(String[] args) throws Exception {

		int contadorQuantidadeNumerosMagicos = 0;
		List<IntervaloAB> lista = new ArrayList<>();

		IntervaloAB intervaloAB1 = new IntervaloAB(1, 20);
		IntervaloAB intervaloAB2 = new IntervaloAB(9, 70);
		IntervaloAB intervaloAB3 = new IntervaloAB(1, 300);

		lista.add(intervaloAB1);
		lista.add(intervaloAB2);
		lista.add(intervaloAB3);
		try {
			for (IntervaloAB intervaloAB : lista) {
				System.out.println(
						"\nINTERVALO " + intervaloAB.getPrimeiroNumero() + " at� " + intervaloAB.getSegundoNumero());
				for (int i = intervaloAB.getPrimeiroNumero(); i <= intervaloAB.getSegundoNumero(); i++) {
					// contadorQuantidadeNumerosMagicos++;
					double numero = Math.sqrt(i) % 1.0f;
					if (numero == 0.0f && i != 1 && numeroPrimo(Math.sqrt(i))) {
						{
							System.out.println("N�mero M�gico: " + i + " - Raiz: " + Math.sqrt(i));
							contadorQuantidadeNumerosMagicos = contadorQuantidadeNumerosMagicos + 1;
						}
					}
				}
				System.out.println("Quantidade de N�meros M�gicos: " + contadorQuantidadeNumerosMagicos);
				contadorQuantidadeNumerosMagicos = 0;
			}

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		} finally {
			throw new Exception("N�o foi poss�vel identificar o n�mero m�gico!");
		}

	}

	public static boolean numeroPrimo(double raizNumero) {
		for (int j = 2; j < raizNumero; j++) {
			if (raizNumero % j == 0)
				return false;
		}
		return true;
	}

}
