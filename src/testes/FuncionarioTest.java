package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import codigos.Funcionario;

class FuncionarioTest {

	@Test
	void testVerificaFerias() {
		codigos.Funcionario Funcionario = new Funcionario();
		
		boolean resultado = Funcionario.verificar_ferias("10/06/2022") ;
		boolean esperado = true;
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);

	}

	@Test
	void testVerificaFerias2() {
		codigos.Funcionario Funcionario = new Funcionario();
		
		boolean resultado = Funcionario.verificar_ferias("10/07/2022") ;
		boolean esperado = true;
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);

	}
	
	@Test
	void testVerificaFerias3() {
		codigos.Funcionario Funcionario = new Funcionario();
		
		boolean resultado = Funcionario.verificar_ferias("17/03/2022") ;
		boolean esperado = true;
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);

	}
	
	@Test
	void testVerificaFerias4() {
		codigos.Funcionario Funcionario = new Funcionario();
		
		boolean resultado = Funcionario.verificar_ferias("21/08/2022") ;
		boolean esperado = true;
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);

	}
	
	@Test
	void testVerificaFerias5() {
		codigos.Funcionario Funcionario = new Funcionario();
		
		boolean resultado = Funcionario.verificar_ferias("12/12/2022") ;
		boolean esperado = false;
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);

	}
	
	@Test
	void testPagarFerias() {
		codigos.Funcionario Funcionario = new Funcionario();
		
		double resultado = Funcionario.pagar_ferias() ;
		double esperado = 2000;
		
	
		
		assertTrue(resultado == esperado);
		
		//Como o pagar férias é de um atributo fixo do funcionario que no caso ja foi declarado, acho que não é nescessário mais testes pois o valor sempre vai ser fixo do funcionario
	}
	
	@Test
	void testValidarCPF() {
		codigos.Funcionario Funcionario = new Funcionario();
		
		boolean resultado = Funcionario.valida_cpf("172.090.060-44") ;
		boolean esperado = true;
		
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);
		
		
	}
	
	@Test
	void testValidarCPF2() {
		codigos.Funcionario Funcionario = new Funcionario();
		
		boolean resultado = Funcionario.valida_cpf("564.790.010-01") ;
		boolean esperado = false;
		
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);
		
		
	}
	
	@Test
	void testValidarCPF3() {
		codigos.Funcionario Funcionario = new Funcionario();
		
		boolean resultado = Funcionario.valida_cpf("111.111.111-11") ;
		boolean esperado = false;
		
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);
		
		
	}
	
	@Test
	void testValidarCPF4() {
		codigos.Funcionario Funcionario = new Funcionario();
		
		boolean resultado = Funcionario.valida_cpf("70799456071") ;
		boolean esperado = true;
		
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);
		
		
	}
	
	@Test
	void testValidarCPF5() {
		codigos.Funcionario Funcionario = new Funcionario();
		
		boolean resultado = Funcionario.valida_cpf("22222222222") ;
		boolean esperado = false;
		
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);
		
		
	}
	
	
	@Test
	void testPenalizar() {
		codigos.Funcionario Funcionario = new Funcionario();
		
		double resultado = Funcionario.penalizar(1) ;
		double esperado = 1350;
		
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);
		
		
	}

	@Test
	void testPenalizar2() {
		codigos.Funcionario Funcionario = new Funcionario();
		
		double resultado = Funcionario.penalizar(2) ;
		double esperado = 1275;
		
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);
		
		
	}
	
	@Test
	void testPenalizar3() {
		codigos.Funcionario Funcionario = new Funcionario();
		
		double resultado = Funcionario.penalizar(3) ;
		double esperado = 1125;
		
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);
		
		
	}
	@Test
	void testPenalizar4() {
		codigos.Funcionario Funcionario = new Funcionario();
		
		double resultado = Funcionario.penalizar(4) ;
		double esperado = 900;
		
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);
		
		
	}
	
	@Test
	void testPenalizar5() {
		codigos.Funcionario Funcionario = new Funcionario();
		
		double resultado = Funcionario.penalizar(5) ;
		double esperado = 750;
		
		//System.out.println(resultado);
		
		assertTrue(resultado == esperado);
		
		
	}
}
