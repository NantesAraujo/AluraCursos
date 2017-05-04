class TestaFuncionario{
	public static void main(String[] args){

		Funcionario f1 = new Funcionario();
		f1.rg = "1234567899-10";
		f1.departamento = "SGI";
		f1.nome = "Danilo";
		f1.salario = 100;
		f1.dataEntrada = new Data(2, 5, 2017);

		Funcionario f2 = new Funcionario();
		f2.rg = "1234567899-10";
		f2.departamento = "SANASUL";
		f2.nome = "Carlos de Souza";
		f2.salario = 500;
		f2.dataEntrada = new Data(2, 5, 2017);

		Empresa empresa = new Empresa();
		//empresa.funcionarios = new Funcionario[10];

		empresa.adiciona(f1);
		empresa.adiciona(f2);

		//empresa.listar();
		
	}
}