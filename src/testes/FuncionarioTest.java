package testes;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

import codigos.Funcionario;

class FuncionarioTest {

	@Test
	void testVerificaFerias() {
		codigos.Funcionario Funcionario = new Funcionario("Pedro Gabriel","91841355062","desenvolvedor full stack","solteiro","12/04/2022",2500);
		
		boolean resultado = Funcionario.verificar_ferias("10/06/2022") ;
		boolean esperado = true;
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);

	}

	
	@Test
	void testVerificaFerias2() {
		codigos.Funcionario Funcionario = new Funcionario("Kaique Lucas Diego Nunes","469.664.105-86","marketing","casado","23/01/2022",1500);
		
		boolean resultado = Funcionario.verificar_ferias("10/02/2022") ;
		boolean esperado = true;
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);

	}

	@Test
	void testVerificaFerias3() {
		codigos.Funcionario Funcionario = new Funcionario("Augusto Mário Melo","242.687.910-60","marketing","casado","03/05/2022",2000);
		
		boolean resultado = Funcionario.verificar_ferias("17/03/2022") ;
		boolean esperado = true;
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);

	}
	
	@Test
	void testVerificaFerias4() {
		codigos.Funcionario Funcionario = new Funcionario("Yago Pedro Henrique Manuel Moraes","514.848.058-01","infraestrutura","solteiro","18/02/2022",1700);
		
		boolean resultado = Funcionario.verificar_ferias("21/04/2022") ;
		boolean esperado = true;
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);

	}
	
	@Test
	void testVerificaFerias5() {
		codigos.Funcionario Funcionario = new Funcionario("Elaine Mariah Ferreira","791.653.939-02","RH","solteiro","27/08/2022",2100);
		
		boolean resultado = Funcionario.verificar_ferias("12/12/2022") ;
		boolean esperado = false;
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);

	}
	

	@Test
	void testPagarFerias() {
		codigos.Funcionario Funcionario = new Funcionario("Pedro Gabriel","91841355062","desenvolvedor full stack","solteiro","12/04/2022",2500);
		
		double resultado = Funcionario.pagar_ferias();
		double esperado = 3333.33;
		//System.out.println(resultado);
	
	
		assertTrue(resultado == esperado);
		
	}
	
	@Test
	void testPagarFerias2() {
		codigos.Funcionario Funcionario = new Funcionario("Kaique Lucas Diego Nunes","469.664.105-86","marketing","casado","23/01/2022",1500);
		
		double resultado = Funcionario.pagar_ferias();
		double esperado = 2000;
		//System.out.println(resultado);
	
	
		assertTrue(resultado == esperado);
		
	}
	
	@Test
	void testPagarFerias3() {
		codigos.Funcionario Funcionario = new Funcionario("Augusto Mário Melo","242.687.910-60","marketing","casado","03/05/2022",2000);
		
		double resultado = Funcionario.pagar_ferias();
		double esperado = 2666.67;
		//System.out.println(resultado);
	
	
		assertTrue(resultado == esperado);
		
	}
	
	@Test
	void testPagarFerias4() {
		codigos.Funcionario Funcionario = new Funcionario("Yago Pedro Henrique Manuel Moraes","514.848.058-01","infraestrutura","solteiro","18/02/2022",1700);
		
		double resultado = Funcionario.pagar_ferias();
		double esperado = 2266.67;
		//System.out.println(resultado);
	
	
		assertTrue(resultado == esperado);
		
	}
	
	@Test
	void testPagarFerias5() {
		codigos.Funcionario Funcionario = new Funcionario("Elaine Mariah Ferreira","791.653.939-02","RH","solteiro","27/08/2022",2100);
		
		double resultado = Funcionario.pagar_ferias();
		double esperado = 2800;
		//System.out.println(resultado);
	
	
		assertTrue(resultado == esperado);
		
	}
	
	
	@Test
	void testValidarCPF() {
		codigos.Funcionario Funcionario = new Funcionario("Pedro Gabriel","91841355062","desenvolvedor full stack","solteiro","12/04/2022",2500);

		boolean resultado = Funcionario.valida_cpf() ;
		boolean esperado = true;
		
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);
		
		
	}
	
	@Test
	void testValidarCPF2() {
		codigos.Funcionario Funcionario = new Funcionario("Kaique Lucas Diego Nunes","469.664.105-86","marketing","casado","23/01/2022",1500);
		
		boolean resultado = Funcionario.valida_cpf() ;
		boolean esperado = true;
		
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);
		
		
	}
	
	@Test
	void testValidarCPF3() {
		codigos.Funcionario Funcionario = new Funcionario("Augusto Mário Melo","242.687.910-60","marketing","casado","03/05/2022",2000);
		
		boolean resultado = Funcionario.valida_cpf() ;
		boolean esperado = true;
		
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);
		
		
	}
	
	@Test
	void testValidarCPF4() {
		codigos.Funcionario Funcionario = new Funcionario("Yago Pedro Henrique Manuel Moraes","514.848.058-02","infraestrutura","solteiro","18/02/2022",1700);
		
		boolean resultado = Funcionario.valida_cpf() ;
		boolean esperado = false;
		
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);
		
		
	}
	
	@Test
	void testValidarCPF5() {
		codigos.Funcionario Funcionario = new Funcionario("Elaine Mariah Ferreira","791.653.939-05","RH","solteiro","27/08/2022",2100);
		
		boolean resultado = Funcionario.valida_cpf() ;
		boolean esperado = false;
		
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);
		
		
	}
	
	
	@Test
	void testPenalizar() {
		codigos.Funcionario Funcionario = new Funcionario("Pedro Gabriel","91841355062","desenvolvedor full stack","solteiro","12/04/2022",2500);

		
		double resultado = Funcionario.penalizar(1) ;
		double esperado = 2250;
		
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);
		
		
	}

	@Test
	void testPenalizar2() {
		codigos.Funcionario Funcionario = new Funcionario("Kaique Lucas Diego Nunes","469.664.105-86","marketing","casado","23/01/2022",1500);
		
		double resultado = Funcionario.penalizar(2) ;
		double esperado = 1275;
		
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);
		
		
	}
	
	@Test
	void testPenalizar3() {
		codigos.Funcionario Funcionario = new Funcionario("Augusto Mário Melo","242.687.910-60","marketing","casado","03/05/2022",2000);
		
		double resultado = Funcionario.penalizar(3) ;
		double esperado = 1500;
		
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);
		
		
	}
	
	@Test
	void testPenalizar4() {
		codigos.Funcionario Funcionario = new Funcionario("Yago Pedro Henrique Manuel Moraes","514.848.058-02","infraestrutura","solteiro","18/02/2022",1700);
		
		double resultado = Funcionario.penalizar(4) ;
		double esperado = 1020;
		
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);
		
		
	}

	@Test
	void testPenalizar5() {
		codigos.Funcionario Funcionario = new Funcionario("Elaine Mariah Ferreira","791.653.939-05","RH","solteiro","27/08/2022",2100);
		
		double resultado = Funcionario.penalizar(5) ;
		double esperado = 1050;
		
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);
		
		
	}
}
