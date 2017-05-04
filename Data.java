class Data{
	int dia, mes, ano;

	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String mostrarData(){
		return dia + "/" + mes + "/" + ano;
	}
}