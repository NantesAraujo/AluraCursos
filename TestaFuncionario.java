class TestaFuncionario{
	public static void main(String[] args){

		Funcionario f1 = new Funcionario();
		f1.setRg("1234567899-10");
		f1.setDepartamento("SGI");
		f1.setNome("Danilo");
		f1.setSalario(100);
		f1.setDataEntrada(new Data(31, 2, 2012));

		f1.mostar();
		
	}
}