class Funcionario{
	String nome;
    String departamento;
    double salario;
	Data dataEntrada;
	String rg;

        void recebeAumento(double valor){
            this.salario += valor;
        }
        double calculaGanhoAnual(){
            return this.salario * 12;
        }

	void mostar(){		
		System.out.println("Nome: " + (this.nome != null ? this.nome  : ""));
		System.out.println("RG: " + (this.rg != null ? this.rg : ""));
		System.out.println("Salario: " + (this.salario > 0 ? this.salario : ""));
		System.out.println("Data banco: " + (this.dataEntrada != null ? this.dataEntrada.mostrarData() : ""));
		System.out.println("Departamento: " + (this.departamento != null ? this.departamento : ""));
		System.out.println("Salario anual: " + this.calculaGanhoAnual());
	}
}