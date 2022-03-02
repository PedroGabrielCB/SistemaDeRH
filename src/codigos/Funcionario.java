package codigos;



public class Funcionario {
	
	public String nome  = "Caleb Rodrigo da Mota";
	public int id = 4789651;
	public String senha_autenticacao  = "q@JRTXqtRpl#";
	public String registro_ferias= "25/08/2022";

	public int id_ocorrencia;
	public String descricao;
	public int nivel_prioridade;
	
	public String nome_funcionario = "Fabiana Brenda Bernades" ;
	public long cpf = 85499231520L;
	public String cargo = "marketing";
	public String estado_civil = "casada";
	public String data_ferias = "10/06/2022";
	public double salario = 1500;
	
	
	private static final int[] pesoCPF = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
	
	
	public boolean verificar_ferias(String data) {
		
	 String mes = data_ferias.substring(3,5);
	 String mes_data = data.substring(3,5);
	 int mesInt = Integer.parseInt(mes);
	 int mesInt_Data = 	Integer.parseInt(mes_data);
	
	 
	
	 if(mesInt - 3 <= mesInt_Data && mesInt + 3 >= mesInt_Data  ) {
		return true;
	}else {
		return false;
	}
		
	}
	
	public double pagar_ferias() {
		
		return salario + ( salario / 3);
			
	}
	
	private String removeCaracteresEspeciais(String cpf) {
		if (cpf.contains(".")) {
			cpf = cpf.replace(".", "");
		}
		if (cpf.contains("-")) {
			cpf = cpf.replace("-", "");
		}
		return cpf;
	}
	
	public boolean valida_cpf(String cpf){
	      String numeros, digitos ;
	      double resultado;

	     
	      
	      cpf = removeCaracteresEspeciais(cpf); //essa funcão é pra remover pontos ou traço pra nao interferir
	      
	      if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222") || cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555") || cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888") || cpf.equals("99999999999") || (cpf.length() != 11))
				{
	    	  		return false;
				}
	      
	      char dig10, dig11;
		  int soma, i, r, num, peso;
		  
	
				// Calculo do Digito Verificador 1
				soma = 0;
				peso = 10; // o peso se refere a localização do digito verificador 1 no cpf, no caso na decima
				for (i = 0; i < 9; i++) {
					// Loop para ler cada digito do cpf
				       
					// (48 eh a posicao de '0' na tabela ASCII) foi a maneira que achei de converter pra string       
					num = (int) (cpf.charAt(i) - 48);
					soma = soma + (num * peso);
					peso = peso - 1;
				}

				r = 11 - (soma % 11); // Se o resto da divisão for igual a 10, nós o consideramos como 0.
				if ((r == 10))
					dig10 = '0'; 
				else
					dig10 = (char) (r + 48); // converte no respectivo caractere numerico

				
				// Calculo do Digito Verificador 2
				soma = 0;
				peso = 11;
				for (i = 0; i < 10; i++) {
					num = (int) (cpf.charAt(i) - 48);
					soma = soma + (num * peso);
					peso = peso - 1;
				}

				r = 11 - (soma % 11);
				if ((r == 10) || (r == 11))
					dig11 = '0';
				else
					dig11 = (char) (r + 48);

				// Verifica se os digitos calculados conferem com os digitos informados.
				if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10)))
					return true;
				else
					return false;
			
	   
			}
	
	
	public double penalizar(int nivel_seriedade) {
		
		switch (nivel_seriedade) {
		  case 1: // 10% de penalização
		   
		    return salario - (salario * 0.1);
		  case 2: // 15% de penalização
			    
			    return salario - (salario * 0.15);
		  case 3: // 25% de penalização
			    
			    return salario - (salario * 0.25);
		  case 4: // 40% de penalização
			    
			    return salario - (salario * 0.40);
		  case 5: // 50% de penalização
			    
			    return salario - (salario * 0.50);
		}
		
		return 	salario;
	}
	
	
	
}
