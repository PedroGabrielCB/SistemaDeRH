package codigos;



public class Funcionario {
	
	private String nome;
	private String cpf;
	private String cargo ;
	private String estado_civil;
	private String data_ferias;
	private double salario ;
	
	
	public Funcionario(String nome,String cpf,String cargo,String estado_civil,String data_ferias, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.estado_civil = estado_civil;
        this.data_ferias = data_ferias;
        this.salario = salario;
}
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getCargo() {
		return cargo;
	}



	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



	public String getEstado_civil() {
		return estado_civil;
	}



	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}



	public String getData_ferias() {
		return data_ferias;
	}



	public void setData_ferias(String data_ferias) {
		this.data_ferias = data_ferias;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public boolean verificar_ferias(String data) {
		
	 int mesInt = Integer.parseInt(data_ferias.substring(3,5));
	 int mesInt_Data = 	Integer.parseInt(data.substring(3,5));
	
	 
	//If verifica se data está pra 3 meses pra menos ou pra mais, caso for verdadeiro ele retorna true, ou seja, ferias aprovada
	 if(mesInt - 3 <= mesInt_Data && mesInt + 3 >= mesInt_Data  ) {
		return true;
	}else {
		return false;
	}
		
	}
	
	public double pagar_ferias() {
		 double valor = this.salario + ( this.salario / 3);
		
		 String result = String.format("%.2f", valor).replace(",", ".");
		 
	     double ValorFinal = Double.parseDouble(result);
	     
		 return ValorFinal;
			
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
	
	public boolean valida_cpf(){

	      
	     
	      
	      this.cpf = removeCaracteresEspeciais(this.cpf); //essa funcão é pra remover pontos ou traço pra nao interferir
	      
	      if ( this.cpf.equals("00000000000") ||  this.cpf.equals("11111111111") ||  this.cpf.equals("22222222222") ||  this.cpf.equals("33333333333") ||  this.cpf.equals("44444444444") ||  this.cpf.equals("55555555555") ||  this.cpf.equals("66666666666") ||  this.cpf.equals("77777777777") ||  this.cpf.equals("88888888888") ||  this.cpf.equals("99999999999") || ( this.cpf.length() != 11))
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
					num = (int) ( this.cpf.charAt(i) - 48);
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
					num = (int) ( this.cpf.charAt(i) - 48);
					soma = soma + (num * peso);
					peso = peso - 1;
				}

				r = 11 - (soma % 11);
				if ((r == 10) || (r == 11))
					dig11 = '0';
				else
					dig11 = (char) (r + 48);

				// Verifica se os digitos calculados conferem com os digitos informados.
				if ((dig10 ==  this.cpf.charAt(9)) && (dig11 ==  this.cpf.charAt(10)))
					return true;
				else
					return false;
			
	   
			}
	
	
	public double penalizar(int nivel_seriedade) {
		
		switch (nivel_seriedade) {
		  case 1: // 10% de penalização
		   
		    return this.salario - (this.salario * 0.1);
		  case 2: // 15% de penalização
			    
			    return this.salario - (this.salario * 0.15);
		  case 3: // 25% de penalização
			    
			    return this.salario - (this.salario * 0.25);
		  case 4: // 40% de penalização
			    
			    return this.salario - (this.salario * 0.40);
		  case 5: // 50% de penalização
			    
			    return this.salario - (this.salario * 0.50);
		}
		
		return 	this.salario;
	}
	
	
	
}
