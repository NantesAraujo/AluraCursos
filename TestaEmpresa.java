class TestaEmpresa{
	public static void main(String[] args){
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10];

		/*for(int i = 0; i < 5; i++){
			Funcionario f1 = new Funcionario();			
			f1.salario = 1000 * i * 100;
						
			empresa.adiciona(f1);
		}*/


		//empresa.mostraEmpregados();
		//empresa.mostraTodasAsInformacoes();

		Funcionario f1 = new Funcionario();		
		f1.nome = "Thiago Nunes de Araujo";
		f1.salario = 1000;

		Funcionario f2 = new Funcionario();		
		f2.nome = "Carlos de Araujo";
		f2.salario = 2000;

		empresa.adiciona(f1);
		empresa.adiciona(f2);

		Funcionario f3 = new Funcionario();		
		f3.nome = "Carlos de Araujo";
		f3.salario = 2000;

		boolean achou = empresa.contem(f3);

		if(achou)
			System.out.println("achou o Funcionario!");
		else
			System.out.println("nao achou o Funcionario!");
	}	
}