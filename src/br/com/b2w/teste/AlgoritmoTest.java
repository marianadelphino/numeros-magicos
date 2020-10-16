package br.com.b2w.teste;

import org.junit.Test;

public class AlgoritmoTest {
	
	@Test
	public boolean numeroPrimoTest() {
		for (int j = 2; j < 17; j++) {
			if (17 % j == 0)
				return false;
		}
		return true;
	}

}
