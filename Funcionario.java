class Funcionario{
private String nome;
private String departamento;
private double salario;
private Data dataEntrada;
private String rg;

	public Funcionario(){}

    public Funcionario(String nome){
        this.nome = nome;
    }

	void recebeAumento(double valor){
	   this.salario += valor;
	}

	double calculaGanhoAnual(){
	    return this.salario * 12;
	}

	void mostar(){		
		System.out.println("Nome: " + (getNome() != null ? getNome()  : ""));
		System.out.println("RG: " + (getRg() != null ? getRg() : ""));
		System.out.println("Salario: " + (getSalario() > 0 ? getSalario() : ""));
		System.out.println("Data banco: " + (getDataEntrada() != null ? getDataEntrada().mostrarData() : ""));
		System.out.println("Departamento: " + (getDepartamento() != null ? getDepartamento() : ""));
		System.out.println("Salario anual: " + this.calculaGanhoAnual());
	}

	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getDepartamento(){
		return this.departamento;
	}

	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}

	public double getSalario(){
		return this.salario;
	}

	public void setSalario(double salario){
		this.salario = salario;
	}

	public Data getDataEntrada(){
		return this.dataEntrada;		
	}

	public void setDataEntrada(Data dataEntrada){
		this.dataEntrada = dataEntrada;
	}

	public String getRg(){
		return this.rg;
	}

	public void setRg(String rg){
		this.rg = rg;
	}
}