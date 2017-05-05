class Empresa {
    Funcionario[] empregados;
    String nome;
    String cnpj;
    int livre = 0;

    public Empresa(){}

    public Empresa(int tamanho){
        this.empregados = new Funcionario[tamanho];
    }

    void adiciona(Funcionario f) {
        this.empregados[this.livre] = f;
        this.livre++;
    }

    void mostraEmpregados() {
        for (int i = 0; i < this.livre; i++) {
            System.out.println("Funcionario na posicao: " + i);
            System.out.println("R$" + this.empregados[i].getSalario());
        }
    }

    void mostraTodasAsInformacoes(){
    	for(int i = 0; i < this.livre; i++){
    		this.empregados[i].mostar();
    	}
    }

   	boolean contem(Funcionario f) {
        for (int i = 0; i < this.livre; i++) {
            if (f == this.empregados[i]) {
            	return true;
        	}
    	}
        return false;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Funcionario getFuncionario(int posicao) {
        return this.empregados[posicao];
    }
}