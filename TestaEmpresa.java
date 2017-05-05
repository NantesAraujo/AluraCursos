class TestaEmpresa{
	public static void main(String[] args){
		Empresa empresa = new Empresa();

		empresa.setNome("empresa teste");

		System.out.println("nome empresa: " + empresa.getNome());
		/*empresa.empregados = new Funcionario[10];

		/*for(int i = 0; i < 5; i++){
			Funcionario f1 = new Funcionario();			
			f1.salario = 1000 * i * 100;
						
			empresa.adiciona(f1);
		}


		//empresa.mostraEmpregados();
		//empresa.mostraTodasAsInformacoes();

		Funcionario f1 = new Funcionario();		
		f1.setNome("Thiago Nunes de Araujo");
		f1.setSalario(1000);

		/*Funcionario f2 = new Funcionario();		
		f2.setNome("Carlos de Araujo");
		f2.setSalario(2000);

		empresa.adiciona(f1);
		empresa.mostraEmpregados();
		//empresa.adiciona(f2);

		/*Funcionario f3 = new Funcionario();		
		f3.setNome("Carlos de Araujo");
		f3.setSalario(2000);

		boolean achou = empresa.contem(f3);

		if(achou)
			System.out.println("achou o Funcionario!");
		else
			System.out.println("nao achou o Funcionario!");*/
	}	
}